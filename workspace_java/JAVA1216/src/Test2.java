import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 파스칼에 삼각형
		// 크기 N을 입력받고 N크기의 파스칼 삼각형을 출력 하시오
		
		// 입력 예시) 6
		// 출력 예시)
		// 1
		// 1 1
		// 1 2 1
		// 1 3 3 1
		// 1 4 6 4 1
		// 1 5 10 10 5 1
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[][] pascal = new int[N][];
		for(int i = 0; i < pascal.length; i++) {
			pascal[i] = new int[i+1];
		}
		
		for(int i = 0; i < pascal.length; i++) {
			for(int j = 0; j < pascal[i].length; j++) {
				
				if(j == 0 || i == j) {
					
					pascal[i][j] = 1;
					
				} else {
					
					pascal[i][j] = pascal[i-1][j] + pascal[i-1][j-1];
					
				}
				
			}
		}
		
		
		for(int[] a : pascal) {
			for(int n : a) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
