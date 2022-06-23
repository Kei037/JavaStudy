package com.varxyz.jv250.banking;
/**
 * 서버 생성, dao를 계속 생성해야함
 * @author Administrator
 *
 */
public abstract class CommonDao {
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
	private static final String JDBC_USER = "jv250";
	private static final String JDBC_PASSWORED = "jv250";
	
	String sql = "INSERT INTO Account (accountNum, balance, interestRate, overdraft, accountType, customerId)"
			 + " VALUES (?, ?, ?, ?, ?, ?)";
	
	String sql2 = "SELECT a.aid, a.accountNum, a.balance, a.interestRate, "
			+ " a.overdraft, a.accountType, c.name, c.ssn, c.phone, a.regDate" //약칭 AS accountAid
			+ " FROM Account a INNER JOIN Customer c ON a.customerId = c.cid"
			+ " WHERE c.ssn = ?";
	
	public CommonDao() {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("LOADED DRIVER ---> " + JDBC_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
