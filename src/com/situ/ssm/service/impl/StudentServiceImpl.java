package com.situ.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.situ.ssm.mapper.StudentMapper;
import com.situ.ssm.pojo.Student;
import com.situ.ssm.pojo.StudentExample;
import com.situ.ssm.service.IStudentService;

@Service("studentService")
public class StudentServiceImpl implements IStudentService{

	@Resource(name="studentMapper")
	private StudentMapper studentMapper;
	
	public List<Student> findAll() {
		return studentMapper.selectByExample(new StudentExample());
	}

	public void deleteById(int id) {
		int result = studentMapper.deleteByPrimaryKey(id);
		System.out.println(result);
	}
}
