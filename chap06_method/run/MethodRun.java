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
		System.out.println("������ : "+a);
		// > �׳� ȣ�ⱸ���� �ᵵ �� ���ư��� ������,
		// �� �������� ��ȯ���� ������ ��ó�� ���� ���� �ϰ�ʹٸ�
		// �׻� ���� ���𹮰� ���� ��� �Ѵ�.
		
		System.out.println("������ : "+ m1.method2());
		// > ���� ������ ���� �ʰ�
		//   ��¹� �ȿ��� ������� ��ȯ���� �ٷ� ��µ� ����!!
		
		System.out.println("-----------");
		m1.method3(10, 20);
		System.out.println("-----------");
		//m1.method4(42, 2);
		
		System.out.println("��� �� : "+m1.method4(42, 2));
		
		// > ��ȯ���� ���� �޼ҵ尰�� ��� �ش� �޼ҵ� ó�� �����
		//   ���� ��±��� �ϴ� ���ҷ� �ڵ带 §��.
		System.out.println("==========================");
		
		
		// 2. MethodTest2
		
		//MethodTest2 m2 = new MethodTest2();
		// > static �޼ҵ�� ��ü ������ �ʿ� ����
		// ��ٷ� Ŭ������.�޼ҵ��() ���� ȣ���� �����ϴ�.
		
		MethodTest2.method1();
		System.out.println("--------------");
		System.out.println(MethodTest2.method2());
		System.out.println("--------------");
		MethodTest2.method3("ȫ�浿", 20);
		System.out.println("--------------");
		System.out.println(MethodTest2.method4(10, 9));

	
	
	}

}
