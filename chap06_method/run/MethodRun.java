package com.kh.chap06_method.run;

import com.kh.chap06_method.controller.MethodTest1;
import com.kh.chap06_method.controller.MethodTest2;

public class MethodRun {

	public static void main(String[] args) {

		// 1. MethodTest1
		
		MethodTest1 m1 = new MethodTest1();
		m1.method1();
		System.out.println("-----------");
		int  a = m1.method2();
		System.out.println("랜덤값 : "+a);
		// > 그냥 호출구문만 써도 잘 돌아가긴 하지만,
		// 그 돌려받은 반환값을 가지고 후처리 같은 것을 하고싶다면
		// 항상 변수 선언문과 같이 써야 한다.
		
		System.out.println("랜덤값 : "+ m1.method2());
		// > 굳이 변수에 담지 않고
		//   출력문 안에서 돌라받은 반환값을 바로 출력도 가능!!
		
		System.out.println("-----------");
		m1.method3(10, 20);
		System.out.println("-----------");
		//m1.method4(42, 2);
		
		System.out.println("결과 값 : "+m1.method4(42, 2));
		
		// > 반환값이 없는 메소드같은 경우 해당 메소드 처리 결과를
		//   보통 출력까지 하는 역할로 코드를 짠다.
		System.out.println("==========================");
		
		
		// 2. MethodTest2
		
		//MethodTest2 m2 = new MethodTest2();
		// > static 메소드는 객체 생성할 필요 없이
		// 곧바로 클래스명.메소드명() 으로 호출이 가능하다.
		
		MethodTest2.method1();
		System.out.println("--------------");
		System.out.println(MethodTest2.method2());
		System.out.println("--------------");
		MethodTest2.method3("홍길동", 20);
		System.out.println("--------------");
		System.out.println(MethodTest2.method4(10, 9));

	
	
	}

}
