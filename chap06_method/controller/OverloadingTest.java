package com.kh.chap06_method.controller;

// �޼ҵ� "�����ε�" ����

public class OverloadingTest {
	
	/*
	 * * �޼ҵ� �����ε�
	 * - �� Ŭ���� ���� "���� �޼ҵ��" ���� �������� �޼ҵ带 ������ �� �ִ� ��Ģ
	 * 
	 * * �޼ҵ� �����ε��� ��������
	 * 1. �޼ҵ���� �����ؾ� �Ѵ�.
	 * 2. �Ű������� �ڷ���, ����, ������ �ϳ��� �ٸ��� �ۼ��Ǿ�߸� �Ѵ�.
	 * 3. ��, �Ű�������, ���������� ����, ��ȯ���� �޼ҵ� �����ε��� ������ ���� �ʴ´�.
	 * 
	 * 
	 */
	
	public void test() {
		
		// �޼ҵ� �����ε� �� �Ǿ��ִ� ����
		// 1. ������
		// 2. ��¹�
		System.out.println("�ȳ��ϼ���"); //�Ű����� 1�� (String)
		System.out.println(100); // �Ű����� 1�� (int)
		System.out.println(true);// �Ű����� 1�� (boolean)
		
		System.out.printf("%d", null); //�Ű����� 2�� (String, int)
		System.out.printf("%f %d",0.1, 20); // �Ű����� 3�� (String, double, int);
		
		
		
		
		
	}
	// 
	public void test(int a) { // �����ε� ����
		
	}
	public void test(int a, String s) { // �����ε� ����
		
	}
	public void test(String s, int a) { // �����ε� ����
		
	}
	
	public void test(int a, int b) {// �����ε� ����
		
	}
	/*
	public void test(int c, int d) {// �����ε� ����x
		// �Ű������� �ٸ���, �ٷ� ���� �޼ҵ��
		// �Ű����� ����, ����, ������ ��� ��ġ�ϱ� ����!!
		
	}
	*/
	public void test(int a, int b,String s) {// �����ε� ����
		
	}
	/*
	public int test(int a, int b,String s) {// �����ε� ����x
		// ��ȯ���� �ٸ�����
		// �Ű������� ����, ����, ������ ��� ��ġ�ϱ⶧��
		
		return a+b;
	}
	*/
	
	/*
	private void test(int a, int b, String s) {// �����ε� ����x
		// ���������ڰ� �ٸ�����
		// �Ű������� ����, ����, ������ ��� ��ġ�ϱ� ����
		
	}
	*/
	
}
