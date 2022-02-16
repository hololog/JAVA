
public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 1. "admin" (변수명 id)
		 * 2. "901010-1234567" (변수명 jumin)
		 * 3. "아이티윌 부산 교육센터" (변수명 company)
		 * ------------------------------------
		 * 1. 변수명 id에 대해 문자열 "ADMIN" 과 비교 후 아이디 일치 여부 판별 결과 출력
		 *    (단, 대소문자 구별 없이 비교)
		 *    ex) "아이디가 일치합니다" 또는 "아이디가 일치하지 않습니다"
		 *    
		 * 2. 변수명 jumin 에 대한 성별 판별
		 *    - 뒷자리 첫 번째 숫자가 1 또는 3이면 "남성입니다." 출력
		 *    - 뒷자리 첫 번째 숫자가 2 또는 4이면 "여성입니다." 출력
		 *    - 뒷자리 첫 번째 숫자가 5 또는 6이면 "외국인입니다." 출력
		 * 
		 * 3. 변수명 company에 대해 문자열 추출
		 *    - 문자열 중 "부산" 만 추출하여 출력
		 * */
		String id = "admin";
		String jumin = "901010-1234567";
		String company = "아이티윌 부산 교육센터";
		
		// 1.
		if(id.equalsIgnoreCase("ADMIN")) {
			System.out.println("아이디가 일치합니다");
		} else {
			System.out.println("아이디가 일치하지 않습니다");
		}
		
		// 2.
		char ch = jumin.split("-")[1].charAt(0);
		if(ch == '1' || ch == '3') {
			System.out.println("남성입니다.");
		} else if(ch == '2' || ch == '4') {
			System.out.println("여성입니다.");
		} else if(ch == '5' || ch == '6') {
			System.out.println("외국인입니다.");
		}
		
		// 3.
		company = "아이티윌(부) 부산 교육센터(부)";
		int n = company.indexOf("부산");
		System.out.println(company.subSequence(n, n+2));
		
	}

}
