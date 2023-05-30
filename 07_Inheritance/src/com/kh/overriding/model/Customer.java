package com.kh.overriding.model;

public class Customer extends Object {
	
	protected String name;       // 고객 이름
	protected String grade;      // 고객 등급
	protected int bonusPoint;    // 보너스 포인트
	protected double bonusRatio; // 보너스 적립 비율
	
	public Customer() {}

	public Customer(String name) {
		this.name = name;
		this.grade = "SILVER";  // 기본 등급
		this.bonusRatio = 0.01; // 포인트 기본 적립 비율
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	@Override // <-- 애노테이션! '이 메소드는 재정의된 메소드이다.' 라고 컴파일러에 명확히 알려 주는 역할
	public boolean equals(Object obj) {
		Customer c = (Customer) obj; // 이건 바로 다음에 배울 '다형성'!
		return this.name == c.name;
	}
	
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio; // 보너스 포인트 계산
		return price;
	}
}
