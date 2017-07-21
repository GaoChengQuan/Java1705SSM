package com.situ.ssm.service;

import java.util.List;

import com.situ.ssm.entity.Student;

public interface IStudentService {
	/**
	 * 查询所有学生信息
	 * @return
	 */
	public List<Student> findAll();
}
