package com.kh.chap01_abstraction.model.vo;

/*
 * * 자바 클래스의 구조
 * 
 * public class 클래스명 {
 * 
 * 
 * 		// 필드부
 *      // "필드" 들이 모여있는 부분
 *      
 *      // 생성자부
 *      // "생성자" 들이 모여있는 부분
 *      
 *      // 메소드부
 * 		// "메소드" 들이 모여있는 부분
 * 		
 * 
 * }
 * 
 */


// 학생들을 추상화해서 만든 클래스
// > 이름, 나이, 키 
public class Student {
		
	//  [ 필드부 ]
	// "필드" 들이 모여있는 부분
	// 필드 == 변수 == 멤버변수 == 인스턴스변수
	// 접근제한자(이부분을때고 생각해보면 간단함) 자료형 변수명;
	
	// > 접근제한자 : 이 필드에 접근할 수 있는 범위를 제한을 걸 수 있음
	// public > protected > default > private
	// 클래스 영역 안에서 필드를 선언할 때 반드시 접근제한자를 써야 함!!
	
	public String name;
	public int age;
	public double height;
	
	
	
	// [ 생성자부 ]
	
	// [ 메소드부 ]
	
    

}
