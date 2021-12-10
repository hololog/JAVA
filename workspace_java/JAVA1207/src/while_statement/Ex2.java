package while_statement;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * 중첩 while문
		 * - while문 내에 또 다른 while문을 기술하여 반복 문장을 여러번 반복하는 문
		 * 
		 * < 기본 문법 >
		 * 초기식1;
		 * while(조건식1){
		 * 		실행문1;
		 * 
		 * 		초기식2;
		 * 		while(조건식2){
		 * 			실행문2;
		 * 			증감식2;
		 * 		}
		 * 
		 *		증감식1;
		 * }
		 * 
		 * */
		/*
		 * do ~ while문
		 * - while문과 달리 처음부터 조건을 판별하지 않고
		 *   블록문 내의 실행 문장을 먼저 실행한 후 나중에 조건을 검사
		 * - while문을 조건식 판별 결과에 따라 실행문이 단 한번도 실행되지 않을 수 있지만,
		 *   do ~ while문은 조건식 판별 결과를 나중에 확인하기때문에 최소한 한번의 실행은 보장된다!
		 * 
		 * 
		 * < 기본 문법 >
		 * 초기식;
		 * do {
		 * 
		 * 		실행문장들....
		 * 		증감식;
		 * 
		 * } while(조건식);
		 * 
		 * 
		 * 
		 * 
		 * */
		int i=1;
		
		while(i < 60) {
			
			System.out.println("i = " + i);
			
			int j=1;
			while(j < 60) {
				System.out.println("---------- j = " + j);
				j++;
			}
			
			
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
