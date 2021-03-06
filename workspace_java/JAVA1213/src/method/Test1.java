package method;

public class Test1 {

	public static void main(String[] args) {

		// 1. 매개변수도 없고, 리턴값도 없는 메서드 호출
		// "Hellow, World!" 문자열 10번 반복 출력하는 hello() 메서드를 호출
		hello();
		System.out.println("----------------------");
		// 2. 매개변수는 있고, 리턴값은 없는 메서드 호출
		// "안녕하세요" 를 매개변수로 전달, 반복횟수도 전달한 만큼 반복하는 메서드를 작성
		hello2("안녕하세요", 7);
		
		// 3. 매개변수는 없고, 리턴값만 있는 메서드 호출 
		// 1 ~ 10까지 정수의 합(55)을 계산하여 리턴하는 메서드 sum() 호출 후 결과 출력 
//		int sum = sum();
		
		// 4. 위 sum을 수정하여 1 부터 전달받은 매개변수 까지의 합을 리턴하는 메서드로 수정 후 출력
		System.out.println("1 ~ 100 까지 정수의 합 : " + sum(100));
		
		System.out.println("--------------------------");
		// 5. 정수 5개(1, 2, 3, 4, 5) 가 저장된 배열을 리턴하는 메소드 getArray() 를 호출하여
		// 리턴되는 배열을 전달받아 배열 내의 모든 요소를 출력
		int[] arr = getArray();
		for(int n : arr) {
			System.out.print(n + " ");
		}
		
		// 6. 정수 start, end 값을 매개변수로 받아 start부터 end까지의 
		// 배열을 리턴하는 메서드를 호출 후 출력 (데이터 start ~ end)
		System.out.println("===================");
		int[] arr2 = getArray2(10, 15);
		for(int n : arr2) {
			System.out.print(n + " ");
		}
		
	}
	
	public static int[] getArray2(int start, int end){
		int size = end - start + 1;
		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = start;
			start++;
		}
		
		return arr;
	}
	
	public static int[] getArray() {
		int[] arr = {1, 2, 3, 4, 5};
		return arr;
	}
	
	
	public static int sum(int limit) {
		int sum = 0;
		for(int i=1; i <= limit; i++) {
			sum += i;
		}
		return sum;
	}
	
	
	public static void hello2(String ment, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(i + ": " + ment);
		}
	}
	
	public static void hello() {
		for(int i=0; i<10; i++) {
			System.out.println(i + ": Hellow, World!");
		}
	}
	
	

}
