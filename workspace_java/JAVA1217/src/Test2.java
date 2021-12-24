/*
 * 은행계좌(Account2) 클래스 정의
 * - 멤버변수
 * 		1) 계좌번호(accountNo, "xxx-xxxx-xxx" = 문자열)
 * 		2) 예금주명(ownerName, "XXX" = 문자열)
 * 		3) 현재잔고(balance, XXXXXXX = 정수)
 * 
 * - 메서드
 * 		1) showAccountInfo(): 계좌정보를 출력
 * 			- 매개변수 없음, 리턴값 없음
 * 			- 다음과 같이 출력
 * 			< 출력 예시 >
 * 			계좌번호 : 111-1111-111
 * 			예금주명 : 홍길동
 * 			현재잔고 : 100000원
 * 		2) deposit() : 입금 기능
 * 			- 매개변수 : 입금금액(정수, amount), 리턴값 없음
 * 			- 입금할 금액(amount)을 전달받아 현재잔고(balance)에 누적
 * 			- 입금할 금액과 입금 후의 잔고를 다음과 같이 출력
 * 				입금금액 : XXXX원
 * 				현재잔고 : XXXX원
 * 		3) withdraw() : 출금 기능
 * 			- 매개변수 : 출금할 금액(정수, amount), 리턴값 : 출금 성공 시 출금된 금액
 * 			- 출금할 금액(amount)을 전달받아 다음 조건에 따라 출금 수행
 * 				a. 출금할 금액보다 현재잔고가 작을 경우 (출금이 불가능할 경우)
 * 					출력) 출금할 금액: XXXX원
 * 						 잔액이 부족하여 출금 불가! (현재잔고: XXX원)
 * 			    b. 출금할 금액보다 현재잔고가 크거나 같을 경우 (출금이 가능할 경우)
 * 					출금할 금액만큼 현재 잔고에서 차감 후 다음과 같이 출력
 * 						출금할 금액 : XXXXX원
 * 						현재잔고 : XXXXX원 -> 출금하고 남은 금액만큼 출력
 * 						출금할 금액만큼 리턴
 * 				- 외부에서 리턴값을 전달받아 "출금금액: XXXX원" 출력
 * 
 * */
class Account2 {
	String accountNo;
	String ownerName;
	int balance;
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
	
	// 입금 기능
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금금액 : " + amount + "원");
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	// 출금 기능
	public int withdraw(int amount) {
		int result = 0;
		
		if(amount > balance) {	// 출금 불가능
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("잔액이 부족하여 출금 불가! (현재잔고: " + balance + "원)");
			result = 0;
		} else {	// 출금 가능
			balance -= amount;
			System.out.println("출금할 금액: " + amount + "원");
			System.out.println("출금 후 현재잔고 : " + balance + "원");
			
			result = amount;
		}
		
		return result;
		
	}
}


public class Test2 {

	public static void main(String[] args) {
		Account2 acc = new Account2();
		acc.accountNo = "111-1111-111";
		acc.ownerName = "홍길동";
		acc.balance = 100000;
		
		acc.showAccountInfo();
		System.out.println("-----------------");
		acc.deposit(50000);	// 입금금액: 50000원 현재잔고: 150000
		System.out.println("출금금액 : " + acc.withdraw(100000) + "원");
		System.out.println("----------------");
		System.out.println("출금금액 : " + acc.withdraw(100000) + "원");
		
		

	}

}
