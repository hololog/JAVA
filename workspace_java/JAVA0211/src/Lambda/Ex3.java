package Lambda;

import java.util.Random;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * 2. Supplier 계열(공급자)
		 * - 파라미터를 받지 않는다.
		 * - 자체적으로 리턴할 값을 생성한다.
		 * 
		 * */
		System.out.println("===== Supplier<T> =====");
		// 익명의 내부클래스 방식
		// <T>의 값이 return 타입을 결정함
		Supplier<String> supplier = new Supplier<String>() {
			@Override
			public String get() {
				return "Hello";
			}
		};
		System.out.println(supplier.get());
		
//		Supplier<String> supplier2 = () -> { return "Hello2"; };
		// 파라미터없음: 소괄호() 생략불가
		// 단순한 리턴문 1개: 중괄호{} 생략가능, return 생략가능
		// <T>의 값이 return 타입을 결정함
		Supplier<String> supplier2 = () -> "Hello2";
		System.out.println(supplier2.get());
		
		// PSupplier
		// P: Boolean, Integer, Long, Double을 의미
		
		System.out.println("===== PSupplier =====");
		IntSupplier supplier3 = () -> { 
			Random random = new Random();
			return random.nextInt(6);
		};
		System.out.println(supplier3.getAsInt());
		
	}

}
