package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Book;
import com.kh.chap02_encapsulation.model.vo.Person;
import com.kh.chap02_encapsulation.model.vo.Student;
import com.kh.chap02_encapsulation.model.vo.product;

public class Run {

	
	/*
	 * 7. ĸ��ȭ ������ ���� �� �Ϻ��� Ŭ������ ���¸� ���߰� ����.
	 * 
	 * 
	 * - ĸ��ȭ�� ���� ������ : �ܺηκ��� ���� ������ �����ϱ� ������
	 * 						�Ժη� ���� �����ǰų� ��ȸ�� �����ر��� ��
	 * > �׷��� ĸ��ȭ �۾��� �ݵ�� ����� ��!!
	 *   ��ü���� ���� ��Ģ �� �ϳ��� ��������
	 *   �������� ��� �� �Ϻΰ� "ĸ��ȭ"
	 *   
	 *   
	 *   ĸ��ȭ : �������� ���� ������ ��Ģ���� �Ͽ�
	 *  		 �ܺηκ��� ���� ������ ����! ��� �ż���
	 *          ��, ��ſ� ���������γ��� ����ó�� (����, ��ȸ) �� �� �ְԲ�
	 *          ��ġ�� ���ص���!!
	 *          
	 *  1) �������� �ܰ�
	 *  	�ʵ���� �ܺηκ��� ���� ������ ��������
	 *  	public ��ſ� private ���������ڸ� ���
	 *  
	 *  
	 *  2) setter / getter �޼ҵ� �ۼ�
	 *     ���������� ���� �����ؼ� ���� ��ų� (�����ϰų�, �����ϰų�)
	 *     �� ���� ������ �� �ְԲ� ó�� ����
	 *     ���� ��� �뵵�� �޼ҵ� : setter �޼ҵ�
	 *     ���� ������ �� �ִ� �뵵�� �޼ҵ� : getter �޼ҵ�
	 *     
	 *  
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		// ĸ��ȭ ���� �� 1 �ܰ踸 �Ϸ��� ���� Ŭ������
		
		// ��ü �����غ���
		Student hong = new Student();
		/*
		hong.name = "ȫ�浿";
		hong.age = 20;
		hong.height = 168.7
		*/
		// > Ŭ������.�ʵ�� is not visible.
		//   �� �ʵ��� ���������ڸ� private ���� �����Ѵٸ�
		//   ���� ������ �Ұ�������
		
		// > setter �޼ҵ带 ���� ���������� ������ �� �ְ� ����!!
		
		//hong.setName("ȫ�浿");
		//hong.setAge(20);
		//hong.setHeight(168.7);
		 
		// �� �ʵ尪�� �� ���ԉ糪 ����غ���
		/*
		System.out.println(hong.name);
		System.out.println(hong.age);
		System.out.println(hong.height);
		*/
		// > is not visible (�������� ����)
		// > ���� ��ȸ�� ������ ���� ������ �Ұ����ϴ�.
		
		// getter�޼ҵ�� ���ʵ尪 ����
		// ��ü��.�޼ҵ��()
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
		
		// > private ���� �ʵ��� ���������� ����
		// setter / getter �޼ҵ� ���� �ۼ��ϴ°� ĸ��ȭ��� ��
		
		// "xxx���� ���̴� xx���̰�, Ű�� xxx.xcm �Դϴ�" ���� ���
		
		//System.out.println(hong.getName()+ "���� ���̴� " +hong.getAge() + " ���̰�, Ű�� "+hong.getHeight() + " cm �Դϴ�.");
		// > �Ź� ���ڿ��� �� �����̼� ��¹��� �ۼ��ϱ� ������..
		
		
		// information �޼ҵ带 ȣ���ؼ� �ѹ��� ��� ������
		//System.out.println(hong.infromation());
		
		//-------------------------------------
		
		// ��浿, 24 180.3 �л� ��ü�� ����ÿ�.
		
		// ��浿 �л��� ������ ����Ͻÿ�.
		/*
		Student  go = new Student();
		
		go.setName("��浿");
		go.setAge(24);
		go.setHeight(180.3);
		
		System.out.println(go.infromation());
		*/
		
		
		Book bk = new Book();
		
		bk.setTtile("�ظ�����");// å���� �Է�
		bk.setPulisher("�Ҹ�������");// ���ǻ��
		bk.setAuthor("jk�Ѹ�");// ���ڸ�
		bk.setPrice(18000);// ����
		bk.setDiscountRate(0.1); // å�� ���η�
		
		System.out.println(bk.information());
	
			
		Person pr = new Person();
		pr.setId("user01");
		pr.setPwd("pass01");
		pr.setName("�谡��");
		pr.setAge(34);
		pr.setGender('F');
		pr.setPhone("010-1111-2222");
		pr.setEmail("gahyun@kh.com");
		System.out.println(pr.information());
		
		
		product pd = new product();
		
		pd.setpName("������13");
		pd.setPrice(1250000);
		pd.setBrand("aplle");
		
	
		}
	 // brand �ʵ� ���� �⺻���� "����"�� �����صθ�
	// (setBrand �޼ҵ带 �Ź� ȣ���� �ʿ䰡 ����)
	
		
	}

