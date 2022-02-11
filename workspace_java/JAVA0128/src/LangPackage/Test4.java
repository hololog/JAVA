package LangPackage;

public class Test4 {

	public static void main(String[] args) {
		/*
		 * 주민등록번호(jumin)를 문자열로 입력받아 성별(남 또는 여) 판별
		 * 입력 형식 : "XXXXXX-XXXXXXX"
		 * 판별 조건
		 * 1) 뒷자리 첫번째 숫자가 1 또는 3 : "남성" 출력
		 * 2) 뒷자리 첫번째 숫자가 2 또는 4 : "여성" 출력
		 * 3) 뒷자리 첫번째 숫자가 5 또는 6 : "외국인" 출력
 		 * 
		 * */
		String jumin = "881111-2722222";
		char ch = jumin.split("-")[1].charAt(0);
		// if - else
		String result = "";
		if(ch == '1' || ch == '3') {
			result = "남성";
		} else if(ch == '2' || ch == '4') {
			result = "여성";
		} else if(ch == '5' || ch == '6') {
			result = "외국인";
		}
		System.out.println(result);

		System.out.println("----------------------------");
		
		// switch - case
		switch (ch) {
		case 1:
		case 3: result = "남성"; break;	
		case 2:
		case 4: result = "여성"; break;
		case 5:
		case 6: result = "외국인"; break;

		}
		
		System.out.println("-----------------------------");
		
		// 주소부분만 출력
		String data1 = "Address:부산광역시 부산진구 동천로:109";
		System.out.println("주소 : " + data1.substring(data1.indexOf(':')+1));
		
		// 이름 부분만 출력
		String data2 = "이름: 홍길동, 나이: 20";
		System.out.println("이름 : " + data2.substring(3, 6));
		System.out.println("이름 : " + data2.split(",")[0].split(":")[1].trim());
		
		
		// 주소부부만 출력 
		String data3 = "Address:서울특별시 용산구 24번길, 210동 702호,Tel:0518030909";
		System.out.println(data3.substring(data3.indexOf(":")+1, data3.lastIndexOf(","))); 
		
		// 필요한 데이터만 추출 
		String data4 = "Address:부산광역시 부산진구 동천로109,Floor:7층,Tel:051-803-0909";
		String[] strArr = data4.split(",");
		for(String s : strArr) {
			System.out.println(s.split(":")[1].replace("-", ""));
		}
		
		
	}

}

enum Jumin {
	남성(1, 3), 여성(2, 4), 외국인(5, 6);
	int num1;
	int num2;
	
	private Jumin(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
}




















