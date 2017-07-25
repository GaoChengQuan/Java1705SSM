package com.situ.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.situ.ssm.pojo.Student;
import com.situ.ssm.service.IStudentService;


@Controller
@RequestMapping(value="/student")
public class StudentController {
	
	@Resource(name="studentService")
	private IStudentService studentService;
	
	@RequestMapping(value="/list")
	public String list(Model model) {
		List<Student> list = studentService.findAll();
		model.addAttribute("list", list);
		return "student_list";
	}
	
	@RequestMapping(value="/delete")
	public String delete(int id) {
		studentService.deleteById(id);
		return "redirect:/student/list.action";
	}
}
