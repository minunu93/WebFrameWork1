package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.model.Info;

public class InfoMapper implements RowMapper<Info> { 

    public Info mapRow(ResultSet rs, int rowNum) 
			throws SQLException { 
    	Info info = new Info();				
		
		info.setYear(rs.getInt("year"));
		info.setSemester(rs.getInt("semester"));
		info.setSubject_code(rs.getString("subject_code"));
		info.setSubject_name(rs.getString("subject_name"));
		info.setDivision(rs.getString("division"));
		info.setCredit(rs.getInt("credit"));
		
		return info;
    }
}
