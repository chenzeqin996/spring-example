package springAOPTransation.aop.service;

import springAOPTransation.aop.dao.AccountDao;


public class AccountServiceImpl implements AccountService{
	private AccountDao accountDao;
	
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void transfer(final String outer, final String inner, final int money) {
		accountDao.out(outer, money);
        //int i = 1/0;
        accountDao.in(inner, money);
    }
}
