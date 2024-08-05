package com.kh.chap05_constructor.model.vo;


// 유저에 정보를 담을 수 있는 VO 클래스
public class User {
	
	// 필드부
	private String userId; // 회원아이디
	private String userPwd; // 회원비밀번호
	private String userName; // 회원명
	private int age; // 나이
	private char gender; // 성별
	
	// 생성자부
	// > "생성자" 들이 모여있는 부분
	
	// * 생성자 (Constructor)
	// 이름이 클래스명과 동일하고, 반환형이 없는 일종의 "메소드" 같은 놈
	// 객체가 생성될 때  (new 구문이 실행될때) 호출되는 메소드이다.
	
	/*
	 * [ 표현법 ]
	 * public 클래스명 (매개변수 > 생략가능 ) {
	 * 
	 *   실행할코드;
	 * }
	 * 
	 * * 생성자를 작성하는 목적
	 * 1. 객체를 생성해주기 위한 목적 (기본생성자)
	 * 2. 객체를 생성하는것 뿐만 아니라
	 *    매개변수로 전달된 값을 곧바로 필드에 "초기화" 할 목적
	 *    (매개변수생성자)
	 *    
	 *    
	 * * 생성자 작성 시 주의 사항
	 * 1. 반드시 클래스명과 동일해야 함!! 
	 * 2. 반환형이 존재하지 않는다. (메소드와 비슷하게 생기긴 함, 주의)
	 * 3. 여러개 작성이 가능하지만,  
	 * 		매개변수가 중복되면 안된다. (이름은 중복되더라도)
	 * 4. 매개변수 생성자를 하나라도 명시적으로 작성하게되면
	 * 		JVM이 기본생성자를자동으로 만들어주지않는다.
	 * 		 >기본생성자는 어찌되었든 간에 직접 작성하자!!
	 * 
	 */

	// 제일 기본적인 형식의 생성자 만들어 보기 (매개변수 없이)
	// > '기본 생성자" : 매개변수가 없는 생성자
	
	public User() {
		
		// 기본 생성자
		// - 단지 객체를 생성하는 목적 (공간 확보) 으로 쓰이는 생성자
		// - 기본 생성자로 객체를 생성하면 각 필드에 기본값이 담김
		// - 기본 생성자 작성을 생략하는 경우 오류가 나지 않고,
		//   호출 또한 제대로 됨!!
		// - 기본 생성자를 작성을 하지 않는 겨우 JVM이 자동으로
		//   기본생성자 코드를 만들어줬기 때문에 항상 사용 가능했던것!!
		// - 단, 매개변수가 있는 생성자가 아래에 작성되어있을 경우
		// 그 경우에는 기본생성자를 생략 했을 때 JVM이
		// 자동으로 기본생성자를 만들어주지 않는다!!
		// - 항상 기본생성자는 내가 직접 작성하는 습관을 들이자!!
		
		
		
		
		// System.out.println("잘 호출되나..?");
	}
	
	// 다소 복잡한 형태의 생성자 만들어 보기 (매개변수를 추가)
	// > "매개변수 있는 생성자"
	
	public User(String userId, String userPwd, String userName) {
		
		// 매개변수 생성자
		// - 객체를 생성함 (공간 확보) 과 동시에
		// 내가 원하는 값으로 처음부터 초기화할 목적
		// 매개변수로 전달받은 값을 각 필드에 대입하는 코드를 주로 작성
		// (setter 메소드 코드의 연장선)
		
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		
		
	}
	
	// 모든 필드에 대해 매개변수로 받는 생성자
	public User(String userId, String userPwd,String userName, int age, char gender) {
		/*
		this.userId =userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		
		// 위와같이 중복되는 동일한 초기화 하는 내용의
		// 생성자가 존재할 경우
		// 해당 생성자를 호출하여 초기화 하는 구문을 줄일 수있다.
		// [ 표현법 ]
		// this(매개변수값);
		// > this 생성자
		this(userId,userPwd,userName);
		// > 단, 반드시 this 생성자를 호출할 경우에는
		//   해당 구문 제일 최상단에 작성해야 함!!
		
		this.age = age;
		this.gender = gender;
		//this(userId,userPwd,userName);
		
	}
	
	
	// 메소드부
	// setter 메소드들
	public void setUserId(String userId) {
		this.userId = userId;
		
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
		
	}
	public void setName(String userName) {
		this.userName = userName;
	}
	public void setAge(int age) {
		this.age = age;
		
	}
	public void setGender(char gender) {
		this.gender = gender;
		
	}
	// getter 메소드들
	
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public 	String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
		
	}
	
	public char getGender() {
		return gender;
	}
	
	// information 메소드
	public String information() {
		return userId+" "+userPwd+" "+ userName + " " + age + " " + gender;
	}
}

