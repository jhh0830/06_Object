package com.kh.chap02_encapsulation.model.vo;
// Ŭ���� �ʽ� ����
public class product {

	//�ʵ� �� -pName. price, brand
	
	private String pName;
	// > �ʵ���� �ձ��ڰ� ������ ��� setter, getter �޼ҵ� �ۼ��� 
	//   �ش� ������ �ҹ��ڸ� ����� �ۼ��ؾ��Ѵ�.
	//   setpName ,getpName
	private int price; /* = 0*/
	
	private String brand = "����";
	// > �ʵ带 "����"�� �� ��쿡��
	//   �׻� �ش� Ÿ�Կ� ���� "�⺻��" �� �ڵ����� ��
	// > ���� ���ϴ� �⺻���� ���� �ִٸ�,
	//  �װ����� �ش� 
	
	
	// ������ ��
	// �޼ҵ� �� 
	//setter 
	public void setpName(String pName) {
		this.pName = pName;
		
	}
	public void setPrice(int price) {
		this.price = price;
		
	}
	public void setBrand(String brand) {
		this.brand = brand;
		
	}
	//getter 
	
	public String getpName() {
		return pName;
		
	}
	public int getPrice() {
		return price;
		
	}
	public String getBrand() {
		return brand;
		
	}
	
	public String information() {
		return "�̸��� : "+pName+"������ "+price+"�̷���"+brand+"�귣���Դϴ�.";
	}
	
}
