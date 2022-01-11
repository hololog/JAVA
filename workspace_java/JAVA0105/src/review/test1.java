package review;

public class test1 {
	
	public static void main(String[] args) {
		ItwillBank ib = new ItwillBank("111-1111-111", "홍길동", 10000, true);
		System.out.println("출금된 금액 : " + ib.withdraw(99999999));
		System.out.println("=============================");
		
		ItwillBank ib2 = new ItwillBank("111-1111-222", "차동원", 99999, false);
		// VIP가 아닐 경우 > 잔액이 부족 출금 불가!
		System.out.println("출금된 금액 : " + ib2.withdraw(999999999));
		System.out.println("-------------------------------");
		// VIP가 아니더라도 잔액이 충분하면 출금 가능!
		System.out.println("출금된 금액 : " + ib2.withdraw(5555));
		
	}

}

class Account {
	String accountNo;
	String ownerName;
	int balance;
	
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
		System.out.println("예금주명 : " + ownerName);
		System.out.println("현재잔고 : " + balance);
	}
	
	// 입금기능
	public void deposit(int amount) {
		balance += amount;
		System.out.println("입금금액 : " + amount + "원");
		System.out.println("현재잔고 : " + balance + "원");
	}
	
	public int withdraw(int amount) {
		if(amount > balance) {	// 출금 불가
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("잔액이 부족하여 출금 불가! (현재잔고 : " + balance + "원)");
			return 0;
		} else {	// 출금 가능
			balance -= amount;
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("출금 후 현재잔고 : " + balance + "원");
			return amount;
		}
	}
	
}


/*
 * Account 클래스를 상속받는 ItwillBank 클래스 정의
 * 멤버변수 : VIP 여부(boolean, isVip)
 * 생성자 : 기본생성자 없이 멤버변수 모두 초기화 (상속받은거 포함, super사용) 
 * 메서드 : 출금기능 (오버라이딩) 
 * 			1) VIP일 경우(isVip = true) 일 경우 은행 잔고에 관계없이 출금(마이너스 통장)
 *          2) VIP아닐 경우(isVip = false) 일 경우 출금 가능/불가 여부가 결정되어 수행되도록!
 * */

class ItwillBank extends Account {
	boolean isVip;

	// 슈퍼클래스인 Account 클래스에 기본생성자가 정의되어 있지 않고,
	// 파라미터 생성자만 정의되어 있기 때문에 서브클래스에서 기본 생성자 호출 시 오류 발생!
	// => 해결책1. 슈퍼클래스에서 기본생성자 Account()를 정의
	// => 해결책2. 슈퍼클래스의 파라미터 생성자를 명시적으로 호출
	//			 이 때, 상속받은 멤버변수의 초기화까지 간접적으로 수행 가능하므로 코드 중복도 제거됨
	// Alt + Shift + S -> O
	public ItwillBank(String accountNo, String ownerName, int balance, boolean isVip) {
		super(accountNo, ownerName, balance);
		this.isVip = isVip;
	}

	@Override
	public int withdraw(int amount) {
		if(!isVip) {	// VIP 아닐 경우
//			if(amount > balance) {	// 출금 불가
//				System.out.println("출금할 금액 : " + amount + "원");
//				System.out.println("잔액이 부족하여 출금 불가! (현재잔고 : " + balance + "원)");
//				return 0;
//			} else {	// 출금 가능
//				balance -= amount;
//				System.out.println("출금할 금액 : " + amount + "원");
//				System.out.println("출금 후 현재잔고 : " + balance + "원");
//				return amount;
//			}
			
			// 위의 코드는 Account 클래스의 withdraw() 메서드의 코드와 중복 되므로
			// 중복 제거를 위해 Account 클래스의 withdraw() 메서드를 호출하여
			// 리턴되는 값을 자신의 출금금액(amount)로 전달받으면 중복 제거됨
			amount = super.withdraw(amount);
			
		} else { // VIP 일 경우
			balance -= amount;
			System.out.println("출금할 금액 : " + amount + "원");
			System.out.println("출금 후 현재잔고 : " + balance + "원");
		}
		
		return amount;
		
	}
}









