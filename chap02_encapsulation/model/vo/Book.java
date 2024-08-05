package com.kh.chap02_encapsulation.model.vo;

// 책 한권의 정보를 담을 수 있는 VO 클래스 (추상화, 캡슐화 된 상태로)

public class Book {
	
	// 숙제1 book 클래스
	
	// 숙제2
	// 오늘 객체시간에 배운 내용들을 필기로 싹다 정리해서
	// hwp, word, txt, ppt, 블로그, Notion
	// 개념정리 후 보고서 제출 (오늘 제출 x)
	// 필드부
	// > 추상화과정을 거쳣다라는 가정하에 필드 먼저 제시
	private String title; // 책제목
	private String publisher; // 출판사명
	private String author; // 저자명
	private int price; // 가격
	private double discountRate; // 책의 할인률
	
	// 생성자부
	
	// 메소드부
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
		
		return "책 제목은 "+title+"이구 출판사는 "+publisher+"이며 저자명은 "+author+"이며 책의 가격은"+price+ 
				"원이구 책의 할인률은 "+discountRate*100+"% 입니다.";
	}
}
