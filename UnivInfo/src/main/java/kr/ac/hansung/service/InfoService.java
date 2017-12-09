package kr.ac.hansung.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.InfoDAO;
import kr.ac.hansung.model.Info;

@Service
public class InfoService {
	//Service Layer는 DAO를 이용함.
	@Autowired
	private InfoDAO infoDao;
	public List<Info> getCurrent() {
		return infoDao.getInfoes();
	}
	
	public List<Info> getCurrentInfo(){
		return infoDao.getCurrentInfo();
	}
	public void registerCourse(Info info) {
		//DAO에 insert method가 구현되어있기때문에, 실제 sql문을 사용해서 저장하는 method를 만들어놨음. 참고.
		infoDao.registerCourse(info);
		
	}

	public List<Info> getSemesterInfo(int year, int semester) {
		return infoDao.getSemesterInfo(year, semester);
	}

	public int[] getDivisionInfo() {
		return infoDao.getDivisionInfo();
	}

}
