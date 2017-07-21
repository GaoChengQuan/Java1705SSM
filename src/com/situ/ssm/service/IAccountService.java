package com.situ.ssm.service;


public interface IAccountService {
	/**
	 * 转钱
	 * @param fromAccout 转出账户
	 * @param toAccount 转入账户
	 * @param money 金额
	 */
	public void transfer(int fromAccout,int toAccount, int money);
}
