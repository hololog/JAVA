import java.util.*;

public class Ex1 {

	public static void main(String[] args) {
		// Q1)
		// 1. 슈퍼클래스의 멤버를 서브클래스에서 선언 없이 사용할 수 있도록 물려받는 것은?
		// => 상속(상속성, Inheritance)
		
		// 2. 객체의 상세한 내용을 외부에 숨기고 단순히 메시지만으로 객체와 상호작용을 하는것?
		// => 캡슐화(은닉, Encapsulation) 예) private, getter/setter
		
		// 3. 현실세계 그대로 객체로 표현하기 보다는 공통점을 추출하여 상위 개념을 
		//    만들고 상세내역을 없애 나가는 과정
		// => 추상화(Abstraction) 예) 추상메서드, 추상클래스 -> 인터페이스
		
		// 4. 상속관계에서 슈퍼클래스 타입으로 서브클래스의 인스턴스를 참조할수 있는 것?
		// => 다형성(Polymorphism) 예) 업캐스팅, 다운캐스팅
		// ---------------------------------------------------------------
		
		// Q2)
		// 접근 제한자를 접근 범위가 좁은 것 부터 넓은 것 순으로 나열하시오.
		// => private - default - protected - public
		
		// ---------------------------------------------------------------
		
		// Q3)
		// 인스턴스가 어떤 클래스의 하위 타입인지를 판별하기 위해 사용하는 연산자는?
		// => instanceof
		
		// ---------------------------------------------------------------
		
		// Q4)
		// 자바에서 제공하는 다양한 클래스들의 모음을 무엇이라고 하는가?
		// => API 또는 Library
		
		// ---------------------------------------------------------------
		
		// Q5)
		// 자바에서 가장 많이 사용하는 String 등의 클래스 파일들을 포함하는 패키지이며
		// 명시적으로 import 하지 않아도 자동으로 import되는 패키지는?
		// => java.lang 패키지
		
		// ---------------------------------------------------------------
		
		// Q6)
		// 자바에서는 다양한 자료구조를 별도로 구현하지 않아도 사용 가능하도록
		// java.util 패키지에 클래스 또는 인스턴스 형태로 제공하는데, 이러한 클래스들의 모음을 무엇이라고 하는가?
		// => Collection Framework(컬렉션 프레임워크), Collection API(컬렉션 API)
		
		// ---------------------------------------------------------------
		
		// Q7)
		// 자료구조를 구현한 클래스중 데이터의 중복을 허용하지 않고, 저장 순서를 유지하지 않는 것은?
		// => Set
		
		// ---------------------------------------------------------------
		
		// Q8)
		// java.util에 있는 Random 클래스를 활용하여 1 ~ 10 사이의 난수를 발생시키는 코드를 작성
		Random r = new Random();
		System.out.println(r.nextInt(10)+1);
		
		
		// ---------------------------------------------------------------
		// Q9)
		// 1. 개발자가 의도하지 않은 실수로 인해 발생하는 프로그램의 문제는? 예외(Exception)
		// 2. 개발자가 예외처리를 위해 java.lang 패키지의 어떤 계열의 클래스를 활용 하는가? Exception
		// 3. 개발자가 예외처리를 위해 어떤 구문을 사용하여 처리하는가? try - catch
		// 4. 예외발생 여부와 관계없이 항상 실행되어야하는 문장은 어떤 블록에 기술하는가? finally
		
		// ---------------------------------------------------------------
		
		// Q10)
		// 1. 2개 이상의 작업을 마치 동시에 수행하는 것 처럼 동작하기 위한 개념은? Thread(쓰레드)
		// 2. 위 개념을 위해 자바 API중 어떤 클래스 또는 어떤 인터페이스를 사용? Thread, Runnalble
		
		// ---------------------------------------------------------------
		
		// Q11) str에 저장된 문자열이 "ADMIN" 과 같은지 판별(단, 대소문자 구별 X)
		String str = "admin";
		str.equalsIgnoreCase("ADMIN");
		
		// ---------------------------------------------------------------
		
		// Q12)
		// 데이터베이스에 접근하여 데이터를 처리할 수 있는 기능을 클래스 형태로 제공하는데
		// 이러한 데이터베이스 연동을 위한 기법 또는 클래스들의 모음을 무엇이라고 하는가?
		// => JDBC(Java DataBase Connectivity)
		
		// ---------------------------------------------------------------
		
		// Q13)
		// 자바는 다른 언어와 달리 메모리 관리를 개발자가 직접 하지 않는다.
		// JVM에 포함되어있는 "이것"은 무엇인가?
		// => 가비지 컬렉터(G.C: Garbage Collector)
		
		Student st = new Student("홍길동", 20171111);
	}

}

/*
 * 이름(name, 문자열)과 학번(number, 정수)을 멤버변수로 갖는 학생 클래스(Student)를 작성
 * 또한, main 메서드 내에서 Student 클래스의 인스턴스를 생성하여
 * "홍길동", 20171111 로 초기화하는 코드를 작성 (생성자를 사용한 초기화)
 * */
class Student {
	String name;
	int number;
	
	public Student(String name, int number) {
		this.name = name;
		this.number = number;
	}
}

/*
 * 해당 Employee 클래스를 상속받아
 * 다음 조건에 해당하는 Manager 클래스를 정의
 * */
class Employee {
	String name;
	int salary;
	
	public String getEmployee() {
		return name + " " + salary;
	}
}
/*
 * 조건1. Manager 클래스는 Employee 클래스가 갖는 멤버는 물론, 새로운 멤버변수인 부서명(depart)를 갖는다.
 * 조건2. 사원정보(사원명, 연봉, 부서명)을 리턴하는 메서드 getManager()를 갖는다.
 * */
class Manager extends Employee {
	String depart;
	
	public String getManager() {
		return getEmployee() + " " + depart; 
	}
}









