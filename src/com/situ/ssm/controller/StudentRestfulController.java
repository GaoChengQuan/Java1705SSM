package com.situ.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.situ.ssm.pojo.Student;
import com.situ.ssm.service.IStudentService;


@Controller
public class StudentRestfulController {
	
	@Resource(name="studentService")
	private IStudentService studentService;
	
	@RequestMapping(value="/stu", method=RequestMethod.GET)
	public @ResponseBody List<Student> list(Student student) {
		System.out.println(student);
		List<Student> list = studentService.findAll();
		return list;
	}
	
	@RequestMapping(value="/stu/{id}", method=RequestMethod.DELETE)
	public @ResponseBody boolean delete(@PathVariable("id") int id) {
		studentService.deleteById(id);
		return true;
	}
	
}
