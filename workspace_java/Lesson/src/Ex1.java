import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		// 정수 2개가 입력되면 아래와 같이 출력
		// 5 7
		// "홀수 + 홀수 = 짝수"
		// 2 7
		// "짝수 + 홀수 = 홀수"
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		
		String result = "";
		
		result += (n1%2==0) ? "짝수 + " : "홀수 + ";
		result += (n2%2==0) ? "짝수 = " : "홀수 = ";
		result += (n1+n2)%2==0 ? "짝수" : "홀수";
		
//		if(n1%2 == 0) {
//			result += "짝수 + ";
//			if(n2%2 == 0)	result += "짝수 = 짝수";
//			else			result += "홀수 = 홀수";
//			
//		} else {
//			
//			if(n2%2 == 0)	result += "짝수 = 홀수";
//			else			result += "홀수 = 짝수";
//			
//		}
		System.out.println(result);
		
		
		
		
		
	}

}
