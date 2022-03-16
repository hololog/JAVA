
public class Ex2 {

	public static void main(String[] args) {

		/*
		 * for <--> while 전환
		 * 무엇을 수행하는 코드인지 설명
		 * */
		
//		int dan = 4;
//		for(int i = 1; i <= 9; i++) {
//			System.out.println(dan + " * " + i + " = " + (dan*i));
//		}
//		int i = 1;
//		while(i <= 9) {
//			System.out.println(dan + " * " + i + " = " + (dan*i));
//			i++;
//		}
		
		/*
		 * 코드를 보고 출력을 예상하는 문제
		 * 이유도 설명
		 * 
		 * */
		String season = "봄";
		switch (season) {
		case "봄":	
			System.out.println("따뜻");
		case "여름":
			System.out.println("덥다");
		case "가을":
			System.out.println("쌀쌀");
		case "겨울":
			System.out.println("춥다");
		}
		
		/*
		 * 형변환 (원인 및 해결책)
		 * int i = 10 + 1.0;
		 * 
		 * char ch = 'A';
		 * ch = ch + 2;
		 * 
		 * */
		
		/*
		 * 배열 선언 및 초기화
		 * int[] arr;
		 * int arr[];
		 * {1, 2, 3} (선언과 동시에 초기화 즉, 한줄에 표현할때)
		 * new int[3];
		 * new int[3]{1, 2, 3} (X)
		 * new int[]{1, 2, 3} (O)
		 * 
		 * */
		
	}

}
