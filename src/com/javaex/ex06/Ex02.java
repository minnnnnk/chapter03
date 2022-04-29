package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg");
		
		//System.out.println(a.concat(b));
		
		a = a.concat(b); // concat은 뒤에있는걸 붙임
		System.out.println(a);
		
		System.out.println(a.trim()); //앞뒤의 공백을 없앰
		
	}

}
