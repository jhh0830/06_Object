package com.kh.chap06_method.controller;


// 일반 메소드 사용법
public class MethodTest1 {

	/*
	 * * 메소드
	 * 하나의 기능 단위 나타내는 코드 불럭({})
	 * 기능별 메소드를 정의 후 항상 언제든지 호출해서 쓸 수 있다.
	 * - main 메소드 : 프로그램의 시작점을 나타내는 메소드
	 * - 일반메소드 : main 메소드가 아닌 모든 메소드들
	 * 
	 * [ 표현법 ]
	 * 접근제한자 (예약어) 반환값의자료형 메소드명(매개변수 > 생략가능){
	 * 
	 * 		실행할 코드;
	 * 
	 * 		return 반환값; // 반환할값의 자료형이 void 일 경우는 생략
	 * 
	 * }
	 */
	
	// 1. 매개변수가 없고 반환값도 없는 메소드
	public void method1() {
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드 입니다.");
	
		
		// 1부터 10까지의 총 합계를 구하여 출력하는 메소드
		
		int sum = 0;
		for(int i = 1; i < 11; i++) {
			sum +=i; // sum = sum + i;
			
			
		}
		System.out.println("총 합계 : " +sum );
		// return; // void 메소드의 경우 return; 구분이 생략되어있다.
				   // JVM 이 return; 구문을 자동으로 작성해주는 꼴
					
	}
	//2. 매개변수가 없고 반환값은 있는 메소드
	
	public int method2() {
		System.out.println("매개변수는 없고 반환값은 있는 메소드입니다.");
		// 1에서부터 100까지의 랜덤한 정수값을 발생시켜 돌려주는 메소드
		int random  = (int)(Math.random() * 100 +1);
		return random;
	}
	
	//3. 매개변수가 있고 반환값은 없는 메소드
	public void method3(int num1, int num2) {
		
		System.out.println("매개변수가 있고 반환값이 없는 메소드입니다.,");
		
		// num1 과 num2의 값을 비교하여 결과를 출력하는 메소드
		
		// 최소값 : xx
		// 최대값 : xx
		int min = 0; // 두 수중 작은값을 보관할 변수
		int max = 0; // 두 수중 큰값을 보관할 변수
		
		// 비교
		if(num1 > num2) {// num1이 더 큰 경우
			max = num1;
			min = num2;
			
		}else {// num1이 더 크지 않을 경우
			max = num2;
			min = num1;
			
		}
		
		System.out.println("최소값 : "+ min + "\t최대값 : "+ max);
		
	}
	
	//4. 매개변수도 있고 반환값도 있는 메소드
	public int method4(int a, int b) {
		System.out.println("매개변수도 있고 반환값도 있는 메소드 입니다.");
		
		// 두 매개변수 정수값을 곱한 결과값을 돌려주는 메소드
		return  a * b;
		
	
	
	}
}
