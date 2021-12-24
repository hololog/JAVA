package constuctor;

// 기본생성자, 계좌번호 생성자, 계좌번호와 예금주명 생성자
// 계좌번호와 예금주명과 현재잔고를 전달받는 생성자 정의
class Account3 {
	// 멤버변수 선언
	private String accountNo;	// "111-1111-111"
	String ownerName;	// "홍길동"
	int balance;		// 10000
	
	public Account3() {
		this("111-1111-111", "홍길동", 10000);
	}
	
	public Account3(String accountNo) {
		this(accountNo, "홍길동", 10000);
	}
	
	public Account3(String accountNo, String ownerName) {
		this(accountNo, ownerName, 10000);
	}
	
	public Account3(String ownerName, int balance) {
		this("111-1111-111", ownerName, balance);
	}
	
	public Account3(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void showInfo() {
		System.out.println("계좌번호: " + accountNo);
		System.out.println("예금주명: " + ownerName);
		System.out.println("현재잔고: " + balance);
	}
}

public class Test4 {

	public static void main(String[] args) {
		
		Account3 acc = new Account3();
		acc.showInfo();
		System.out.println("-----------------");
		
		Account3 acc2 = new Account3("333-3333-333");
		acc2.showInfo();
		System.out.println("-----------------");
		
		Account3 acc3 = new Account3("555-5555-555", "이순신");
		acc3.showInfo();
		System.out.println("-----------------");
		
		Account3 acc4 = new Account3("777-7777-777", "김태희", 99999);
		acc4.showInfo();
		System.out.println("-----------------");
		
		Account3 acc5 = new Account3("차동원", 999999999);
		acc5.showInfo();
		
		
	}

}
