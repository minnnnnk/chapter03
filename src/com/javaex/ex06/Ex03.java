package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(20);
		
		Short s = new Short((short)3);
		Byte b = new Byte((byte)3);
		
		
		Integer iResult = new Integer(3) + new Integer(5);
		System.out.println(iResult);
		
		Integer no = 3; //박싱 //parseInt를 쓰려면 임의의 숫자를 넣었음 이상함 그래서 static 으로 넣었
		int r01 = no.parseInt("1234");// 문자열을 정수로 바꾸어줌
		System.out.println(r01);
		
		int r02 = Integer.parseInt("12345");
		System.out.println(r02);
		
		Integer no2 = 100; //박싱
		int no3 = no2; //그냥 no2가 담긺 언박싱 문법은 왼쪽걸로 담긺
		
		//정수 --> 문자열
		// 555 -> "555"
		String str = "안녕하세요";
		String str01 = str.valueOf(555);
		System.out.println(str01+1);
		
		String str02 = String.valueOf(555); //정수 -->문자열
		System.out.println(str02);
		
		//정수 --> 문자열
		String str03 = ""+555; //문자열+ 정수 --> 문자열
		
		
		
	}

}
