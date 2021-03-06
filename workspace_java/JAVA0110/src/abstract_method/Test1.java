package abstract_method;

public class Test1 {

	public static void main(String[] args) {
		// 추상클래스인 Flyer 클래스는 인스턴스 생성 불가!
//		Flyer f = new Flyer();	// 오류 발생!
		
		Bird b = new Bird();
		b.fly();
		
		SuperMan s = new SuperMan();
		s.fly();
		
		Airplane a = new Airplane();
		a.fly();
		System.out.println("-----------------");
		// Flyer 클래스 인스턴스 생성은 불가능 하지만, 참고변수 타입으로 활용 가능(다형성)
		// Bird -> Flyer 업캐스팅 후 fly() 메서드 호출
		Flyer f;
		f = new Bird();
		f.fly();
		// SuperMan -> Flyer 업캐스팅 후 fly() 메서드 호출
		f = new SuperMan();
		f.fly();
		// Airplane -> Flyer 업캐스팅 후 fly() 메서드 호출
		f = new Airplane();
		f.fly();
		System.out.println("-----------------");
		
		// Flyer배열 (크기: 3) 만들어서 각각 업캐스팅 후
		// 향상된 for문으로 fly()메서드 호출!
		Flyer[] fArr = {new Bird(), new SuperMan(), new Airplane()};
		for(Flyer flyer : fArr) {
			flyer.fly();
		}
		
	}

}

// 날아다니는 것(Flyer)
abstract class Flyer {
	public abstract void fly();	// 추상메서드
}

// Bird 클래스 정의 - Flyer 클래스 상속
// => 추상메서드 fly() 오버라이딩하여 구현("Bird 비행!" 출력)
class Bird extends Flyer {

	@Override
	public void fly() {
		System.out.println("Bird 비행!");
	}
	
}

// SuperMan 클래스 정의 - Flyer 클래스 상속
// => 추상메서드 fly() 오버라이딩하여 구현("SuperMan 비행!" 출력)
class SuperMan extends Flyer {

	@Override
	public void fly() {
		System.out.println("SuperMan 비행!");
	}
	
}


// Airplane 클래스 정의 - Flyer 클래스 상속
// => 추상메서드 fly() 오버라이딩하여 구현("Airplane 비행!" 출력)
class Airplane extends Flyer {

	@Override
	public void fly() {
		System.out.println("Airplane 비행!");
	}
	
}







