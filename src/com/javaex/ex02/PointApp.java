package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		Point p00 = new Point(3,5);
		Point p01 = new Point(3,5);
		Point p02 = new Point(13,15);
		Point p03 = p02;
		
		//System.out.println(p01.getX());
		//Point클래스의 부모로 Object클래스를 자동으로 상속한다.
		//재정렬 하지않으면 그대로 object로 나옴
		
		//클래스 정보
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		
		//인스턴스의 정보
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		
		System.out.println("------------------------------");
		
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		System.out.println("---------------------------");
		
		System.out.println(p01.equals(p02));
		System.out.println(p02.equals(p01));
		
		System.out.println(p03.equals(p01));
		System.out.println(p02.equals(p03));
		
		System.out.println("------------------------");
		System.out.println(p00 == p01);
		System.out.println(p00.equals(p01));
		
	}

}
