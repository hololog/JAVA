package util;

import java.util.*;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * java.util.Date 클래스
		 * - 날짜 관련 기능을 제공하는 클래스(시각 정보 포함)
		 * - 대부분의 메서드가 deprecated 처리되어 있음
		 *   => 그러나, 다양한 API 들은 여전히 Date타입을 사용하는 경우가 많음
		 * - toString() 메서드사 오버라이딩 되어 있음
		 *   => 날짜 및 시각 정보를 문자열로 리턴해줌(단, 영어권 표현 방식)
		 * - 기본 생성자를 호출하여 인스턴스 생성하면 시스템의 날짜 및 시각 정보를 사용하여
		 *   Date 객체를 생성하여 리턴    
		 * */
		// 기본생성자를 호출하여 인스턴스 생성(시스템의 기본 날짜 및 시각 정보 사용)
		Date d1 = new Date();
		System.out.println(d1);
		// "Tue Feb 15 15:22:10 KST 2022" 출력됨(영어권 날짜 및 시각 표현 방법 사용됨)
		
		// long 타입 파라미터를 전달받은 생성자 호출
		Date d2 = new Date(2000000000000L);
		// 기준 날짜 및 시각으로부터 해당 long타입 값(ms)만큼 뒤의 날짜 및 시각으로 설정
		System.out.println(d2);
		
		Date d3 = new Date(2000, 6, 5);
		// => 최근에는 사용하지 않는 방법이므로 파악할 필요가 없음
		System.out.println(d3);
		
		// 1900년도가 기준이 되어 현재 연도에서 뺀 값 리턴됨
		System.out.println(d1.getYear() + 1900 + "년");
		
		// 시스템상에서 0 ~ 11월 형태로 사용하므로 + 1 필수!
		System.out.println(d1.getMonth() + 1 + "월"); 
		
		System.out.println(d1.getDate() + "일");
		
		// 요일 정보를 정수로 리턴(0: 일요일, 6: 토요일)
		System.out.println(d1.getDay());
		
		switch (d1.getDay()) {
		case 0:	System.out.println("일요일");	break;
		case 1:	System.out.println("월요일");	break;
		case 2:	System.out.println("화요일");	break;
		case 3:	System.out.println("수요일");	break;
		case 4:	System.out.println("목요일");	break;
		case 5:	System.out.println("금요일");	break;
		case 6:	System.out.println("토요일");	break;
			
		}
		
		System.out.println("----------------------------");
//		Tue Feb 15 15:36:23 KST 2022
//		Wed May 18 12:33:20 KST 2033
		long diffDate = d1.getTime() - d2.getTime();
		System.out.println(diffDate); // -355092992658 음수이므로 d2가 미래 날짜
		
		// ex) 일 단위로 변경 시 밀리초 -> 초 -> 분 -> 시 -> 일 순서로 변경
		//		=> / 1000(밀리초 -> 초) / 60(초 -> 분) / 60(분 -> 시간) / 24(시간 -> 일)
		if(diffDate < 0) {
			System.out.println(Math.abs(diffDate / 1000 / 60 / 60 / 24) + "일 남았습니다."); 
		} else if(diffDate > 0) {
			System.out.println(Math.abs(diffDate / 1000 / 60 / 60 / 24) + "일 지났습니다.");
		} else {
			System.out.println("오늘입니다!");
		}
		
		long diffDate2 = d2.getTime() - d1.getTime();
		if(diffDate2 < 0) {
			System.out.println(Math.abs(diffDate2 / 1000 / 60 / 60 / 24) + "일 남았습니다."); 
		} else if(diffDate2 > 0) {
			System.out.println(Math.abs(diffDate2 / 1000 / 60 / 60 / 24) + "일 지났습니다.");
		} else {
			System.out.println("오늘입니다!");
		}
		
		
		
		
		
		
	}

}
