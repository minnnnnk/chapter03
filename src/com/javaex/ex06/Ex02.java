package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		//System.out.println(a.concat(b));
		
		a = a.concat(b); // concat은 뒤에있는걸 붙임
		System.out.println(a);
		
		System.out.println(a.trim()); //앞뒤의 공백을 없앰
		System.out.println("__"+a+"__");
		
		a = a.replace("ab", "12"); // 앞에있는게 뒤로 바뀜
		System.out.println(a);
		
		System.out.println("---------------");
		
		String[] sArray = a.split(",");
		for (int i = 0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		
		System.out.println(a);
		
		System.out.println("------------------");
		
		String str = "Hello java!";
		String result = str.substring(3); // 앞에 글자가 사라짐
		System.out.println(result);
		
		String result02 = str.substring(1,7); // 첫번쨰 숫자부터 마지막 숫자까지 하나사라짐
		System.out.println(result02);
		
		char result03 = str.charAt(7); //그 숫자에 맞춰서 하나만 나옴 그리고 char 써야됨
		System.out.println(result03); 
		
		
	}

}
