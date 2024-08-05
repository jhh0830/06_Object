package com.kh.chap06_method.controller;


//static
public class MethodTest2 {
	
	public static void method1() {
		
		System.out.println("매개변수와 반환값이 없는 메소드");
		
	}
	public static String method2() {
		return "매개변수는 없지만 반환값은 있는 메소드";
		
	}
	public static void method3(String name, int age) {
		
		System.out.println(age + "살의 " +name+"님 환영합니다.");
	}
	
	public static int method4(int num1, int num2) {
		
		
		return num1 + num2;
	}
}

