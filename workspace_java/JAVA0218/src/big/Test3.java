package big;

import java.text.*;

public class Test3 {

	public static void main(String[] args) throws Exception {
		int money = 128000;
		// 정수 128000을 128,000원 형식으로 변경하여 출력
		String pattern = "#,###원";
		DecimalFormat df = new DecimalFormat(pattern);
		String strMoney = df.format(money);
		System.out.println(strMoney);
		// 문자열 "128,000원" 을 정수 128000 으로 변경하여 출력
		long parsedMoney = (long)df.parse(strMoney);
		System.out.println(parsedMoney);
		
	}

}
