package util;

import java.util.*;

public class Test1 {

	public static void main(String[] args) {
		String data = "Address:부산광역시 부산진구 동천로109,Floor:7층,Tel:051-803-0909";
		// 1. 각 항목별 분리(StringTokenizer 클래스 사용)
		// 2. 각 항목에서 실제 데이터를 분리하여 출력
		StringTokenizer st = new StringTokenizer(data, ",");
		
		while(st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
			
			// 1. StringTokenizer 사용 시
//			StringTokenizer st2 = new StringTokenizer(st.nextToken(), ":");
//			st2.nextToken(); // Address:, Floor:, Tel: 항목들은 그대로 내보내기
//			System.out.println(st2.nextToken() + " ");
			
//			String title = st2.nextToken();
//			String content = st2.nextToken();
//			System.out.println(title + " : "+ content + " ");
			
			// 2. String 클래스의 split() 메서드 사용 시
//			String str = st.nextToken(); // 토큰 저장
//			String[] strArr = str.split(":");
//			System.out.println(strArr[1] + " ");
			
//			String[] strArr = st.nextToken().split(":");
//			System.out.println(strArr[1] + " ");
			
			System.out.println(st.nextToken().split(":")[1] + " "); 
		}
		
		// --------------------------------------------------
		System.out.println("--------------------------");
		String result = "";
		for(String str : data.split(",")) {
			result += str.split(":")[1] + " ";
		}
		System.out.println(result);
		

		
		
	}

}
