package for_statement;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {

		// 정수 n을 입력받아 n층의 별 계단을 출력
		// n = 5 인 경우
		// **		i=0 일때 공백=0, **
		//	**		i=1 일때 공백=1, **
		//	 **		i=2 일때 공백=2, **
		//	  **
		//	   **
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			System.out.println("**");
		}
		
		
		
		
		
		
	}

}
