package com.kh.chap05_constructor.model.vo;


// ������ ������ ���� �� �ִ� VO Ŭ����
public class User {
	
	// �ʵ��
	private String userId; // ȸ�����̵�
	private String userPwd; // ȸ����й�ȣ
	private String userName; // ȸ����
	private int age; // ����
	private char gender; // ����
	
	// �����ں�
	// > "������" ���� ���ִ� �κ�
	
	// * ������ (Constructor)
	// �̸��� Ŭ������� �����ϰ�, ��ȯ���� ���� ������ "�޼ҵ�" ���� ��
	// ��ü�� ������ ��  (new ������ ����ɶ�) ȣ��Ǵ� �޼ҵ��̴�.
	
	/*
	 * [ ǥ���� ]
	 * public Ŭ������ (�Ű����� > �������� ) {
	 * 
	 *   �������ڵ�;
	 * }
	 * 
	 * * �����ڸ� �ۼ��ϴ� ����
	 * 1. ��ü�� �������ֱ� ���� ���� (�⺻������)
	 * 2. ��ü�� �����ϴ°� �Ӹ� �ƴ϶�
	 *    �Ű������� ���޵� ���� ��ٷ� �ʵ忡 "�ʱ�ȭ" �� ����
	 *    (�Ű�����������)
	 *    
	 *    
	 * * ������ �ۼ� �� ���� ����
	 * 1. �ݵ�� Ŭ������� �����ؾ� ��!! 
	 * 2. ��ȯ���� �������� �ʴ´�. (�޼ҵ�� ����ϰ� ����� ��, ����)
	 * 3. ������ �ۼ��� ����������,  
	 * 		�Ű������� �ߺ��Ǹ� �ȵȴ�. (�̸��� �ߺ��Ǵ���)
	 * 4. �Ű����� �����ڸ� �ϳ��� ��������� �ۼ��ϰԵǸ�
	 * 		JVM�� �⺻�����ڸ��ڵ����� ����������ʴ´�.
	 * 		 >�⺻�����ڴ� ����Ǿ��� ���� ���� �ۼ�����!!
	 * 
	 */

	// ���� �⺻���� ������ ������ ����� ���� (�Ű����� ����)
	// > '�⺻ ������" : �Ű������� ���� ������
	
	public User() {
		
		// �⺻ ������
		// - ���� ��ü�� �����ϴ� ���� (���� Ȯ��) ���� ���̴� ������
		// - �⺻ �����ڷ� ��ü�� �����ϸ� �� �ʵ忡 �⺻���� ���
		// - �⺻ ������ �ۼ��� �����ϴ� ��� ������ ���� �ʰ�,
		//   ȣ�� ���� ����� ��!!
		// - �⺻ �����ڸ� �ۼ��� ���� �ʴ� �ܿ� JVM�� �ڵ�����
		//   �⺻������ �ڵ带 �������� ������ �׻� ��� �����ߴ���!!
		// - ��, �Ű������� �ִ� �����ڰ� �Ʒ��� �ۼ��Ǿ����� ���
		// �� ��쿡�� �⺻�����ڸ� ���� ���� �� JVM��
		// �ڵ����� �⺻�����ڸ� ��������� �ʴ´�!!
		// - �׻� �⺻�����ڴ� ���� ���� �ۼ��ϴ� ������ ������!!
		
		
		
		
		// System.out.println("�� ȣ��ǳ�..?");
	}
	
	// �ټ� ������ ������ ������ ����� ���� (�Ű������� �߰�)
	// > "�Ű����� �ִ� ������"
	
	public User(String userId, String userPwd, String userName) {
		
		// �Ű����� ������
		// - ��ü�� ������ (���� Ȯ��) �� ���ÿ�
		// ���� ���ϴ� ������ ó������ �ʱ�ȭ�� ����
		// �Ű������� ���޹��� ���� �� �ʵ忡 �����ϴ� �ڵ带 �ַ� �ۼ�
		// (setter �޼ҵ� �ڵ��� ���弱)
		
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		
		
	}
	
	// ��� �ʵ忡 ���� �Ű������� �޴� ������
	public User(String userId, String userPwd,String userName, int age, char gender) {
		/*
		this.userId =userId;
		this.userPwd = userPwd;
		this.userName = userName;
		*/
		
		// ���Ͱ��� �ߺ��Ǵ� ������ �ʱ�ȭ �ϴ� ������
		// �����ڰ� ������ ���
		// �ش� �����ڸ� ȣ���Ͽ� �ʱ�ȭ �ϴ� ������ ���� ���ִ�.
		// [ ǥ���� ]
		// this(�Ű�������);
		// > this ������
		this(userId,userPwd,userName);
		// > ��, �ݵ�� this �����ڸ� ȣ���� ��쿡��
		//   �ش� ���� ���� �ֻ�ܿ� �ۼ��ؾ� ��!!
		
		this.age = age;
		this.gender = gender;
		//this(userId,userPwd,userName);
		
	}
	
	
	// �޼ҵ��
	// setter �޼ҵ��
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
	// getter �޼ҵ��
	
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
	
	// information �޼ҵ�
	public String information() {
		return userId+" "+userPwd+" "+ userName + " " + age + " " + gender;
	}
}

