package Lambda;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Ex6 {

	public static void main(String[] args) {
		/*
		 * 5. Perdicate 계열
		 * - Function, Operator와 같이 파라미와 리턴을 갖는다.
		 * - 리턴타입이 boolean으로 고정되어있다.
		 * - 매개변수로 전달받은 데이터를 "어떠한 판단" 후 true/false 리턴
		 * */
		Predicate<String> predicate = name -> name.contains("Java");
		System.out.println(predicate.test("javaScript"));
		
		Predicate<String> predicate2 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				return t.contains("Java");
			}
		};
		System.out.println(predicate2.test("JavaScript"));
		// ----------------------------------------------
		PredicateTest pt = new PredicateTest();
		pt.printSome(num -> num%3 == 0);
		pt.printSome(num -> num > 5);
	}

}

class PredicateTest {
	int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	
	public void printSome(IntPredicate pred) {
		for(int num : nums) {
			if(pred.test(num)) {
				System.out.print(num + "\t");
			}
		}
		System.out.println();
	}
	
}









