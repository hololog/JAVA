package switch_case;

public class Test3 {

	public static void main(String[] args) {
		
		// 세 정수 n1, n2, n3 중 최대값을 출력
				int n1=223, n2=123, n3=452;
				String result = "최대값 : ";
				int max;
				
				max = (n1 > n2) ? n1 : n2;
				max = (max > n3) ? max : n3;
				
//				if(n1 > n2) max = n1;
//				else 		max = n2;
//				if(max < n3) max = n3;
				
//				if(n1 > n2) {
//					
//					if(n1 > n3) result += n1;
//					else		result += n3;
//					
//				} else {
//					if(n2 > n3)	result += n2;
//					else		result += n3;
//					
//				}
				
				System.out.println(result + max);
		
		
		
		
		
		
	}

}
