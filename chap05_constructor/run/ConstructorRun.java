package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		
		// ������ ȣ��
		// new User(); 
		// 1. �⺻�����ڷ� ��ü ���� ��
		User u1 = new User();	
		
		// 2. �Ű����������ڷ� ��ü ���� �� (�Ű����� 3��¥��)
		User u2 = new User("user02", "pass02","�踻��");
		
		
		System.out.println(u1.information());
		// > �⺻�����ڷ� ��ü ���� ��
		//   �� �ʵ尪�� �� Ÿ�Կ� �´� "�⺻��" �� �� ����
		// null null null 0 ''
		
		System.out.println(u2.information());
		// > �Ű����������ڷ� ��ü ���� ��
		//   �Ű������� �������ʵ尪�� ���ؼ� ó������ �ش� ���� �� ����
		// user02 pass02 �踻�� 0 
		
		// �⺻�����ڷ� ��ü ������ ���� ���ϴ� ������ �����Ϸ���?
		// > �� �ʵ忡 �´� setter �޼ҵ带 �Ź� ȣ���ؾ���
		
		// 3. �Ű����� �����ڷ� ��ü ���� �� (��� �ʵ忡 ���� �Ű�����)
		User u3 = new User("user03", "pass03", "�ڸ���", 20, '��');
		
		
		System.out.println(u3.information());
		// > ��� �ʵ忡 ���� �Ű����� �����ڸ� �̿��ϸ� 
		// ó������ ��� �ʵ忡 ���� ���ϴ� ������ ä���� ��ü�� ������ �� ����!!
		// user03 pass03 �ڸ��� 20 ��
		
		
		System.out.println("-------------------------");
		
		// u3 �� ��� ���� ����� ä���� �ְ�,
		// u1, u2 ��ü�� �ʵ忡 ���� ����� ä���� ���� �ʴ� ��Ȳ
		// > setter �޼ҵ� Ȱ��
		
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setName("������");
		u1.setAge(30);
		u1.setGender('��');
		System.out.println(u1.information());
		
		u2.setAge(40);
		u2.setGender('��');
		System.out.println(u2.information());
		
		// >�Ű����� �����ڸ� �� Ȱ���ϸ�
		// ��ü ���� �� �Ź� setter �޼ҵ带 ȣ���� �ʿ䰡����.
		
		// > �׷� setter �޼ҵ带 �ȸ��� �Ǵ� �� �ƴϳ�?
		// ����..
		
		// u3 ��ü�� ���� ȸ���� ��й�ȣ�� �����ϰ� �ʹٸ�?
		u3.setUserPwd("Password03!");
		System.out.println(u3.information());
		
		// u1 ��ü�� ���� ȸ���� �̸��� �����ߴٸ�?
		u1.setName("������");
		System.out.println(u1.information());
		
		// > �۾� �� �Ϻ� �ʵ尪�� ������ ���� ���� �߻��ϱ� ������
		//   setter �޼ҵ� ���� ������ ��������
		
	}

}
