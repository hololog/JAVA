import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * n개의 숫자가 입력되면
		 * n개의 숫자를 왼쪽으로 하나씩 돌려서 출력하시오!
		 * 
		 * 입력예시)
		 * 5
		 * 1 2 3 4 5
		 * 출력 예시)
		 * 1 2 3 4 5
		 * 2 3 4 5 1
		 * 3 4 5 1 2
		 * 4 5 1 2 3
		 * 5 1 2 3 4
		 * 
		 * */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		// 2번 방법
		int[] arr = new int[n*2];
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			arr[i] = num;
			arr[i+n] = num;
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n+i; j++) {
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}
		
		
		// 1번 방법
		/*
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[j] + " ");
			}
			// rotation
			rotation(arr);
			
			System.out.println();
		}
		*/
	}
	
	public static void rotation(int[] arr) {
		int temp = arr[0];
		for(int i=0; i<arr.length-1; i++) {
			arr[i] = arr[i+1];
		}
		arr[arr.length-1] = temp;
	}
	

}
