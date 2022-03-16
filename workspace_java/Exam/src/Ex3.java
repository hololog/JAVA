
/*
 * 클래스 작성 문제
 * 
 * 클래스 이름: Student
 * 멤버변수: 이름(문자열, name), 성적(정수, score)
 * 메서드: 이름(name)과 성적(score)를 출력하는 print() 메서드 정의 (파라미터없음, 리턴값 없음)
 * 
 * */

class Studnet {
	String name;
	int score;
	
	public void print() {
		System.out.println("이름: " + this.name);
		System.out.println("성적: " + this.score);
	}
}

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 객체 생성 후 사용
		 * 
		 * Student 클래스의 객체를 생성해서
		 * 홍길동, 90으로 초기화 한 후 출력
		 * 
		 * */
		Studnet studnet = new Studnet();
		studnet.name = "홍길동";
		studnet.score = 90;
		
		studnet.print();
		
		
		
	}

}
