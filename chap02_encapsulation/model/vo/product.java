package com.kh.chap02_encapsulation.model.vo;
// 클래스 십습 예제
public class product {

	//필드 부 -pName. price, brand
	
	private String pName;
	// > 필드명의 앞글자가 외자인 경우 setter, getter 메소드 작성시 
	//   해당 외자의 소문자를 살려서 작성해야한다.
	//   setpName ,getpName
	private int price; /* = 0*/
	
	private String brand = "애플";
	// > 필드를 "선언"만 할 경우에는
	//   항상 해당 타입에 대한 "기본값" 이 자동으로 들어감
	// > 내가 원하는 기본값이 따로 있다면,
	//  그값으로 해당 
	
	
	// 생성자 부
	// 메소드 부 
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
		return "이름은 : "+pName+"가격은 "+price+"이러한"+brand+"브랜드입니다.";
	}
	
}
