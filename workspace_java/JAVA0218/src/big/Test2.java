package big;

import java.text.*;
import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		// Date 객체를 생성하여 오늘 날짜 및 현재 시각을 다음과 같이 변환하여 출력
		// ex) 2022년 02월 18일(금) 오전 11시 12분 40초
		Date now = new Date();
		System.out.println(now);
		
		String pattern = "yyyy년 MM월 dd일(E) a hh시 mm분 ss초";
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String strNow = sdf.format(now);
		System.out.println(strNow);
		
		// -----------------------------------------------
		String pattern2 = "yyyy년 MM월 dd일(E) a hh시 mm분 ss초";
		
		System.out.println(new SimpleDateFormat(pattern2).format(new Date()));
		
		
	}

}
