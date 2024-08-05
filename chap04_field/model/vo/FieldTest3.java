package com.kh.chap04_field.model.vo;
// 클래스 변수 (static 변수) 와 상수필드 (static final) 에 대해서 
public class FieldTest3 {
	
	// 필드부 
	
	// * 필드 표현법
	// [ 표현법 ]
	// 접근제한자 (예약어) 자료형 필드명;
	// > 예약어는 생략 가능
	
	public static String sta = "static 변수";
	// > static 예약어가 부는 순간, 클래스변수 (static 변수) 로 취급됨
	// - 생성시점 : 프로그램 시작과 동시에 메모리의 static 영역에 할당됨
	// - 소멸시점 : 프로그램이 종료되는 시점에 같이 소멸됨
	
	// * static 는 "공유" 의 개념이 강함
	// > 프로그램 시작과 동시에 메모리영역에 박스를 만들어두고
	// 두고두고 언제 어디서나 꺼내 쓸 수 있다.
	
	/*
	 * * 상수필드
	 * [ 표현법 ]
	 * public static final 자료형 변수명 = 값;
	 * 
	 * > 한번 지정된 값을 고정해서 공유해가면서 쓰기 때문에
	 *   무조건 초기화까지 같이 해줘야 한다!!
	 * > 단, 예약어의 순서는 상관 없다. final static 도 가능
	 * 
	 * static : 공유의 개념 (재사용)
	 * final : 상수의 개념(값 변화 X)
	 * 
	 * > 값이 변경되서는 안되는 고정적인 값을 메모리 상에
	 *   공유하면서 계속 가져다 쓸 목적
	 * > 상수명은 항상 "대문자"
	 * 
	 * 
	 */
	
	// 상수필드
	public static final int NUM = 10;
	
	
	// 생성자부
	
	
	// 메소드부
	
	public static void test() {
		
		System.out.println("안녕?");
		
	}
	

}
