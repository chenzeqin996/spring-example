package springAOPTransation.aop.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;


public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao{

	/**
     * 根据用户名减少账户金额
     */
    public void out(String outer, int money) {
        this.getJdbcTemplate().update("update account set money = money - "+money+" where username = '" + outer +"'");
    }
 
    /**
     * 根据用户名增加账户金额
     */
    public void in(String inner, int money) {
        this.getJdbcTemplate().update("update account set money = money + "+money+" where username = '"+inner +"'");
    }
}
