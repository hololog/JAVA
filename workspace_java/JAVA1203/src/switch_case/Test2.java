package switch_case;

public class Test2 {

	public static void main(String[] args) {

		/*
		 * 등급을 정수형 변수로 관리하여
		 * 해당 등급에 따른 할인 금액을 계산
		 * 		- 등급(grade): 1(일반 회원), 2(VIP 회원), 3(VVIP 회원)
		 * 		- 할인율(pee): 일반회원(5%), VIP회원(15%), VVIP회원(30%)
		 * 
		 * */
		// if 문을 사용하여 등급에 따른 할인율을 적용하여 결재 금액 계산 후 출력
		// ex) 결재 금액 : XXX원
		// 회원 등급이 아닐경우 "회원 등급 오류!" 라고 출력
		
		int grade = 2;
		int pee = 50000;
		String result = "결재 금액 : ";
		
		if(grade == 1)		result += (int)(pee*0.95) + "원";
		else if(grade == 2)	result += (int)(pee*0.85) + "원";
		else if(grade == 3) result += (int)(pee*0.7) + "원";
		else 				result = "회원 등급 오류!";
		
		System.out.println(result);
		
		// switch ~ case
		
		switch (grade) {
			case 1:
				result += (int)(pee*0.95) + "원";
				break;
			case 2:
				result += (int)(pee*0.85) + "원";
				break;
			case 3:
				result += (int)(pee*0.70) + "원";
				break;
			default:
				result = "회원 등급 오류!";
		}
		
		System.out.println(result);
		
		
		
		
		
		
		
		
	}

}
