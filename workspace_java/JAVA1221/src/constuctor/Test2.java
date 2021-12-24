package constuctor;

class Account2 {
	public String accountNo;	// 계좌번호
	public String ownerName;	// 예금주명
	public int balance;			// 현재잔고
	
	// 1. 파라미터가 없는 기본 생성자 정의, 다음과 같이 멤버변수 초기화
	// => 계좌번호: 111-1111-111
	//    예금주명: 홍길동
	//    현재잔고: 0
	public Account2() {
		accountNo = "111-1111-111";
		ownerName = "홍길동";
		balance = 0;
	}
	
	// 2. 계좌번호를 전달받아 초기화하는 생성자 정의, 나머지는 다음과같이 초기화
	// => 예금주명: 홍길동
	//    현재잔고: 0
	public Account2(String accountNo) {
		this.accountNo = accountNo;
		ownerName = "홍길동";
		balance = 0;
	}
	
	// 3. 계좌번호, 예금주명을 전달받아 초기화하는 생성자 정의, 나머지는 다음과 같이 초기화
	// => 현재잔고: 0
	public Account2(String accountNo, String ownerName) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		balance = 0;
	}
	// 4. 계좌번호, 예금주명, 현재잔고를 전달받아 초기화하는 생성자 정의
	public Account2(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	// showAccountInfo() 메서드 정의
	// => 파라미터 없음, 리턴값 없음, 멤버변수에 전근하여 다음과같이 출력
	//    계좌번호: XXX-XXXX-XXX
	//	  예금주명: XXX
	//    현재잔고: XXXX원
	public void showAccountInfo() {
		System.out.println("계좌번호: " + accountNo);
		System.out.println("예금주명: " + ownerName);
		System.out.println("현재잔고: " + balance + "원");
	}
}


public class Test2 {

	public static void main(String[] args) {

		Account2 acc = new Account2();
		acc.showAccountInfo();
		System.out.println("-------------------");
		
		Account2 acc2 = new Account2("333-3333-333");
		acc2.showAccountInfo();
		System.out.println("-------------------");
		
		Account2 acc3 = new Account2("555-5555-555", "강감찬");
		acc3.showAccountInfo();
		System.out.println("-------------------");
		
		Account2 acc4 = new Account2("999-9999-999", "김태희", 99999);
		acc4.showAccountInfo();
		System.out.println("-------------------");
		
		
		
	}

}
