package springTransation.service;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;
import springTransation.dao.AccountDao;


public class AccountServiceImpl implements AccountService{
	private AccountDao accountDao;
	private TransactionTemplate transactionTemplate;
	
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }
    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }
    
    public void transfer(final String outer, final String inner, final int money) {
    	transactionTemplate.execute(new TransactionCallback() {
			public Object doInTransaction(TransactionStatus arg0) {
				accountDao.out(outer, money);
		        //int i = 1/0;
		        accountDao.in(inner, money);
				return null;
			}
		});
       
    }
}
