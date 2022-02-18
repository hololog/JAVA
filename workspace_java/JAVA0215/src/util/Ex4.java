package util;

import java.time.*;
import java.time.format.*;
import java.util.*;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * java.time 패키지
		 * - 날짜 및 시각 정보를 관리하는 클래들의 모음 패키지(JDK 8부터 제공됨)
		 *   => Date 및 Calendar 클래스에 비해 직관적이므로 사용하기 쉽다.
		 *   
		 * - LocalDate 클래스 - 날짜 관련 기능 제공
		 * - LocalTime 클래스 - 시각 관련 기능 제공
		 * - LocalDateTime 클래스 - 날짜 및 시각 관련 기능 제공
		 * - Calendar 클래스처럼 객체 생성없이 시스템이 생성한 객체를 리턴받아 사용
		 *   => 생성자가 보이지 않도록 은닉되어 있음(= 싱글톤 디자인 패턴)
		 * - 각 클래스의 now() 메서드를 호출하여 현재 시스템의 날짜 및 시각 정보 가져오고
		 *   각 클래스의 of() 메서드를 호출하여 날짜 및 시각 정보 설정
		 *   => static 메서드로 제공되므로 클래스명만으로 접근 가능
		 * - getXXX() 메서드를 호출하여 상세 항목 정보 가져오기 가능
		 *   => (ex. 연도: getYear(), 시각: getHour())  
		 *       
		 * */
		
		// 각 객체의 정보 가져오기 = XXX.now() 메서드 사용
		// 1. 날짜 정보를 관리하는 LocalDate 클래스
		LocalDate date = LocalDate.now();
		System.out.println(date); // 2022-02-15 출력됨
		
		// 2. 시각 정보를 관리하는 LocalTime 클래스
		LocalTime time = LocalTime.now(); // 현재 시스템의 시각 정보를 리턴
		System.out.println(time); // 17:13:45.023710200(24시간제, 밀리초단위까지 표현)
		
		// 3. 날짜와 시각 정보를 함께 관리하는 LocalDateTime 클래스
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime); // 2022-02-15T17:15:13.031506900
		
		System.out.println("----------------------------");
		// 각 객체의 값 설정(=변경) XXX.of() 메서드 사용
		// 1. LocalDate 객체의 날짜 설정 => 2000년 1월 1일로 변경
		LocalDate date2 = LocalDate.of(2000, 1, 1);
		System.out.println(date2);
		
		// 2. LocalTime 객체의 시각 설정 => 9시 10분 59초로 변경
		LocalTime time2 = LocalTime.of(9, 10, 59);
		System.out.println(time2);
		
		// 3. LocalDateTime 객체의 날짜 및 시각 설정 => 1999년 12월 31일 23시 59분 59초로 변경
		LocalDateTime dateTime2 = LocalDateTime.of(1999, 12, 31, 23, 59, 59);
		System.out.println(dateTime2);
		
		System.out.println("------------------------------");
		
		// getXXX() 메서드를 사용한 상세 정보 가져오기
		int year = date.getYear();
		int month = date.getMonthValue(); // 주의! getMonth() 메서드는 Month 타입 객체 리턴
		int day = date.getDayOfMonth();
		System.out.println(year + "/" + month + "/" + day);
		
		// getMonth() 메서드를 통해 리턴되는 Month 타입 객체 활용법
		Month eMonth = date.getMonth(); // enum 타입 객체 형태로 리턴됨
		System.out.println(eMonth); // FEBRUARY
		// => 대한민국 기준 표현법으로 변환할 경우
		//    Month 타입 객체의 getDisplayName() 메서드를 호출하여
		//    표시방식(TextStyle.XXX)과 국가언어(Locale.XXX) 전달
		System.out.println(eMonth.getDisplayName(TextStyle.SHORT, Locale.KOREAN));
		
		System.out.println("-----------------------------------");
		
		LocalDate now = LocalDate.now(); // 현재 날짜 가져오기
		System.out.println("오늘은 " + now + " 입니다.");
		
		// 연도 연산(2년뒤 => plusYears() 메서드 사용)
//		System.out.println("2년 뒤는 " + now.plusYears(2) + " 입니다.");
		
		LocalDate afterTwoYear = now.plusYears(2);
		System.out.println("2년 뒤는 " + afterTwoYear + " 입니다.");
		
		// 월 연산(2개월 뒤)
		System.out.println("2개월 뒤는 " + now.plusMonths(2) + " 입니다.");
		// => 연도 및 일자에 영향 있음
		System.out.println("2개월 뒤는 " + now.withMonth(3) + " 입니다.");
		// => 현재해의 2월로연산됨 연도 및 일자는 영향 없음
		
		// 일 연산(20일 뒤)
		System.out.println("20일 뒤는 " + now.plusDays(20) + " 입니다.");
		
		// 빌더 패턴(Builder Pattern)을 활용하여 메서드를 연쇄적으로 호출 가능
		System.out.println(now.plusYears(2).plusMonths(2).plusDays(20));
		// 2년 2개월 20일 뒤의 날짜 연산
		
		/*
		 * Builder Pattern 이란?
		 * - 어떤 객체의 메서드 리턴 타입이 자기자신일때
		 *   리턴값을 전달받아 다시 다른 메서드를 연쇄적으로 호출하는 형태의 코드 작성 기법
		 * - ex) String 클래스의 메서드 리턴타입이 대부분 String 타입이므로
		 *       str.trim().replace().split()  
		 * */
		
		
	}

}









