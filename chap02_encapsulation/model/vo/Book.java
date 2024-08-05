package com.kh.chap02_encapsulation.model.vo;

// å �ѱ��� ������ ���� �� �ִ� VO Ŭ���� (�߻�ȭ, ĸ��ȭ �� ���·�)

public class Book {
	
	// ����1 book Ŭ����
	
	// ����2
	// ���� ��ü�ð��� ��� ������� �ʱ�� �ϴ� �����ؼ�
	// hwp, word, txt, ppt, ��α�, Notion
	// �������� �� ���� ���� (���� ���� x)
	// �ʵ��
	// > �߻�ȭ������ �ū��ٶ�� �����Ͽ� �ʵ� ���� ����
	private String title; // å����
	private String publisher; // ���ǻ��
	private String author; // ���ڸ�
	private int price; // ����
	private double discountRate; // å�� ���η�
	
	// �����ں�
	
	// �޼ҵ��
	public void setTtile(String title) {
		this.title = title;
		
	}
	public void setPulisher(String publisher) {
		this.publisher = publisher;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setPrice(int price) {
		this.price = price;
		
	}
	public void setDiscountRate(double disconutRate) {
		this.discountRate = disconutRate;
	}
	
	
	public String getTitle() {
		return title;
	}
	public String getPulisher() {
		return publisher;
	}

	public String getAuthor(){
		return author;
		
	}

	
	public int getPrice() {
		return price;
	}
	public double getDiscuontRte() {
		return discountRate;
	}
	
	
	public String information() {
		
		return "å ������ "+title+"�̱� ���ǻ�� "+publisher+"�̸� ���ڸ��� "+author+"�̸� å�� ������"+price+ 
				"���̱� å�� ���η��� "+discountRate*100+"% �Դϴ�.";
	}
}
