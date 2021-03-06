package static_var;

import java.util.Scanner;

				
class CalcMin {
	public static Bridge min(Bridge[] bridges) {
		Bridge minBridge = bridges[0];
		
//		for(Bridge b : bridges) {
//			if(minBridge.total > b.total) minBridge = b;
//		}
		
		for(int i = 1; i < bridges.length; i++) {
			if(minBridge.total > bridges[i].total) minBridge = bridges[i];
		}
		return minBridge;
	}
}

class Bridge {
	int index;
	int total;
}

class Road {
	int[] arr = new int[10];
	
	public int sum(int start, int end) {
		int sum = 0;
		for(int i = start; i <= end; i++) {
			sum += this.arr[i];
		}
		return sum;
	}
}

public class Ex6 {

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
		
		Scanner sc = new Scanner(System.in);
		// 길 생성
		Road North = new Road();
		Road South = new Road();
		// 북쪽 data 받음
		for(int i=0; i<North.arr.length; i++) {
			North.arr[i] = sc.nextInt();
		}
		// 남쪽 data 받음
		for(int i=0; i<South.arr.length; i++) {
			South.arr[i] = sc.nextInt();
		}
		
		Bridge bridge1 = new Bridge();
		Bridge bridge2 = new Bridge();
		Bridge bridge3 = new Bridge();
		bridge1.index = sc.nextInt();
		bridge2.index = sc.nextInt();
		bridge3.index = sc.nextInt();
		
		Bridge[] bridges = {bridge1, bridge2, bridge3};
		
		for(Bridge b : bridges) {
			b.total = North.sum(0, b.index) + South.sum(b.index, South.arr.length - 1);
		}
		
		Bridge min = CalcMin.min(bridges);
		System.out.println("다리번호: " + min.index);
		System.out.println("최소시간: " + min.total);
		
		
	}

}
