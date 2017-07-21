package com.situ.ssm.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.situ.ssm.service.IAccountService;

//帮助我们创建IOC容器
@RunWith(SpringJUnit4ClassRunner.class)
//指定IOC容器使用的配置文件 
@ContextConfiguration("classpath:applicationContext.xml")
public class AccountTest {
	@Resource(name="accountService")
	private IAccountService accountService;
	
	@Test
	public void testTransfer() {
		accountService.transfer(1, 2, 200);
	}

}
