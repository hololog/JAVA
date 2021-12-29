package static_var;

public class Ex4 {
	/*
	 * < staitc 멤버(클래스 멤버)와 인스턴스 멤버의 메모리 할당 순서 >
	 * 0. 클래스가 메모리에 로딩
	 * 1. static 키워드가 선언된 모든 멤버(변수 및 메서드)가 메모리에 로딩됨
	 * 2. static 키워드가 선언된 멤버 변수 a, c를 로딩하기 위해서
	 *    우변의 check() 메서드가 실행되어야 하므로 check() 메서드가 호출
	 *    => 이때, check() 메서드도 static 메서드 이므로 메모리에 로딩된 상태
	 *    => a와 c중 윗줄의 코드부터 차례대로 실행되므로
	 *       1) static int a가 로딩되기 때문에 check(1)이 호출되어 "call : 1" 출력됨
	 *       2) static int c가 로딩되기 때문에 check(3)가 호출되어 "call : 3" 출력됨
	 * 3. 모든 static 멤버의 로딩이 끝난 후 main() 메서드가 자동으로 호출됨(프로그램 시작점)
	 *    => "main() 메서드" 출력됨
	 * 4. main() 메서드 내에서 Ex클래스의 인스턴스가 생성됨
	 *    => 인스턴스 생성 시 인스턴스 멤버변수 int b가 메모리에 로딩됨
	 *       이 때, int b의 값 할당을 위해 check(2) 메서드가 호출되므로
	 *       "call : 2" 출력됨
	 * 
	 * 
	 * */
	int b = check(2);	// 4번(인스턴스 멤버변수)
	
	static int a = check(1);	// 1번(static 멤버변수)
	
	public static int check(int i) {	// static 메서드
		System.out.println("call : " + i);
		return 0;
	}
	
	public static void main(String[] args) {	// static 메서드
		System.out.println("main() 메서드");	// 3번
		Ex4 ex = new Ex4();	// 인스턴스 생성
	}

	static int c = check(3);	// 2번(static 멤버변수)
}
