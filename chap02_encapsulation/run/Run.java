package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Book;
import com.kh.chap02_encapsulation.model.vo.Person;
import com.kh.chap02_encapsulation.model.vo.Student;
import com.kh.chap02_encapsulation.model.vo.product;

public class Run {

	
	/*
	 * 7. 캡슐화 과정을 통해 더 완벽한 클래스의 형태를 갖추게 하자.
	 * 
	 * 
	 * - 캡슐화를 하지 않으면 : 외부로부터 직접 접근이 가능하기 때문에
	 * 						함부로 값이 변질되거나 조회가 가능해기제 됨
	 * > 그래서 캡슐화 작업을 반드시 해줘야 함!!
	 *   객체지향 설계 원칙 중 하나가 정보은닉
	 *   정보은닉 기술 중 일부가 "캡슐화"
	 *   
	 *   
	 *   캡슐화 : 데이터의 접근 제한을 윈칙으로 하여
	 *  		 외부로부터 직접 접근을 막자! 라는 컵셉임
	 *          단, 대신에 간접적으로나마 값을처리 (대입, 조회) 할 수 있게끔
	 *          조치는 취해두자!!
	 *          
	 *  1) 정보은닉 단계
	 *  	필드들을 외부로부터 직접 접근을 막기위해
	 *  	public 대신에 private 접근제한자를 사용
	 *  
	 *  
	 *  2) setter / getter 메소드 작성
	 *     간접적으로 나마 접근해서 값을 담거나 (대입하거나, 변경하거나)
	 *     그 값을 가져올 수 있게끔 처리 가능
	 *     값을 담는 용도의 메소드 : setter 메소드
	 *     값을 가져올 수 있는 용도의 메소드 : getter 메소드
	 *     
	 *  
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		// 캡슐화 과정 중 1 단계만 완료한 후의 클래스로
		
		// 객체 생성해보기
		Student hong = new Student();
		/*
		hong.name = "홍길동";
		hong.age = 20;
		hong.height = 168.7
		*/
		// > 클래스명.필드명 is not visible.
		//   각 필드의 접근제한자를 private 으로 설정한다면
		//   직접 접근이 불가능해짐
		
		// > setter 메소드를 통해 간접적으로 접근할 수 있게 하자!!
		
		//hong.setName("홍길동");
		//hong.setAge(20);
		//hong.setHeight(168.7);
		 
		// 각 필드값이 잘 대입됬나 출력해보기
		/*
		System.out.println(hong.name);
		System.out.println(hong.age);
		System.out.println(hong.height);
		*/
		// > is not visible (보이지가 않음)
		// > 값을 조회할 때에도 직접 접근이 불가능하다.
		
		// getter메소드로 각필드값 얻어내기
		// 객체명.메소드명()
		/*
		String name= hong.getName();
		int age = hong.getAge();
		double height = hong.getHeight();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(height);
		*/
		//System.out.println(hong.getName());
		//System.out.println(hong.getAge());
		//System.out.println(hong.getHeight());
		
		// > private 으로 필드의 직접접근을 막고
		// setter / getter 메소드 까지 작성하는걸 캡슐화라고 함
		
		// "xxx님의 나이는 xx살이고, 키는 xxx.xcm 입니다" 형식 출력
		
		//System.out.println(hong.getName()+ "님의 나이는 " +hong.getAge() + " 살이고, 키는 "+hong.getHeight() + " cm 입니다.");
		// > 매번 문자열을 다 연이이서 출력문을 작성하기 귀찮음..
		
		
		// information 메소드를 호출해서 한번에 출력 끝내기
		//System.out.println(hong.infromation());
		
		//-------------------------------------
		
		// 고길동, 24 180.3 학생 객체를 만드시오.
		
		// 고길동 학생의 정보를 출력하시오.
		/*
		Student  go = new Student();
		
		go.setName("고길동");
		go.setAge(24);
		go.setHeight(180.3);
		
		System.out.println(go.infromation());
		*/
		
		
		Book bk = new Book();
		
		bk.setTtile("해리포터");// 책제목 입력
		bk.setPulisher("불름스버리");// 출판사명
		bk.setAuthor("jk롤링");// 저자명
		bk.setPrice(18000);// 가격
		bk.setDiscountRate(0.1); // 책의 할인률
		
		System.out.println(bk.information());
	
			
		Person pr = new Person();
		pr.setId("user01");
		pr.setPwd("pass01");
		pr.setName("김가현");
		pr.setAge(34);
		pr.setGender('F');
		pr.setPhone("010-1111-2222");
		pr.setEmail("gahyun@kh.com");
		System.out.println(pr.information());
		
		
		product pd = new product();
		
		pd.setpName("아이폰13");
		pd.setPrice(1250000);
		pd.setBrand("aplle");
		
	
		}
	 // brand 필드 값의 기본값을 "애플"로 설정해두면
	// (setBrand 메소드를 매번 호출할 필요가 없음)
	
		
	}

