package for_statement;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 1			i=1 일때 j= 1 ~ 1 까지
		 * 1 2			i=2 일때 j= 1 ~ 2 까지
		 * 1 2 3		i=3 일때 j= 1 ~ 3 까지
		 * 1 2 3 4		i=4 일때 j= 1 ~ 4 까지
		 * 1 2 3 4 5	i=5 일때 j= 1 ~ 5 까지
		 * 
		 * */
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("====================");
		/*
		 * *****	i=5 일때 j= 1 ~ 5 까지
		 * ****		i=4 일때 j= 1 ~ 4 까지
		 * ***		i=3 일때 j= 1 ~ 3 까지
		 * **		i=2 일때 j= 1 ~ 2 까지
		 * *		i=1 일때 j= 1 ~ 1 까지
		 * 
		 * */
		for(int i=5; i>=1; i--) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("=======================");
		
		
		
		
		
		
		
		
	}

}
