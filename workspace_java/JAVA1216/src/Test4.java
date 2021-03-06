import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
//		도로 교통상황이 숫자로 주어진다.
		
//		출발 70 80 60 20 30 50 10 80 77 89
//			      ||    ||    ||
//		    70 60 40 50 55 65 23 44 37 88 도착
		
//		북 쪽에서 남쪽 다리 index번호가 주어진다.
//		이때, 가장 최소 시간이 소요되는 다리는 몇번 다리인지 출력하고 최소시간을 함께 출력해보자!
		
//		출력 예시) 다리번호: 6
//				 최소시간: 512
		
//		주의사항.
//		1. 무조건 다리를 1번 건너야함 (도착지점이 남쪽이기 때문에)
//		2. 다리를 여러번 건널수 없고 딱, 한번만 가능
//		3. 다리를 건널때에는 남쪽, 분쪽 소요시간이 같이 소요됨. (즉, 같이 합산해야함)
//		4. 소요시간이 같은 경우가 발생하면 낮은 다리번호를 출력
		
		// 입력
		Scanner sc = new Scanner(System.in);
		int[] North = new int[10];
		int[] South = new int[10];
		int[] Bridge = new int[3];
		int[] result = new int[3];
		
		for(int i=0; i<North.length; i++) {
			North[i] = sc.nextInt();
		}
		for(int i=0; i<South.length; i++) {
			South[i] = sc.nextInt();
		}
		for(int i=0; i<Bridge.length; i++) {
			Bridge[i] = sc.nextInt();
		}
		
		// 다리(Bridge) 반복
		for(int i=0; i<Bridge.length; i++) {
			result[i] = sum(North, South, Bridge[i]);
		}
		
		int minIndex = 0;
		int min = result[0];

		for(int i=1; i<result.length; i++) {
			if(min > result[i]) {
				min = result[i];
				minIndex = i;
			}
		}
		
		System.out.println("다리번호: " + Bridge[minIndex]);
		System.out.println("최소시간: " + min);
	}
	
	public static int sum(int[] North, int[] South, int Bridge) {
		int sum = 0;
		// 북쪽(North) 합계
		for(int i = 0; i <= Bridge; i++) {
			sum += North[i];
		}
		
		// 남쪽(South) 합계
		for(int i = Bridge; i < South.length; i++) {
			sum += South[i];
		}
		return sum;
	}
	

}
