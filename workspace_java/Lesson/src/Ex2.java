import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		// 숫자 로테이션
		// - 숫자의 개수 n입력받음
		// - 한칸씩 띄워서 n개의 정수를 입력받음
		// - 숫자를 로테이션한 결과를 출력(단, 왼쪽으로만 돌린다.)
		
		// ex) 5
		//     1 2 3 4 5
		
		//     1 2 3 4 5
		//     2 3 4 5 1
		//     3 4 5 1 2
		//     4 5 1 2 3
		//     5 1 2 3 4
		
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n*2];
		int num=1;
		for(int i=0; i<arr.length; i++) {
			arr[i] = num;
			num++;
			if(num == 6) num = 1;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=i; j<n+i; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
	}
	

}
