package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {
		/*
		// 1. FieldTest1
		FieldTest1 f1 = new FieldTest1();
		// >객체 생성 ㅅ global 멤버변수가 생성 (할당)
		
		
		f1.test(10);
		
		//System.out.println(local);
		//System.out.println(num);
		// > test 메소드의 지역변수인 local, num은
		//   이미 소멸되었기 때문에 이시점에서부터는 더이상 쓸 수 없음
		
		//System.out.println(f1.global);
		// > global 변수는 아직 소멸되지 않았음!!
		//  단, private으로 숨겨놔서 접근 불가인 상황!!
		
		// global 도 소멸시키고 싶다면?
		f1 = null;
		// > 이 시점 기준으로 소멸 된다고 보면 됨
		
		// System.out.println(f1.global);
		// > 접근이 이제 절대 불가함 (NullPointerException 발생)
	*/
		
		// ---------------------------------
		
		//2. FieldTest2
		/*
		FieldTest2 f2 = new FieldTest2();
		// > 총 4개의 멤버변수가 생성되었음
		
		//public : 어디서든 항상 직접 접근 가능
		System.out.println(f2.pub);
		
		// protected : 같은 패키지에서는 직접접근 가능,
					 //다른 패키지에서는 직접접근 불가 (단, 상송관계는 가능)
		//System.out.println(f2.pro);// is not visible
		
		// default : 같은 패키지에서는 직접접근 가능,
		           //다른 패키지에서는 직접접근 불가
		// System.out.println(f2.df); //is not visible
		
		// private : 해당 클래스 영역 안에서만 접근 가능
		// System.out.println(f2.pri); //in not visible
		*/
		//-----------------------------------
		// 3. FieldTest3
		
		System.out.println(FieldTest3.sta);
		// > 객체 생성을 안할 뿐 그냥 가져다 쓸 수 있다.
		
		System.out.println(FieldTest2.sta);
		// > 항상 클래스명.static변수명으로 접근해야함!!
		// static 변수명이 중복될 수 있기 때문에
		// 정확하게 어느 클래스의 변수로 가져다 쓸건지 풀네임으로 기술하기 때문
		
		FieldTest3.test();
		FieldTest2.test();
		// > 메소드도 마찬가지
		// 객체 생성 필요 X, 항상 클래스명.메소드명(); 으로 호출
		
		System.out.println(FieldTest3.NUM);
		
		// 상수필드의 값을 수정해보기
		// FieldTest3.NUM = 11;
		// > 상수필드의 값은 절대 변경 불가함!!
		
		// 그러면 그냥 static 변수는?
		
		FieldTest3.sta = "FieldTest3";
		
		System.out.println(FieldTest3.sta);
		// > 값 변경이 가능함!!
		
		// > static 키워드는 너무 남발해도 좋지 않음
		//   자주, 어디서든지 두고두고 가져다 써야하는 값을
		//   보관할 경우에만 쓰는 것을 권장함
		
		// > static 을 많이 사용하는 예시
		// 자바에서 제공하는 Math 클래스
		// Math : 수학 계산에 특화된 클래스 (관련 상수값들, 계산용 메소드)
		//  > 수학 계산할 일이 빈번하다 보니 필드, 메소드 모두 static으로 만듬
		// (Math 클래스 타입의 객체를 생성할 일이 없음)
		// Math math =new Math();
		// > 아예 처음부터 생성 구문을 못쓰게 private 으로 막아둠!!
		// - 이런 식으로 모든 필드, 메소드를 static으로 만들고
		//   객체 생서 구문 또한 못쓰게 막아둔 코드 패턴을 "싱글톤 패턴" 이라고 함
		
		System.out.println(Math.PI); // 상수 필드
		// 3.141592653589793(원주율)
		
		
		
	}

}
