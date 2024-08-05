package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Coffee;
// default 접근 제한자 클래스는
//   다른 패키지에 존재할 경우 가져다가 쓸 수 없음
//   단, 같은 패키지에 존재할 경우 사용 가능

public class Run {

	public static void main(String[] args) {

		// Coffee 라는 클래스
		// == 내가 만든 클래스(커피 정보를 담을 용도)
		// == 커피명(String), 가격(int), 옵션(char), 사이즈(char)
		// 한번에 String, int, char, char를 다 담을 수 있는
		// "배열같은" 자료형
		// > 클래스 == 사용자 정의 자료형
		
		
		// Coffee 클래스를 이용해서 객체 생성
		// 클래스명 객체명 = new 클래스명();
		// 자료형 변수명 = 값;
		// > 클래스 == 참조자료형, 객체 == 참조자료형변수
		
		
		
		Coffee c = new Coffee();
		// null, 0, '', '' 값을 초기화한 상태에서의 값들
		// > heap 영역은 비어있을 수 없어서 jvm 이 기본값으로 초기화
		System.out.println(c.information());
		// 값 넣기
		// cf.coffeeName = "아메리카노"
		// > 캡슐화를 했기 때문에 직접 접근불가 (is not visible)
		// setter 메소드를 통해 간접적으로 값을 대입
		c.setCoffeeName("아메리카노");
		c.setPrice(2000);
		c.setOption('h');
		c.setSize('s');
		
		// 다시 한번 출력
		System.out.println(c.information());
		// 객체 생성 == 인스턴스화
		// 객체 == 인스턴스
		Coffee c2 = new Coffee();
		
		// 값넣기
		c2.setCoffeeName("라떼");
		c2.setPrice(3000);
		c2.setOption('c');
		c2.setSize('M');
		
		
		// 출력
		System.out.println(c2.information());
		
		System.out.println("-----");
		System.out.println(c);
		System.out.println(c2);
		// > 해시코드 출력
		
		Coffee c3 = c;
		// > "아메리카노", 2000, 'h', 's';
		System.out.println(c3.information());
		System.out.println(c);
		System.out.println(c3);
		// > 얕은 복사
		
		c3.setCoffeeName("콜드브루");
		c3.setOption('C');
		
		System.out.println(c3.information());
		System.out.println(c.information()); // 아메리카노..?
		// > 얕은 복사가 되었기 때문에 값이 변경되었음!! (콜드브루)
	}

}
