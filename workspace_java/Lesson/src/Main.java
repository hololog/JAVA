
public class Main {
	
	// 재귀함수
	public static int m(int x) {
		if(x == 1) return 3;
		else return 2 * m(x-1);
	}
	
	public static void main(String[] args) {
		System.out.println(m(5)); 
	}

}
