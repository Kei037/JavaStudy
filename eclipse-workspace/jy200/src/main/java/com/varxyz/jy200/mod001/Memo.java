package com.varxyz.jy200.mod001;

public class Memo {
	
/**
 * try {
		예외 발생 가능성이 있는 코드
	}catch ( Exception )   {
		예외발생시 처리할 코드
	}finally {
		예외발생유뮤와 관계없이 처리할 코드
	}
 */
	static String c = "ss";
	public void test() {
		String result = c;
		System.out.println(result);
	}
	
	
	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(a);
		for ( String arg : args ) {
			System.out.println(arg);
		}
		
		Memo m = new Memo();
		m.test();
		
		System.out.println(args.length);
	}
	
}