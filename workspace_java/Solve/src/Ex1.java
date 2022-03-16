
public class Ex1 {

	public static void main(String[] args) {
		// 단답형 14문제
		/*
		 * [문항1] 구조적 프로그래밍 언어에 해당하는 프로그래밍 언어를 한 가지만 쓰시오.
		 * 순자, 절차(구조적) 프로그래밍 언어 : C(언어), Pascal
		 * 객체지향 프로그래밍 언어 : C++, JAVA
		 * 
		 * [문항2] 다음 중 키워드(예약어)에 해당하는 것을 모두 고르시오.
		 * return, For, 자바, switch, void
		 * 정답: return, swtich, void
		 * 
		 * [문항3] 
		 * - 문자열로 된 이름 "홍길동" 을 저장하는 변수 name : String name = "홍길동";
		 * - 실수 3.14를 저장하는 변수 dNum : double dNum = 3.14;
		 * - 문자 'A' 를 저장하는 변수 ch : char ch = 'A';
		 * - 정수 300억 을 저장하는 변수 num : long num = 300억;
		 * 
		 * [문항4] 논리 연산자 중 [피연산자의 값이 모두 true인 경우에만 결과값이 true] 가 되는 연산자??
		 * &&, &
		 * 
		 * [문항5] 
		 * int num = 10 % 3;
		 * 
		 * if(num == 0){
		 *     System.out.println(num + " = 0");
		 * } else if(num % 2 == 1){
		 *     System.out.println(num + " = 홀수");
		 * } else {
		 * 	   System.out.println(num + " = 짝수");
		 * }
		 * 
		 * 정답 : 1 = 홀수
		 * 
		 * 
		 * [문항6]
		 * int dan = 2;
		
			System.out.println(" < " + dan + "단 >");
			
			for(int i=1; i<=9; i++) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
			
			int i=1;
			while(i < 10) {
				System.out.println(dan + " * " + i + " = " + (dan*i));
				i++;
			}
			
			[문항7] switch-case
			int n = 2;
			case 1: Java
			case 2: Programming
			case 3: ITWILL
			default: Done
			
			[문항8]
			char ch = 'A';
			ch = ch + 2;
			
			ch = (char)(ch + 2);
			ch = ch += 2;
			
			[문항9] 정수형 변수 3개를 저장 가능한 배열 arr을 선언하고,
				   임의의 정수 3개로 초기화하는 코드를 '한 문장' 으로 작성하시오.
			정답 : int[] arr = {1, 2, 3} or new int[]{1, 2, 3}
			
			[문항10] Person 클래스를 정의 하시오!
			- 멤버변수: 이름(문자열, name)과 나이(정수, age)
			- 메서드: 이름(name)과 나이(age)를 출력하는 print() 메서드 정의 (파라미터 없음, 리턴값 없음)
			class Person {
				String name;
				int age;
				
				public void print() {
					System.out.println(name + ", " + age);
				}
			}
			
			[문항11]
			
			Person p = new Person();
			p.name = "홍길동";
			p.age = 20;
			p.print();
			
			[문항12]
			alert()
			
			[문항13] 이전 페이지
			history.back(), history.go(-1)
			
			[문항14]
			location.href = "http://www.itwillbs.co.kr"
			
		 * */
	}

}













