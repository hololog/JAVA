package review;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		// 시 분 이 입력되면 (시:0~23, 분:0~59 데이터가 무조건 들어온다고 가정)
		// 30분전 시 분 출력
		// ex) 입력: 12 5
		//     출력: 11 35
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		m -= 30;
		
		if(m < 0) {
			h--;
			m += 60;
		} 
		
		System.out.println(h + " " + m);
		
	}

}
