package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Info;

@Repository
public class InfoDAO {
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "select count(*) from info";
		return jdbcTemplate.queryForObject(sqlStatement, Integer.class);
	}

	public Info getInfo(String name) {
		String sqlStatement = "select * from info where username=?";

		return jdbcTemplate.queryForObject(sqlStatement, new Object[] { name }, new RowMapper<Info>() {

			@Override
			public Info mapRow(ResultSet rs, int rowNum) throws SQLException {
				Info info = new Info();

				info.setYear(rs.getInt("year"));
				info.setSemester(rs.getInt("semester"));
				info.setSubject_code(rs.getString("subject_code"));
				info.setSubject_name(rs.getString("subject_name"));
				info.setDivision(rs.getString("division"));
				info.setCredit(rs.getInt("credit"));

				return info;
			}

		});
	}

	public List<Info> getInfoes() {

		String sqlStatement = "select * from info";

		return jdbcTemplate.query(sqlStatement,

				new RowMapper<Info>() {
					@Override
					public Info mapRow(ResultSet rs, int rowNum) throws SQLException {
						Info info = new Info();

						info.setYear(rs.getInt("year"));
						info.setSemester(rs.getInt("semester"));
						info.setSubject_code(rs.getString("subject_code"));
						info.setSubject_name(rs.getString("subject_name"));
						info.setDivision(rs.getString("division"));
						info.setCredit(rs.getInt("credit"));

						return info;
					}
				});
	}

	public List<Info> getCurrentInfo() {

		String sqlStatement = "select * from info where year=2018";

		return jdbcTemplate.query(sqlStatement,

				new RowMapper<Info>() {
					@Override
					public Info mapRow(ResultSet rs, int rowNum) throws SQLException {
						Info info = new Info();

						info.setYear(rs.getInt("year"));
						info.setSemester(rs.getInt("semester"));
						info.setSubject_code(rs.getString("subject_code"));
						info.setSubject_name(rs.getString("subject_name"));
						info.setDivision(rs.getString("division"));
						info.setCredit(rs.getInt("credit"));

						return info;
					}
				});
	}
	public List<Info> getSemesterInfo(int year, int semester){
		InfoMapper infoMapper = new InfoMapper();
		String sqlStatement = "select * from info where year=" + year + " and semester=" + semester;
		List<Info> semesterInfo = jdbcTemplate.query(sqlStatement, infoMapper);
		
		return semesterInfo;
	}

	// 받아와서 실제로 DB에 insert하는 부분
	public boolean registerCourse(Info info) {
		int year = info.getYear();
		int semester = info.getSemester();
		String subject_code = info.getSubject_code();
		String subject_name = info.getSubject_name();
		String division = info.getDivision();
		int credit = info.getCredit();

		String sqlStatement = "insert into info (year, semester, subject_code, subject_name, division, credit) values (?, ?, ?, ?, ?, ?)";

		// update는 return값이 몇개가 넘어왔는지 갯수로 int 값이넘어옴 ==1이면 성공적, 0이면 false로 넘어감.
		// error핸들링도 필요는할듯.
		return (jdbcTemplate.update(sqlStatement,
				new Object[] { year, semester, subject_code, subject_name, division, credit }) == 1);
	}


	public int[] getDivisionInfo() {
		int divisionInfo[] = new int[6];
		InfoMapper infoMapper = new InfoMapper();
		String sqlStatement;
		List<Info> allInfo;

		// 교필
		sqlStatement = "select * from info where division='교필'";
		allInfo = jdbcTemplate.query(sqlStatement, infoMapper);

		for (int i = 0; i < allInfo.size(); i++) {
			divisionInfo[0] += allInfo.get(i).getCredit();
		}

		// 핵교
		sqlStatement = "select * from info where division='핵교'";
		allInfo = jdbcTemplate.query(sqlStatement, infoMapper);
		for (int i = 0; i < allInfo.size(); i++) {
			divisionInfo[1] += allInfo.get(i).getCredit();
		}
		// 전지
		sqlStatement = "select * from info where division='전지'";
		allInfo = jdbcTemplate.query(sqlStatement, infoMapper);
		for (int i = 0; i < allInfo.size(); i++) {
			divisionInfo[2] += allInfo.get(i).getCredit();
		}

		// 전기
		sqlStatement = "select * from info where division='전기'";
		allInfo = jdbcTemplate.query(sqlStatement, infoMapper);
		for (int i = 0; i < allInfo.size(); i++) {
			divisionInfo[3] += allInfo.get(i).getCredit();
		}

		// 전선
		sqlStatement = "select * from info where division='전선'";
		allInfo = jdbcTemplate.query(sqlStatement, infoMapper);
		for (int i = 0; i < allInfo.size(); i++) {
			divisionInfo[4] += allInfo.get(i).getCredit();
		}
		
		for(int i = 0; i < 5; i++) {
			divisionInfo[5] += divisionInfo[i];
		}
		
		return divisionInfo;
	}

}
