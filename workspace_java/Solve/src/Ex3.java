
public class Ex3 {

	public static void main(String[] args) {
		/* 
		 * 1. 클래스 정의 (15점)
		 * 클래스명 : Account
		 * 멤버변수 : 은행계좌(accountNo, 문자열) => 예) "123-45-6789"
		 * 			예금주명(owenerName, 문자열) => 예) "홍길동"
		 * 			현재잔고(balance, 정수) => 예) 10000
		 * 생성자 : 은행계좌, 예금주명, 현재잔고를 모두 전달받아 멤버변수를
		 *        초기화할 것(기본 생성자 불필요, 초기값은 적당히 입력)
		 * 
		 * 2. 메서드 정의(각 15점)
		 * 	1) deposit(): 입금금액(amount)을 입력받아 현재잔고(balance)에 
		 *     누적한 후 현재잔고를 출력할 것(리턴 없음)
		 *     ex) 현재잔고가 10000원이고, 입금금액이 5000원 일때
		 *         "입금금액 : 5000원, 현재잔고 : 15000원"
		 * 
		 *  2) withdraw() : 출금금액(amount)을 입력받아 현재잔고 (balance)에서 뺀 후 현재잔고와 출금금액을 출력
		 *  				(단, 잔고가 부족할 경우 출금 불가 안내)
		 *  				(리턴: 출금된 금액에 해당하는 금액)
		 *  
		 *  	ex) 현재잔고가 10000원 이고, 출금금액이 5000원 일때
		 *  		"현재잔고 : 10000원, 출금할 금액 : 5000원"
		 *  		"5000원이 출금 되었습니다 (현재잔고 : 5000원)"
		 *  
		 *  	ex2) 현재잔고가 10000원이고, 출금금액이 15000원 일때
		 *  		"현재잔고 : 10000원, 출금할 금액 : 15000원"
		 *  		"잔고가 부족하여 출금할 수 없습니다."
		 * 
		 * */
//		Account acc2 = new Account();
//		acc2.accountNo = "123-45-6789" (X)
		Account acc = new Account("123-45-6789", "홍길동", 10000);
		
	}
}

class Account {
	// 멤버변수
	String accountNo;
	String owerName;
	int balance;
	
	// 생성자
	public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.owerName = ownerName;
		this.balance = balance;
	}
	
	// 메서드
//	1) deposit(): 입금금액(amount)을 입력받아 현재잔고(balance)에 
//	              누적한 후 현재잔고를 출력할 것(리턴 없음)
	public void deposit(int amount) {
		this.balance += amount;
		System.out.println("입금금액 : " + amount + "원, 현재잔고 : " + balance + "원");
	}
	
//	2) withdraw() : 출금금액(amount)을 입력받아 현재잔고 (balance)에서 뺀 후 현재잔고와 출금금액을 출력
//	 *  				(단, 잔고가 부족할 경우 출금 불가 안내)
//	 *  				(리턴: 출금된 금액에 해당하는 금액)
	
	public int withdraw(int amount) {
		if(balance < amount) {	// 출금 안될 경우
			System.out.println("현재잔고 : "+ balance +"원, 출금할 금액 : " + amount + "원");
			System.out.println("잔고가 부족하여 출금할 수 없습니다.");
			return 0;
		} else {	 // 출금 가능 경우
			balance -= amount;
			System.out.println("현재잔고 : " + balance + "원, 출금할 금액 : " + amount + "원");
			System.out.println(amount+"원이 출금 되었습니다 (현재잔고 : " + balance +"원)");
			return amount;
		}
	}
	
	/*
	 * [조건]
	 * 1. [경고창 표시] 버튼 클릭 시 "경고메시지" 라는 문자열을 모달창(알림창)으로 출력
	 * 2. [이름 입력받기] 버튼 클릭 시 모달창을 통해 이름을 입력받아 출력
	 * 3. [아이티윌로 이동] 버튼 클릭 시 아이티윌 홈페이지 XXX 로 이동 location.href
	 * 4. [새 창 열시] 버튼 클릭 시 아이티윌 홈페이지를 새창에서 표시 window.open
	 * 5. [패스워드 확인] 버튼 클릭 시 좌측에 입력란에 입력된 패스워드를 가져와서 모달창에 출력
	 * 
	 * 
	 * */
	
	
}





