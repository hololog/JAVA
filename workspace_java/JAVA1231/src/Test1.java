
public class Test1 {

	public static void main(String[] args) {
		ItwillBank ib = new ItwillBank();
		ib.deposit(50000);
		System.out.println("출금된 금액 : " + ib.withdraw(50000));
		System.out.println("--------------------------");
		// ItwillBank 클래스에서 오버라이딩 된 withdarw() 메서드가 호출되므로
		// 잔고가 부족하더라도 무조건 출금이 수행됨
		System.out.println("출금된 금액 : " + ib.withdraw(50000));
		System.out.println("==============================");
		
		Car car = new Car();
		car.speedUp(10);
		car.speedDown(10);
		car.addFuel();
		
		Taxi taxi = new Taxi();
		taxi.speedUp(10);
		taxi.speedDown(10);
		
		ElectricCar ec = new ElectricCar();
		ec.addFuel();
		
		DiselCar dc = new DiselCar();
		dc.addFuel();
		
	}

}

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금금액 : " + amount + "원");
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	public int withdraw(int amount) {
		if(amount > balance) {
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("잔액이 부족하여 출금 불가! (현재잔고: " + balance + "원");
			return 0;
		} else {
			balance -= amount;
			System.out.println("출금할 금액: " + amount + "원");
			System.out.println("출금 후 현재잔고: " + balance + "원");
			return amount;
		}
	}
}

/*
 * ItwillBank 클래스 정의 - Account 클래스 상속
 * - 출금 기능(withdraw()) 메서드 오버라이딩 수행
 *   => 잔고가 부족하더라도 무조건 출금하도록 구현
 *      은행 잔고에 관계없이 무조건 출금 수행(마이너스 통장)
 * */
class ItwillBank extends Account {
	
	public int withdraw(int amount) {
		balance -= amount;
		System.out.println("출금할 금액: " + amount + "원");
		System.out.println("출금 후 현재잔고: " + balance + "원");
		return amount;
	}
}

/*
 * 자동차(Car) 클래스 정의
 * - 멤버변수
 *   1) 현재속력(speed, 정수형)
 *   2) 최대속력(maxSpeed, 정수형)
 *   
 * - 메서드
 *   1) 속력 증가: speedUp()
 *   	- 파라미터로 증가할 속력(speed) 전달, 리턴값 없음
 *   	- "자동차의 속력 증가" 출력
 *   2) 속력 감소: speedDown()
 *   	- 파라미터로 감속할 속력(speed) 전달, 리턴값 없음
 *   	- "자동차의 속력 감소" 출력
 *   3) 연료 공급 : addFuel()
 *   	- 파라미터 없음, 리턴값 없음
 *   	- "자동차 연료 공급" 출력
 * 
 * Taxi 클래스 정의 - Car 클래스를 상속받아 정의
 * - speedUp() 메서드 오버라이딩: "Taxi의 속력 증가!" 출력
 * - speedDown() 메서드 오버라이딩 : "Taxi의 속력 감소!" 출력
 * 
 * Truck 클래스 정의 - Car 클래스를 상속받아 정의
 * - speedUp() 메서드 오버라이딩: "Truck의 속력 증가!" 출력
 * - speedDown() 메서드 오버라이딩 : "Truck의 속력 감소!" 출력
 * 
 * ElectricCar 클래스 정의 - Car 클래스 상속받아 정의
 * - addFuel() 메서드 오버라이딩 : "전기차 충전소에서 충전!" 출력
 * 
 * DiselCar 클래스 정의 - Car 클래스 상속받아 정의
 * - addFuel() 메서드 오버라이딩 : "주유소에서 디젤 연료 공급!" 출력
 * 
 * 
 * */
class Car {
	int speed;
	int maxSpeed;
	
	public void speedUp(int speed){
		this.speed += speed;
		System.out.println("자동차의 속력 증가");
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
		System.out.println("자동차의 속력 감소");
	}
	
	public void addFuel() {
		System.out.println("자동차 연료 공급");
	}
}

class Taxi extends Car {

	@Override
	public void speedUp(int speed) {
		System.out.println("Taxi 속력 증가!");
	}

	@Override
	public void speedDown(int speed) {
		System.out.println("Taxi 속력 감소!");
	}
	
}

class Truck extends Car {
	
	@Override
	public void speedUp(int speed) {
		System.out.println("Truck 속력 증가!");
	}

	@Override
	public void speedDown(int speed) {
		System.out.println("Truck 속력 감소!");
	}
}

class ElectricCar extends Car {

	@Override
	public void addFuel() {
		System.out.println("전기차 충전소에서 충전!");
	}
}

class DiselCar extends Car {

	@Override
	public void addFuel() {
		System.out.println("주유소에서 디젤 연료 공급!");
	}
}















