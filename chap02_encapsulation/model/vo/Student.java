package com.kh.chap02_encapsulation.model.vo;

// ĸ��ȭ �������� �Ϸ��� Ŭ����
public class Student {

	// [ �ʵ�� ] 
	// ���������� (�����) �ڷ��� �ʵ��;
	private String name;
	private int age;
	private double height;
	
	
	
	// [ �����ں� ]
	
	
	// [ �޼ҵ�� ]
	// "�޼ҵ�" �� �� ���ִ� �κ�
	
	/*
	 * * �޼ҵ� : ������ ����� ����ϴ� ����
	 * 
	 * [ ǥ���� ]
	 * ���������� ��ȯ�� �޼ҵ��(�Ű�����=> ���� ����) {
	 * 
	 * 		������ �ڵ�;
	 * 
	 * }
	 * 
	 * 
	 */
	// ���������γ��� �����͸� ��� �� �����ϴ� �뵵�� �޼ҵ�
	// setter �޼ҵ�
	

	
	// �̸����� ��� �� ���� �� �� �ִ� ����� �޼ҵ� (name�ʵ��� ���� ����)
	
	
	/*
	 * * setter �޼ҵ� �ۼ� ����
	 * 
	 * [ ǥ���� ]
	 * 
	 * public void set�ʵ��(�ش��ʵ����ڷ��� �ش��ʵ��){
	 * 		
	 * 		this.�ʵ�� = �ش��ʵ��;
	 *      
	 * 
	 * }
	 * 
	 * > "set�ʵ��" �޼ҵ���� ��Ÿǥ����� ���Ѿ���!!
	 * > �Ű������� �̸����� �ش��ʵ��� "����"�ϰ� �����ش�!!
	 * > �Ű�������� �ʵ���� ��ġ�ϸ� �Ű��������� �� �켱������ ���� ������
	 * "�ʵ�ν���" �ǹ̸� �ο��Ϸ��� �տ� this.�� �ۼ��Ѵ�!!
	 * (�Ű������� ������ ���������� ��޵Ǳ� ����)
	 * 
	 * 
	 */
	
	
	//name �ʵ忡 ���� setter �޼ҵ�
	public void setName(String name) {
		
		this.name = name;
	}
	// age �ʵ忡 ���� setter �޼ҵ�
	public void setAge(int age) {
		this.age = age;
	}
	
	// height �ʵ忡 ���� setter �޼ҵ�
	public void setHeight(double height) {
		this.height = height;
	}
	
	/*
	 * * getter �޼ҵ� �ۼ� ����
	 * [ ǥ���� ]
	 * 
	 *  public �ش��ʵ����ڷ��� get�ʵ��(){
	 *  
	 *  	return �ʵ��; //���� �븮�� ���ʸ����� ���ư�
	 *  
	 * }
	 * 
	 * > "get�ʵ��" �޼ҵ���� ��Ÿǥ����� ���Ѿ��Ѵ�!!
	 * > ��ȯ���� �ش� �ʵ尪�� �ڷ���, ��ȯ���� �ʵ忡 ����ִ°��� �ȴ�!!
	 * 
	 * > setter�� getter�� ����
	 *   ��� "�ʵ帶�� �Ѱ���" �� ����� ��� ��!!
	 *   �� �ʵ尡 10���� setter 10��, getter 10��
	 *   
	 * > setter �� getter �� ����
	 *   �ܺο��� ȣ���� �����ؾ� �ϱ� ������ public ��!!
	 *  
	 * 
	 */
	
	// name �ʵ忡 ���� getter �޼ҵ�
	public String getName() {
		return name;
	}
	// age �ʵ忡 ���� getter �޼ҵ�
	public int getAge() {
		return age;
	}
	
	// height �ʵ忡 ���� getter �޼ҵ�
	public double getHeight() {
		return height;
	}
	
	// ��������� ĸ��ȭ ���� �޼ҵ� 6��
	// �߰������� �� �ʿ��ϴٸ� �޼ҵ带 �� ���� �ᵵ ��!!
	
	//��� �ʵ尪�� �ϳ��� ���ڿ��� ���̾ �����ִ� �뵵�� �޼ҵ�
	public String infromation() {
		
		// return name, age , height;
		// > ������� �׻� �ݵ�� �Ѱ����̿��߸� �Ѵ�!!
		//return name+age+height; // "ȫ�浿20168.7"
		return name + " ���� ���̴� " + 
		age + " ���̰�, Ű�� " +
		height + " cm �Դϴ�. ";
	}
	
}
