package util;

import java.util.*;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * java.util.Calendar 클래스
		 * - 날짜 및 시각을 관리하는 클래스(Date 클래스와 유사함)
		 * - 주로 날짜 및 시각 정보를 조정하는 용도로 사용
		 *   (과거에는 Calendar 클래스로 날짜 조작, Date 클래스로 날짜 표현함)
		 * - 추상클래스 이므로 인스턴스 생성이 불가능하며,
		 *   미리 시스템으로부터 생성되어 제공되는 인스턴스를 리턴받아 사용
		 *   (싱글톤 디자인 패턴(Singleton Design Pattern) 활용[한 것 처럼])
		 *   => getInstance() 메서드 호출하여 인스턴스를 리턴 받음
		 * - toString() 메서드가 오버라이딩 되어 있으나 일반적인 날짜 식별은 어려움
		 * - get() 메서드로 날짜 및 시각 정보에 대한 항목을 지정하여 값을 가져오고,
		 *   set() 메서드로 날짜 및 시각 정보에 대한 항목을 지정하여 값을 설정한다.
		 *   => 파라미터로 사용될 대상 항목은 Calendar 클래스의 상수를 활용
		 *   ex) cal.get(Calendar.YEAR) => 연도 정보 가져오기  
		 * */
//		Calendar cal = new Calendar(); // 추상클래스이므로 인스턴스 생성 불가
		
		// 진짜 싱글톤인지 아닌지 예
//		Calendar cal = Calendar.getInstance();
//		Calendar cal2 = Calendar.getInstance();
//		
//		System.out.println(cal == cal2); // true가 나와야 진짜 싱글톤 패턴
		
		// Calendar 클래스의 static 메서드인 getInstance() 메서드 호출하여 객체 리턴받기
		Calendar cal = Calendar.getInstance();
		
		// get(int field) 메서드를 사용하여 특정 항목에 대한 값 가져오기
		// => 항목 지정을 위해 get() 메서드 파라미터로 Calendar.XXX 상수를 전달하여
		//    가져오고자 하는 대상 항목을 지정할 수 있다.
		int year = cal.get(Calendar.YEAR);
		System.out.println(year + "년");

//		int month = cal.get(Calendar.MONTH); // Date클래스와 마찬가지로 0 ~ 11월 사용
		int month = cal.get(Calendar.MONTH) + 1; // 따라서, 결과값 + 1 필요
		System.out.println(month + "월");
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println(day + "일");
		
		System.out.println(year + "년 " + month + "월 " + day + "일");
		
		// 요일(DAY_OF_WEEK)
		int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK); // 일요일: 1 ~ 토요일: 7
		
		// 요일 판별 => Calendar.요일명 상수를 활용
		switch (dayOfWeek) {
		case Calendar.SUNDAY:		System.out.println("일요일"); break;
		case Calendar.MONDAY:		System.out.println("월요일"); break;
		case Calendar.TUESDAY:		System.out.println("화요일"); break;
		case Calendar.WEDNESDAY:	System.out.println("수요일"); break;
		case Calendar.THURSDAY:		System.out.println("목요일"); break;
		case Calendar.FRIDAY:		System.out.println("금요일"); break;
		case Calendar.SATURDAY:		System.out.println("토요일"); break;
		}
		
		// 오전/오후
		int amPm = cal.get(Calendar.AM_PM);
		String strAmPm = "";
		if(amPm == Calendar.AM) {
			strAmPm = "오전";
		} else { // AM 또는 PM 이므로
			strAmPm = "오후";
		}
		
//		else if(amPm == Calendar.PM) {
//			strAmPm = "오후";
//		}
		
		// 삼항연산자 사용시
		strAmPm = amPm == Calendar.AM ? "오전" : "오후";
		System.out.println("-----------------------------");
		// 시간(HOUR), 분(MINUTE), 초(SECOND)
//		int hour = cal.get(Calendar.HOUR); // 12시간제
		int hour = cal.get(Calendar.HOUR_OF_DAY); // 24시간제
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println(hour + "시" + min + "분" + sec + "초");
		System.out.println("================================");
		
		// Calendar <-> Date 객체 상호 변환
		// 1. Calendar -> Date 로 변환
		// => Calendar 객체의 getTime() 메서드 호출하여 Date 타입으로 리턴
		Date date = cal.getTime(); // 현재 날짜 및 시각 정보가 Date 타입으로 리턴됨
		System.out.println(date); // toString() 생략됨
		
		// 2. Date -> Calendar 로 변환
		// => Calendar 객체가 있는 상태에서 setTime() 메서드 파라미터로 Date 객체를 전달
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date);
		System.out.println(cal2.get(Calendar.YEAR));
		
	}

}
