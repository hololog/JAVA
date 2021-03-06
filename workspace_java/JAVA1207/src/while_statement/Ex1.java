package while_statement;

public class Ex1 {

	public static void main(String[] args) {

		/*
		 * while문
		 * => 조건식의 위치가 고정되어 있음
		 * => 초기식은 while문보다 윗쪽에 위치해야하며
		 *    증감식은 while문 안쪽에 위치해야합니다.
		 * => 주로 반복횟수를 알수 없을때 사용!!!   
		 *    ※ for문과 while문은 100% 상호 변환 가능
		 *    
		 * < 기본 문법 >
		 * 초기식;
		 * 
		 * while( 조건식 ){
		 * 		// 조건식이 true일 동안 반복할 실행문
		 * 		// 증감식;
		 * }
		 * 
		 * */
		
		int i=0;
		while(i<10) {
			System.out.println(i + " 안녕하세요");
			i++;
		}
		System.out.println("------------------");
		// (1 2 3 4 5 6 7 8 9 10 출력)
		i=1;
		while(i < 11) {
			i++;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("------------------");
		// 2 4 6 8 10 출력
		i=2;
		while(i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
		System.out.println();
		System.out.println("------------------");
		// 10 9 8 7 6 ... 2 1 로 출력
		i = 10;
		while(i >= 1) {
			System.out.print(i + " ");
			i--;
		}
		
		
		
		
		
		
		
		
		
	}

}
