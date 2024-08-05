package com.kh.chap03_class.model.vo;


//Ŭ�������� ��� ������ ���������� : public, default(������� ���� ��)
// Ű���� ������ ���� �� �ִ� VO Ŭ����
public class Coffee {
	
	
	// �ʵ��
	// > �߻�ȭ ���� : �����(String), ����(int), ��/���̽�(char), ������(char) 
	private String coffeeName;
	private int price;
	private char option;
	private char size;
	
	
	
	// �����ں�
	
	
	// �޼ҵ��
	// setter �޼ҵ�� 
	public void setCoffeeName(String coffeeName) {
		this.coffeeName = coffeeName;
		
	}
	public void setPrice(int price) {
		this.price =price;
		
	}
	public void setOption(char option) {
		this.option =option;
		
	}
	public void setSize(char size) {
		this.size = size;
		
	}
	// getter �޼ҵ��
	
	public String getCoffeeName() {
		return coffeeName;
	}
	public int getPrice() {
		return price;
	}
	public char getOption() {
		return option;
	}
	public char getSize() {
		return size;
	}
	
	public String information() {
		return "coffeeName :  " +coffeeName+" price : "+price+ " option :  "+option + " size : " + size;
	}
	
}
