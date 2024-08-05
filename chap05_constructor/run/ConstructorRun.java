package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		// 생성자 호출
		// new User(); 
		// 1. 기본생성자로 객체 생성 시
		User u1 = new User();	
		
		// 2. 매개변수생성자로 객체 생성 시 (매개변수 3개짜리)
		User u2 = new User("user02", "pass02","김말똥");
		
		
		System.out.println(u1.information());
		// > 기본생성자로 객체 생성 시
		//   각 필드값은 각 타입에 맞는 "기본값" 이 들어가 있음
		// null null null 0 ''
		
		System.out.println(u2.information());
		// > 매개변수생성자로 객체 생성 시
		//   매개변수로 셋팅한필드값에 대해서 처음부터 해당 값이 들어가 있음
		// user02 pass02 김말똥 0 
		
		// 기본생성자로 객체 생성시 내가 원하는 값으로 셋팅하려면?
		// > 각 필드에 맞는 setter 메소드를 매번 호출해야함
		
		// 3. 매개변수 생성자로 객체 생성 시 (모든 필드에 대한 매개변수)
		User u3 = new User("user03", "pass03", "박말똥", 20, '여');
		
		
		System.out.println(u3.information());
		// > 모든 필드에 대한 매개변수 생성자를 이용하면 
		// 처음부터 모든 필드에 내가 원하는 값으로 채워진 객체를 생성할 수 있음!!
		// user03 pass03 박말똥 20 여
		
		
		System.out.println("-------------------------");
		
		// u3 만 모든 값이 제대로 채워져 있고,
		// u1, u2 객체는 필드에 값이 제대로 채워져 있지 않는 상황
		// > setter 메소드 활용
		
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setName("강말똥");
		u1.setAge(30);
		u1.setGender('남');
		System.out.println(u1.information());
		
		u2.setAge(40);
		u2.setGender('여');
		System.out.println(u2.information());
		
		// >매개변수 생성자를 잘 활용하면
		// 객체 생성 시 매번 setter 메소드를 호출할 필요가없다.
		
		// > 그럼 setter 메소드를 안만들어도 되는 것 아니냐?
		// 전혀..
		
		// u3 객체에 대한 회원이 비밀번호를 변경하고 싶다면?
		u3.setUserPwd("Password03!");
		System.out.println(u3.information());
		
		// u1 객체에 대한 회원에 이름을 개명했다면?
		u1.setName("강말순");
		System.out.println(u1.information());
		
		// > 작업 중 일부 필드값만 수정할 일이 자주 발생하기 때문에
		//   setter 메소드 또한 무조건 만들어야함
		
	}

}
