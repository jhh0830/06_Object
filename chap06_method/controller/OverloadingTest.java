package com.kh.chap06_method.controller;

// 메소드 "오버로딩" 개념

public class OverloadingTest {
	
	/*
	 * * 메소드 오버로딩
	 * - 한 클래스 내에 "같은 메소드명" 으로 여러개의 메소드를 정의할 수 있는 규칙
	 * 
	 * * 메소드 오버로딩으 성립조건
	 * 1. 메소드명은 동일해야 한다.
	 * 2. 매개변수의 자료형, 갯수, 수서가 하나라도 다르게 작성되어야만 한다.
	 * 3. 단, 매개변수명, 접근제한자 종류, 반환형은 메소드 오버로딩에 영향을 주지 않는다.
	 * 
	 * 
	 */
	
	public void test() {
		
		// 메소드 오버로딩 잘 되어있는 예시
		// 1. 생성자
		// 2. 출력문
		System.out.println("안녕하세요"); //매개변수 1개 (String)
		System.out.println(100); // 매개변수 1개 (int)
		System.out.println(true);// 매개변수 1개 (boolean)
		
		System.out.printf("%d", null); //매개변수 2개 (String, int)
		System.out.printf("%f %d",0.1, 20); // 매개변수 3개 (String, double, int);
		
		
		
		
		
	}
	// 
	public void test(int a) { // 오버로드 성립
		
	}
	public void test(int a, String s) { // 오버로드 성립
		
	}
	public void test(String s, int a) { // 오버로드 성립
		
	}
	
	public void test(int a, int b) {// 오버로드 성립
		
	}
	/*
	public void test(int c, int d) {// 오버로드 성립x
		// 매개변수명만 다르고, 바로 위의 메소드와
		// 매개변수 갯수, 종류, 순서가 모두 일치하기 때문!!
		
	}
	*/
	public void test(int a, int b,String s) {// 오버로드 성립
		
	}
	/*
	public int test(int a, int b,String s) {// 오버로드 성립x
		// 반환형이 다르지만
		// 매개변수의 종류, 갯수, 순서가 모두 일치하기때문
		
		return a+b;
	}
	*/
	
	/*
	private void test(int a, int b, String s) {// 오버로드 성립x
		// 접근제한자가 다르지만
		// 매개변수의 종류, 갯수, 순서가 모두 일치하기 때문
		
	}
	*/
	
}
