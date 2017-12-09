package kr.ac.hansung.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.ac.hansung.model.Division;
import kr.ac.hansung.model.Info;
import kr.ac.hansung.model.Semester;
import kr.ac.hansung.service.InfoService;


@Controller
public class InfoController {
	
	@Autowired
	private InfoService infoService;
	
	@RequestMapping("/currentinfo")
	public String showInfo(Model model) {
		List<Info> currentinfo=infoService.getCurrentInfo();

		model.addAttribute("currentinfo", currentinfo);
		
		return "currentinfo";
	}
	
	//create form 으로 offer()빈객체 생성한것을 보내주기 위한 method.
	@RequestMapping("/createinfo")
	public String createInfo(Model model) {
		
		model.addAttribute("information", new Info());
		
		return "createinfo";
	}
	
	@RequestMapping("/docreate")
	public String doCreate(Model model, @Valid Info info, BindingResult result) {
		
		if(result.hasErrors()) {
			System.out.println("===Form data does not validated");
			List<ObjectError> errors = result.getAllErrors();
			
			for(ObjectError error:errors) {
				System.out.println(error.getDefaultMessage());
			}
			
			return "createinfo";
		}
		
		infoService.registerCourse(info);
		
		return "infocreated";
	}
	
	@RequestMapping("/menu")
	public String menu() {
		return "menu";
	}
	
	@RequestMapping("/totalinfo")
	public String totalInfo(Model model) {
		List<Info> totalinfo = infoService.getCurrent();
		model.addAttribute("totalinfo", totalinfo);
		
		return "totalinfo";
	}
	
	@RequestMapping("/semesterinfo")
	public String semesterInfo(Model model) {
		int semesterCredit[] = new int[3];
		Semester semester1 = new Semester();
		Semester semester2 = new Semester();
		Semester semester3 = new Semester();
		List<Info> semesterInfo1 = infoService.getSemesterInfo(2017, 1);
		List<Info> semesterInfo2 = infoService.getSemesterInfo(2017, 2);
		List<Info> semesterInfo3 = infoService.getSemesterInfo(2018, 1);

		for(int i=0; i<semesterInfo1.size(); i++) {
			semesterCredit[0] += semesterInfo1.get(i).getCredit();
		}
		
		semester1.setCredit(semesterCredit[0]);
		semester1.setYear(semesterInfo1.get(0).getYear());
		semester1.setSemester(semesterInfo1.get(0).getSemester());
		
		for(int i=0; i<semesterInfo2.size(); i++) {
			semesterCredit[1] += semesterInfo2.get(i).getCredit();
		}
		
		semester2.setCredit(semesterCredit[1]);
		semester2.setYear(semesterInfo2.get(0).getYear());
		semester2.setSemester(semesterInfo2.get(0).getSemester());
		
		for(int i=0; i<semesterInfo3.size(); i++) {
			semesterCredit[2] += semesterInfo3.get(i).getCredit();
		}
		
		semester3.setCredit(semesterCredit[2]);
		semester3.setYear(semesterInfo3.get(0).getYear());
		semester3.setSemester(semesterInfo3.get(0).getSemester());
		
		model.addAttribute("semester1", semester1);
		model.addAttribute("semester2", semester2);
		model.addAttribute("semester3", semester3);
		
		
		
		return "semesterinfo";
	}
	
	@RequestMapping("/totalinfo/2017/1")
	public String concretesemesterInfo1(Model model) {
		List<Info> semesterInfo1 = infoService.getSemesterInfo(2017, 1);

		model.addAttribute("semester", semesterInfo1);
		
		return "concretesemesterinfo1";
	}
	
	@RequestMapping("/totalinfo/2017/2")
	public String concretesemesterInfo2(Model model) {
		List<Info> semesterInfo2 = infoService.getSemesterInfo(2017, 2);

		model.addAttribute("semester", semesterInfo2);
		
		return "concretesemesterinfo2";
	}
	
	@RequestMapping("/totalinfo/2018/1")
	public String concretesemesterInfo3(Model model) {
		List<Info> semesterInfo3 = infoService.getSemesterInfo(2018, 1);

		model.addAttribute("semester", semesterInfo3);
		
		return "concretesemesterinfo3";
	}
	
	@RequestMapping("/divisioninfo")
	public String divisionInfo(Model model) {
		int divisionInfo[] = infoService.getDivisionInfo();
		Division divisioninfo = new Division();
		divisioninfo.setDivision1(divisionInfo[0]);
		divisioninfo.setDivision2(divisionInfo[1]);
		divisioninfo.setDivision3(divisionInfo[2]);
		divisioninfo.setDivision4(divisionInfo[3]);
		divisioninfo.setDivision5(divisionInfo[4]);
		divisioninfo.setTotal(divisionInfo[5]);
		model.addAttribute("divisioninfo", divisioninfo);
		
		return "divisioninfo";
	}
}
