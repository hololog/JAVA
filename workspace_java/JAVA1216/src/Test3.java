import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		// 기억력 테스트
		// N개의 숫자를 먼저 말해준다 
		// M개의 질문을 받아 그 숫자가 있었는지 판별하시오
		// 있으면 1 없으면 0을 출력
		// 입력 예시)
//					5
//					2 52 23 55 100
//					4
//					5 2 55 99
		// 출력 예시)
//					0 1 1 0
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] numbers = new int[N];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		int[] targets = new int[M];
		for(int i = 0; i < targets.length; i++) {
			targets[i] = sc.nextInt();
		}
		
		for(int i=0; i<targets.length; i++) {
			boolean result = existsNum(numbers, targets[i]);
			if(result) System.out.print("1 ");
			else	   System.out.print("0 ");
		}
		
	}	// main 메서드 끝
	
	public static boolean existsNum(int[] numbers, int target) {
		boolean result = false;
		for(int i=0; i<numbers.length; i++) {
			if(target == numbers[i]) result = true;
		}
		return result;
	}
	
	
	
	
	

}
