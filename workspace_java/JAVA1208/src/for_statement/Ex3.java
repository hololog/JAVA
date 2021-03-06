package for_statement;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 중첩 for문
		 * - for문 내에 또 다른 for문을 기술하여 반복 문장을 여러번 반복하는 문
		 * - 기존 반복문을 바깥쪽 for문 이라고 가정했을때
		 *   해당 반복문 내에서 다시 반복을 수행하는 for문을 안쪽 for문이라고 함.
		 *   => 안쪽 for문 반복 횟수 = 안쪽 for문 반복횟수 * 바깥쪽 for문 반복횟수
		 *   
		 * < 기본 문법 >
		 * for(초기식1; 조건식1; 증감식1){
		 * 
		 * 		for(초기식2; 조건식2; 증감식2){
		 * 
		 * 		}
		 * 
		 * }
		 * 
		 * 
		 * */
		
		// 중첩for문을 활용한 시계 구현
		// => 0분 ~ 59분까지 1씩 증가할 동안 각 분마다 0초~59초 까지 1씩 증가
		/* 0분0초
		 * 0분1초
		 * 0분2초
		 * ...
		 * 0분59초
		 * 1분0초
		 * 1분1초
		 * ...
		 * 59분58초 
		 * 59분59초
		 * */
		
//		for(int min=0; min<=59; min++) {
//			
//			for(int sec=0; sec<=59; sec++) {
//				System.out.print(min + "분" + sec + "초");
//				System.out.println();
//			}
//			
//		}
		System.out.println();
		// 시(0~23) 분(0~59) 초(0~59)
		for(int h=0; h<=23; h++) {
			for(int m=0; m<=59; m++) {
				for(int s=0; s<=59; s++) {
					System.out.println(h + "시" + m + "분" + s + "초");
				}
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
