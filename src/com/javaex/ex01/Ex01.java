package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		Object obj = new Object();
		System.out.println(obj.getClass()); //클래스 정보
		System.out.println(obj.hashCode()); //일단 주소라고 알고있자
		System.out.println(obj.toString()); //java.lang.Object@515f550a
		System.out.println("============================================");
		
		System.out.println("obj.getClass()===============================");
		System.out.println(obj.getClass());
		
		System.out.println("Obj.hashCode()==============================");
		System.out.println(obj.hashCode());
		
		
	}

}
