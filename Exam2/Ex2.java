
class Unit {}
class AirUnit extends Unit {}
class GroundUnit extends Unit {}
class Tank extends GroundUnit {}
class AirCraft extends AirUnit {}

public class Ex2 {

	public static void main(String[] args) {
		Unit u = new GroundUnit();
		Tank t = new Tank();
		AirCraft ac = new AirCraft();
		// Q1)
		// 다음중 형변환을 올바르게 하지 않은 것을 모두 고르시오.
		// 1. u = (Unit)ac;
		// 2. u = ac;
		// 3. GroundUnit gu = (GroundUnit)u;
		// 4. AirUnit au = ac;
		// 5. t = (Tank)u;
		// 6. GroundUnit gu = t;
		// => 5
		// -----------------------------------------
		// Q2)
		// 클래스(정적)변수, 인스턴스변수, 로컬변수 로 분류하시오.
		// 클래스변수: width, height
		// 인스턴스변수: num
		// 로컬변수: n, card
		Card card = new Card(1);
		
		// -----------------------------------------
		// Q3)
		// final을 붙일 수 있는 대상과 붙였을때 그 의미를 작성하시오.
		// 로컬변수 - 값을 변경할 수 없다. 
		// 멤버변수 - 값을 변경할 수 없다.
		// 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다.
		// 메서드 - 오버라이딩을 할 수 없다.
		
	}

}

class Card {
	static int width;
	static int height;
	
	int num;
	
	public Card(int n) {
		num = n;
	}
	
}










