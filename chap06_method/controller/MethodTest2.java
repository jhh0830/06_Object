package com.kh.chap06_method.controller;


//static
public class MethodTest2 {
	
	public static void method1() {
		
		System.out.println("�Ű������� ��ȯ���� ���� �޼ҵ�");
		
	}
	public static String method2() {
		return "�Ű������� ������ ��ȯ���� �ִ� �޼ҵ�";
		
	}
	public static void method3(String name, int age) {
		
		System.out.println(age + "���� " +name+"�� ȯ���մϴ�.");
	}
	
	public static int method4(int num1, int num2) {
		
		
		return num1 + num2;
	}
}

