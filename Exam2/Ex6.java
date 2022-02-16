import java.util.*;
import java.util.regex.*;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 * 1. 패스워드 길이 : 영문자, 숫자, 특수문자(!@#$%) 를 사용하여 8 ~ 16자 판별하여 적합하지 않을 경우
		 *	    		"영문자, 숫자, 특수문자(!@#$%) 조합 8 ~ 16자 필수!" 출력
		 *	2. 위의 조건을 만족할 경우, 영문자(대,소문자), 숫자, 특수문자(!@#$%) 조합에 따른 결과 판별
		 *	1) 4가지 모두 조합 시 : "안전" 출력
		 *	2) 3가지 조합 시 : "보통" 출력
		 *	3) 2가지 조합 시 : "위험" 출력
		 *	4) 1가지 사용 : "사용 불가능한 패스워드" 출력
		 * */
		Scanner sc = new Scanner(System.in);
		String pwd = sc.nextLine();
		String pattern = "[a-zA-Z0-9!@#$%]{8,16}";
		
		// 100% 일치여부 확인
		Pattern.compile(pattern).matches(pattern, pwd);
		Pattern.matches(pattern, pwd); // 내부적으로 compile 하도록 되어있음
		pwd.matches(pattern);
		boolean result = pwd.matches(pattern);
		
		if(result) {
			// 일치하는 갯수 확인 로직
//			String[] patterns = {"[a-z]", "[A-Z]", "[0-9]", "[!@#$%]"};
//			int count = 0;
//			for(String regex : patterns) {
//				count += Pattern.compile(regex).matcher(pwd).find() ? 1 : 0;
//			}
			
			// 애초에 정규표현식 자체를 특정문자를 포함하는지 판단하도록 작성 후
			// 100% 일치 여부를 확인하는 matches를 활용해도 된다. (마치 Query에서 Like '%어떤문자%')
			String[] patterns = {".*[a-z].*", ".*[A-Z].*", ".*[0-9].*", ".*[!@#$%].*"};
			int count = 0;
			for(String regex : patterns) {
				count += pwd.matches(regex) ? 1 : 0;
			}
			
			// 일치 갯수에따라 출력
			String msg = "";
			switch (count) {
			case 1: msg += "사용 불가능한 패스워드"; break;
			case 2: msg += "위험"; break;
			case 3: msg += "보통"; break;
			case 4: msg += "안전"; break;
			}
			
			System.out.println(msg);
			
		} else {
			System.out.println("영문자, 숫자, 특수문자(!@#$%) 조합 8 ~ 16자 필수!");
		}
		
		
		
	}

}
