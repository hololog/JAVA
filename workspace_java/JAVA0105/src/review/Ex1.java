package review;

class Person {
	// 멤버변수
	String name;
	int age;
	
	// 생성자 (생성자 오버로딩: 식별이 가능하면 된다!)
	public Person() {
//		this.	// 멤버변수, 멤버 메서드에 접근!!
//		this();	// 단, 첫줄에 와야함!!!
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(int age) {}
	public Person(String name, int age) {}
	public Person(int age, String name) {}
	
	// 메서드
	// [접근제한자] 리턴타입 메서드명(매개변수, ...){ 구현! }
	void method() {}
	// 메서드 오버로딩	(식별이 가능하면 된다!)
	void method(String s) {}
	void method(int i) {}
	int method(String s, int i) { return 0; }
	void method(int i, String s) {}
	void method(String s1, String s2) {}
//	void method(String s2, String s1) {} // 안됨!
	
	
	// 접근제한자
	// public > protected > default > private
	// 
}





public class Ex1 {
	int a = 10;
	String nName = "차동원";
	static int b = 20;
	static String sName = "김성기";
	
	public static void main(String[] args) {
		// static
//		System.out.println(a);
//		System.out.println(nName);
		System.out.println(b);
		System.out.println(sName);
//		normalMethod();
		
		String s = "차동원";
		String s1 = new String("차동원");
		Person p = new Person();
	}
	
	public static void staticMethod() {
		System.out.println(b);
		System.out.println(sName);
//		normalMethod();	// 메모리에 아직 없음
	}
	
	public void normalMethod() {
		System.out.println(a);
		System.out.println(nName);
		System.out.println(b);
		System.out.println(sName);
		staticMethod(); // 메모리에 이미 올라가있음
	}
	
}


/*
 * 상속
 * 
 * */
class P {
	String house = "이층집";
	public void run() {
		System.out.println("느리게 뜀");
	}
}

class C extends P {
	String computer = "컴퓨터";
	@Override
	public void run() {
		System.out.println("좀 빨리 뜀");
	}
}

class S extends C {
	// 멤버변수 영역
	@Override
	public void run() {
		System.out.println("개빠름");
	}
	
//	@Override	어노테이션 안됨!
	public void method() {
		System.out.println(house);
		System.out.println(computer);
	}
}









