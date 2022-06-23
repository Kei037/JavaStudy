package com.varxyz.jv250.banking;
/**
 * 서버 생성, dao를 계속 생성해야함
 * @author Administrator
 *
 */
public class CommonDao {
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
	private static final String JDBC_USER = "jv250";
	private static final String JDBC_PASSWORED = "jv250";
	
	public CommonDao() {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("LOADED DRIVER ---> " + JDBC_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	
}
