package com.kh.chap02_encapsulation.model.vo;

// 캡슐화 과정까지 완료한 클래스
public class Student {

	// [ 필드부 ] 
	// 접근제한자 (예약어) 자료형 필드명;
	private String name;
	private int age;
	private double height;
	
	
	
	// [ 생성자부 ]
	
	
	// [ 메소드부 ]
	// "메소드" 들 이 모여있는 부분
	
	/*
	 * * 메소드 : 각각의 기능을 담당하는 개념
	 * 
	 * [ 표현법 ]
	 * 접근제한자 반환형 메소드명(매개변수=> 생략 가능) {
	 * 
	 * 		실행할 코드;
	 * 
	 * }
	 * 
	 * 
	 */
	// 간접적으로나마 데이터를 기록 및 수정하는 용도의 메소드
	// setter 메소드
	

	
	// 이름값을 기록 및 수정 할 수 있는 기능의 메소드 (name필드의 값을 대입)
	
	
	/*
	 * * setter 메소드 작성 공식
	 * 
	 * [ 표현법 ]
	 * 
	 * public void set필드명(해당필드의자료형 해당필드명){
	 * 		
	 * 		this.필드명 = 해당필드명;
	 *      
	 * 
	 * }
	 * 
	 * > "set필드명" 메소드명은 낙타표기법을 지켜야함!!
	 * > 매개변수의 이름ㅇ느 해당필드명과 "동일"하게 맞춰준다!!
	 * > 매개변수명과 필드명이 일치하면 매개변수명이 더 우선순위가 높기 때문에
	 * "필드로써의" 의미를 부여하려면 앞에 this.을 작성한다!!
	 * (매개변수도 일종의 지역변수로 취급되기 때문)
	 * 
	 * 
	 */
	
	
	//name 필드에 대한 setter 메소드
	public void setName(String name) {
		
		this.name = name;
	}
	// age 필드에 대한 setter 메소드
	public void setAge(int age) {
		this.age = age;
	}
	
	// height 필드에 대한 setter 메소드
	public void setHeight(double height) {
		this.height = height;
	}
	
	/*
	 * * getter 메소드 작성 공식
	 * [ 표현법 ]
	 * 
	 *  public 해당필드의자료형 get필드명(){
	 *  
	 *  	return 필드명; //값을 대리고 태초마을로 돌아감
	 *  
	 * }
	 * 
	 * > "get필드명" 메소드명은 낙타표기법을 지켜야한다!!
	 * > 반환형은 해당 필드값의 자료형, 반환값을 필드에 들어있는값이 된다!!
	 * 
	 * > setter든 getter든 간에
	 *   모두 "필드마다 한개씩" 다 만들어 줘야 함!!
	 *   즉 필드가 10개다 setter 10개, getter 10개
	 *   
	 * > setter 든 getter 든 간에
	 *   외부에서 호출이 가능해야 하기 때문에 public 임!!
	 *  
	 * 
	 */
	
	// name 필드에 대한 getter 메소드
	public String getName() {
		return name;
	}
	// age 필드에 대한 getter 메소드
	public int getAge() {
		return age;
	}
	
	// height 필드에 대한 getter 메소드
	public double getHeight() {
		return height;
	}
	
	// 여기까지가 캡슐화 관련 메소드 6개
	// 추가적으로 더 필요하다면 메소드를 더 만들어서 써도 됨!!
	
	//모든 필드값을 하나의 문자열로 연이어서 돌려주는 용도의 메소드
	public String infromation() {
		
		// return name, age , height;
		// > 결과값은 항상 반드시 한개뿐이여야만 한다!!
		//return name+age+height; // "홍길동20168.7"
		return name + " 님의 나이는 " + 
		age + " 살이고, 키는 " +
		height + " cm 입니다. ";
	}
	
}
