package com.kh.chap04_field.model.vo;

// �ʵ忡�� ��� ������ ����������
public class FieldTest2 {
	
	/*
	 * * ���������� ����
	 * 
	 * (+)public
	 * - ��𼭵� (������Ű��, �ٸ���Ű���� ���)��� ���� �����ϰ� �ϰ� �ʹ�.
	 * 
	 * (#)protected
	 * - ���� ��Ű���� ������ ���� ����,
	 *   �ٸ� ��Ű���� ��Ģ�� ���� �Ұ��� �ϳ�,
	 *   "���" �̶�� ������ ���� Ŭ���������� �ٸ� ��Ű������ ���� ����
	 * 	 (����� ���� �ܿ����� �ٷ� ��)
	 * 
	 * (~)default
	 * - ������ ���� ��Ű�������� ���� �����ϰ� �ϰ� �ʹ�.
	 * 
	 * 
	 * (-)private
	 * - ���� �ش� Ŭ���� ���� �ȿ����� ���� �����ϰ� �ϰ� �ʹ�.
	 * 
	 * ���������� �Ʒ��� ���������� ������ �� �ִ� ������ ��������.
	 * 
	 * +,#,~,-�� "Ŭ���� ���̾�׷�" ���� ǥ���̴�.
	 * 
	 */
	// �ʵ��
	// ���� ������ �������� �ʵ带 ����
	public String pub = "public";
	protected String pro = "protected";
	/*default*/ String df = "default";
	private String pri = "private";
	
	public static String sta = "FieldTest2";
	public static void test() {
		
		System.out.println("����?");
		
	}
	
}
