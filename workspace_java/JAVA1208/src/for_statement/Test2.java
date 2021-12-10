package for_statement;

public class Test2 {

	public static void main(String[] args) {

		/*
		 * 1~100 까지
		 * 짝수의합(even=30), 홀수의합(odd=25) 각각 누적 한 후 출력 
		 * 출력: 1~10까지 짝수의 합: XX
		 *      1~10까지 홀수의 합: XX
		 * */
		int even=0, odd=0;
		for(int i=1; i<=10; i++) {
			
			if(i%2 == 0)	even += i;
			else			odd += i;
			
		}
		System.out.println("1~10까지 짝수의 합: " + even);
		System.out.println("1~10까지 홀수의 합: " + odd);
		System.out.println("=========================");
		
		// 두정수 a ~ b까지 3의 배수의 합
		// 출력: X~X까지 3의 배수의 합
		int a=2, b=200;
		int sum = 0;
		for(int i = a; i <= b; i++) {
			if(i%3==0)	sum += i;
		}
		System.out.println(a + "~" + b + "까지 3의 배수의 합: " + sum);
		System.out.println("==================================");
		/*
		 * 간단 3,6,9 게임
		 * - 정수 1 ~ 100까지 1씩 증가하면서 반복
		 * - 각 정수를 화면에 출력
		 * - 단, 정수의 "일의 자리가" 3, 6, 9 중 하나일 경우 숫자 출력 대신에 "짝" 출력
		 * ex) 1 2 짝 4 5 짝 7 8 짝 10 11 12 ... 90 91 92 짝 94 95 짝 97 98 짝 100
		 * ex) 1 2 4 5 7 8 10 11
		 * */
		
		for(int i=1; i<=100; i++) {
			int num = i % 10;
			if(num == 3 || num == 6 || num == 9) {
				continue;
			} else {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("==================");
		// 1~100까지의 합이 50일 넘을 경우 반복을 중단
		int sum2=0;
		for(int i=1; i<=100; i++) {
			sum2 += i;
			if(sum2 > 50) {
				System.out.println("i: " + i);
				break;
			}
		}
		System.out.println("sum2: " + sum2);
		
		// 7의 갯수를 카운트 해보자!
		// int n = 247427723
		// 출력: 7의 갯수: XX
		int n = 247427723;
		int count = 0;
//		while(n != 0) {
//			count++;
//			n /= 10;
//		}
//		System.out.println("count: " + count);
		
		// 굳이..for로.....
		
		String s = Integer.toString(n);
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == '7') {
				count++;
			}
		}
		System.out.println("count: " + count);
		
		
		
		
		
		
		
		
		
		
	}

}
