package com.seobcompany.finalexam;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String list(Locale locale, Model model) {
		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat(apache)\\student.db","student");
		model.addAttribute("select_result", dbCommon.selectDataTableTag(new Student()));
		return "list";
	}
	
	@RequestMapping(value = "/search", method = RequestMethod.GET)
	public String search(Locale locale, Model model, @RequestParam("keyword") String keyword) {
		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat(apache)\\student.db","student");
		model.addAttribute("select_result", dbCommon.searchDataTableTag(new Student(), keyword));
		return "list";
	}
	
	@RequestMapping(value = "/input", method = RequestMethod.GET)
	public String input(Locale locale, Model model) {
		return "input";
	}
	
	@RequestMapping(value = "/input_data", method = RequestMethod.GET)
	public String inputData(Locale locale, Model model, @RequestParam("name") String name, @RequestParam("midScore") String midScore, @RequestParam("finalScore") String finalScore) {
// 		********* 1. DBCommon으로 구현 *************
//		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat(apache)\\student.db","student");
//		dbCommon.insertData(new Student(name, midScore, finalScore));
//		return "done";
		
		//************** 2. 기말시험 2번문제 직접 sql문을 사용하여 구현 ***********************
		InsertData insertData = new InsertData();
		insertData.insertDataQuery(name, midScore, finalScore);
		return "done";
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public String update(Locale locale, Model model, @RequestParam("idx") int idx) {
		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat(apache)\\student.db","student");
		model.addAllAttributes(dbCommon.detailsData(new Student(), idx));
		return "update";
	}
	
	@RequestMapping(value = "/update_data", method = RequestMethod.GET)
	public String updateData(Locale locale, Model model, @RequestParam("idx") int idx, @RequestParam("name") String name, @RequestParam("midScore") String midScore, @RequestParam("finalScore") String finalScore) {
		DBCommon<Student> dbCommon = new DBCommon<Student>("c:\\tomcat(apache)\\student.db","student");
		dbCommon.updateData(new Student(name, midScore, finalScore), idx);
		return "done";
	}
}
