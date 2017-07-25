package com.situ.ssm.test;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.situ.ssm.mapper.StudentMapper;
import com.situ.ssm.pojo.Student;
import com.situ.ssm.pojo.StudentExample;
import com.situ.ssm.pojo.StudentExample.Criteria;

//帮助我们创建IOC容器
@RunWith(SpringJUnit4ClassRunner.class)
//指定IOC容器使用的配置文件 
@ContextConfiguration("classpath:applicationContext.xml")
public class MyBatisTest {
	@Resource(name="studentMapper")
	private StudentMapper studentMapper;
	
	@Test
	public void test1() {
		StudentExample studentExample = new StudentExample();
		//order by age asc
		studentExample.setOrderByClause("age asc");
		Criteria criteria = studentExample.createCriteria();
		criteria.andAgeBetween(32, 50)/*.andGenderEqualTo("男")*/;
		List<Student> list = studentMapper.selectByExample(studentExample);
		for (Student student : list) {
			System.out.println(student);
		}
		System.out.println("count: " + studentMapper.countByExample(studentExample));;
	}
	
	@Test
	public void test2() {
		StudentExample studentExample = new StudentExample();
		Criteria criteria = studentExample.createCriteria();
		criteria.andNameLike("%" + 4 + "%");
		Student student = new Student();
		student.setPassword("123");
		studentMapper.updateByExampleSelective(student, studentExample);
	}
	

}
