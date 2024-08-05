package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {
		/*
		// 1. FieldTest1
		FieldTest1 f1 = new FieldTest1();
		// >��ü ���� �� global ��������� ���� (�Ҵ�)
		
		
		f1.test(10);
		
		//System.out.println(local);
		//System.out.println(num);
		// > test �޼ҵ��� ���������� local, num��
		//   �̹� �Ҹ�Ǿ��� ������ �̽����������ʹ� ���̻� �� �� ����
		
		//System.out.println(f1.global);
		// > global ������ ���� �Ҹ���� �ʾ���!!
		//  ��, private���� ���ܳ��� ���� �Ұ��� ��Ȳ!!
		
		// global �� �Ҹ��Ű�� �ʹٸ�?
		f1 = null;
		// > �� ���� �������� �Ҹ� �ȴٰ� ���� ��
		
		// System.out.println(f1.global);
		// > ������ ���� ���� �Ұ��� (NullPointerException �߻�)
	*/
		
		// ---------------------------------
		
		//2. FieldTest2
		/*
		FieldTest2 f2 = new FieldTest2();
		// > �� 4���� ��������� �����Ǿ���
		
		//public : ��𼭵� �׻� ���� ���� ����
		System.out.println(f2.pub);
		
		// protected : ���� ��Ű�������� �������� ����,
					 //�ٸ� ��Ű�������� �������� �Ұ� (��, ��۰���� ����)
		//System.out.println(f2.pro);// is not visible
		
		// default : ���� ��Ű�������� �������� ����,
		           //�ٸ� ��Ű�������� �������� �Ұ�
		// System.out.println(f2.df); //is not visible
		
		// private : �ش� Ŭ���� ���� �ȿ����� ���� ����
		// System.out.println(f2.pri); //in not visible
		*/
		//-----------------------------------
		// 3. FieldTest3
		
		System.out.println(FieldTest3.sta);
		// > ��ü ������ ���� �� �׳� ������ �� �� �ִ�.
		
		System.out.println(FieldTest2.sta);
		// > �׻� Ŭ������.static���������� �����ؾ���!!
		// static �������� �ߺ��� �� �ֱ� ������
		// ��Ȯ�ϰ� ��� Ŭ������ ������ ������ ������ Ǯ�������� ����ϱ� ����
		
		FieldTest3.test();
		FieldTest2.test();
		// > �޼ҵ嵵 ��������
		// ��ü ���� �ʿ� X, �׻� Ŭ������.�޼ҵ��(); ���� ȣ��
		
		System.out.println(FieldTest3.NUM);
		
		// ����ʵ��� ���� �����غ���
		// FieldTest3.NUM = 11;
		// > ����ʵ��� ���� ���� ���� �Ұ���!!
		
		// �׷��� �׳� static ������?
		
		FieldTest3.sta = "FieldTest3";
		
		System.out.println(FieldTest3.sta);
		// > �� ������ ������!!
		
		// > static Ű����� �ʹ� �����ص� ���� ����
		//   ����, ��𼭵��� �ΰ�ΰ� ������ ����ϴ� ����
		//   ������ ��쿡�� ���� ���� ������
		
		// > static �� ���� ����ϴ� ����
		// �ڹٿ��� �����ϴ� Math Ŭ����
		// Math : ���� ��꿡 Ưȭ�� Ŭ���� (���� �������, ���� �޼ҵ�)
		//  > ���� ����� ���� ����ϴ� ���� �ʵ�, �޼ҵ� ��� static���� ����
		// (Math Ŭ���� Ÿ���� ��ü�� ������ ���� ����)
		// Math math =new Math();
		// > �ƿ� ó������ ���� ������ ������ private ���� ���Ƶ�!!
		// - �̷� ������ ��� �ʵ�, �޼ҵ带 static���� �����
		//   ��ü ���� ���� ���� ������ ���Ƶ� �ڵ� ������ "�̱��� ����" �̶�� ��
		
		System.out.println(Math.PI); // ��� �ʵ�
		// 3.141592653589793(������)
		
		
		
	}

}
