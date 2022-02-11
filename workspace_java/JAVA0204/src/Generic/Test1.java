package Generic;

import java.util.ArrayList;
import java.util.List;

public class Test1 {

	public static void main(String[] args) {
		// Person 클래스 인스턴스 2개 생성
		// "홍길동", 20
		// "이순신", 44
		Person p1 = new Person("홍길동", 20);
		Person p2 = new Person("이순신", 44);
		
		System.out.println(p1.toString());
		System.out.println(p2);
		// ===========================================
		// Person 객체 여러개를 하나의 객체에 저장하여 관리할 경우
		// 1. Object[] 배열(Person[] 배열)을 통해 관리
		// => 배열은 크기가 불변이므로 추가적인 객체 저장 불가
		Object[] objArr = {p1, p2};	// Person -> Object 업캐스팅 되어 관리됨
		
		for(int i=0; i<objArr.length; i++) {
//			Object o = objArr[i];
//			System.out.println(o.getName()); // 컴파일에러 발생!
			
			// Object[] 배열 내의 Person 객체를 꺼내서 Person 타입 변수에 저장
//			Person p = objArr[i]; // Object -> Person 다운캐스팅 필수!
			Person p = (Person)objArr[i]; // 다운캐스팅
			
			// Getter 메서드를 호출하여 이름, 나이를 name, age변수에 저장 후 출력
			System.out.println(p.getName() + ", " + p.getAge());
			
		}
		
		// 2. Collection(ArrayList)을 활용하여 Person 객체 여러개를 관리할 경우
		// => 배열의 단점인 크기 불변을 해결하게 되므로 여러 객체를 자유롭게 추가 가능
		// 1) 제네릭을 사용하지 않을 경우
		//		- 파라미터 또는 리턴타입이 Object 타입이 되어 다양한 객체 저장 가능
		//		- 저장 시점에서 타입판별이 이루어지지 않으므로 편리하지만
		//		  대신 데이터를 꺼내는 시점에서 타입 불일치에 따른 오류 발생 가능성이 존재!
		//		- 데이터를 꺼내기 전 instanceof 연산자를 통한 타입 판별을 수행해야하며
		//		  Object 타입을 실제 데이터타입으로 다운캐스팅을 수행해야한다!
		List list = new ArrayList();
		list.add(p1);
		list.add(p2);
		list.add(new Person("강감찬", 35)); // 새로 추가되는 객체도 자동으로 확장되어 저장
		
		list.add("전지현"); // Person 객체가 아닌 데이터도 추가가 가능함
		// => Person 객체 형태로 꺼내서 사용하는 시점에서 문제가 발생 할수 있다!
		
		for(Object o : list) {
			if(o instanceof Person) {
				Person p = (Person)o;
				System.out.println(p.getName() + ", " + p.getAge());
			} else {
				System.out.println("타입 불일치!");
			}
		}
		
		System.out.println("----------------------");
		// 2) 제네릭 타입을 사용할 경우
		// 	  => 저장할 객체 타입이 Person 타입이므로 제네릭 타입 <Person> 지정
		//	  - 객체 저장 시 Person 타입 객체만 저장 가능하도록 자동으로 판별 수행
		//		즉, 잘못된 객체(데이터)가 저장될 우려가 없다!
		//	  - Object 타입으로 업캐스팅 되지 않고 Person 타입 자체로 저장되기 때문에
		//		객체(데이터)를 꺼내는 시점에도 Person 타입 그대로 꺼낼 수있다!
		//		=> 별도의 다운캐스팅 등 형변환이 불필요!
		//    - 또한, 추가적인 타입 판별도 불필요!
		List<Person> list2 = new ArrayList<Person>();
		// 제네릭타입 <Person> 지정 시 사용 가능한 객체는 무조건 Person 타입 객체만 가능!
		list2.add(p1);
		list2.add(p2);
		list2.add(new Person("강감찬", 35));	// 새로 추가되는 객체도 자동으로 확장되어 저장
		
		// Person 타입이 아닌 객체(데이터)를 추가 (add())할 경우
		// 데이터타입 판별에 의해 오류가 발생하게 된다!
//		list2.add("전지현");  // 컴파일에러 발생!
		
		// 향상된 for문 사용시 Person 타입 변수에 저장하는 작업 별도로 필요없음
		for(Person p : list2) {
			System.out.println(p);
		}
		
		System.out.println("==============================");
		
		// MemberBean 객체 3개 생성
		// 생성자에 아이디, 패스워드, 이름, 이메일, 주소, 전화번호, 휴대폰번호 전달
		// => 생성되는 3개의 객체를 ArrayList 객체에 추가(저장)
		//    (ArrayList 객체 생성 시 제네릭 타입 지정)
		// 반복문을 통해 ArrayList 객체 내의 MemberBean 객체를 꺼내서 출력
		MemberBean member1 = new MemberBean("hong", "hong", "홍길동", "hong@hong.com", "부산", "051111111", "01011111111");
		MemberBean member2 = new MemberBean("leess", "leess", "이순신", "leess@leess.com", "부산", "0512222222", "01022222222");
		MemberBean member3 = new MemberBean("kang", "kang", "강감찬", "kang@kang.com", "부산", "0513333333", "01033333333");
		
		List<MemberBean> memberList = new ArrayList<MemberBean>();
		memberList.add(member1);
		memberList.add(member2);
		memberList.add(member3);
		
		for(MemberBean member : memberList) {
			System.out.println(member);
		}
		
		
	}

}

/*
 * Person 클래스 정의
 * - 멤버변수(private): 이름(name, 문자열), 나이(age, 정수)
 * - 생성자 : 이름과 나이를 전달받아 초기화하는 생성자
 * - toString() 메서드 오버라이딩 (이름과 나이를 결합하여 리턴)
 * - Getter / Setter 정의
 * */
class Person {
	private String name;
	private int age;
	
	// Alt + Shift + S -> O
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Alt + Shift + S -> S
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	// Alt + Shift + S -> R
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}

/*
 * MemberBean 클래스 정의
 * - 멤버변수(private): 아이디(id, 문자열), 패스워드(pass, 문자열)
 * 					  이름(name, 문자열), 이메일(email, 문자열)
 * 					  주소(address, 문자열), 폰(phone, 문자열), 모바일(mobile, 문자열)
 * - 생성자 : 모든 멤버변수를 전달받아 초기화하는 생성자
 * - toString() 메서드 오버라이딩 (모든 멤버변수를 결합하여 리턴)
 * - 모든 멤버변수 Getter / Setter 정의
 * */
class MemberBean {
	private String id;
	private String pass;
	private String name;
	private String email;
	private String address;
	private String phone;
	private String mobile;
	
	public MemberBean(String id, String pass, String name, String email, String address, String phone, String mobile) {
		this.id = id;
		this.pass = pass;
		this.name = name;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "MemberBean [id=" + id + ", pass=" + pass + ", name=" + name + ", email=" + email + ", address="
				+ address + ", phone=" + phone + ", mobile=" + mobile + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}















