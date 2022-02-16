import java.util.*;

public class Ex4 {

	public static void main(String[] args) {
		/*
		 * 1. 1 ~ 45 사이의 중복되지 않는 난수 6개를 컬렉션 객체
		 *    (변수명: myLotto)를 사용하여 저장 및 오름차순 정렬 수행
		 * 
		 * 2. 별도의 ArrayList 객체(변수명: thisWeekLotto)를 사용하여
		 *    35, 21, 29, 10, 3, 44 의 정수를 저장 및 오름차순 정렬 수행
		 *    
		 * 3. [1번]에서 생성한 번호와 [2번]에서 저장한 번호를 비교 후 아래에
		 *    주어진 4가지 조건에 따른 결과를 내 번호(myLotto), 1등 번호
		 *    (thisWeekLotto), 일치하는 번호 개수, 추첨 결과의 형태로
		 *    아래의 표와 같이 출력
		 *    1) 일치하는 번호 개수가 4개 미만: 꽝
		 *    2) 일치하는 번호 개수가 4개: 3등
		 *    3) 일치하는 번호 개수가 5개: 2등
		 *    4) 일치하는 번호 개수가 6개: 1등
		 * */
		
//			1. 1 ~ 45 사이의 중복되지 않는 난수 6개를 컬렉션 객체
//		   (변수명: myLotto)를 사용하여 저장 및 오름차순 정렬 수행
		Random r = new Random();
		Set myLotto = new TreeSet(); // TreeSet은 정렬까지 됨
		while(myLotto.size() < 6) {
			myLotto.add(r.nextInt(45) + 1); 
		}
		
//		2. 별도의 ArrayList 객체(변수명: thisWeekLotto)를 사용하여
//		   35, 21, 29, 10, 3, 44 의 정수를 저장 및 오름차순 정렬 수행
		ArrayList thisWeekLotto = new ArrayList(Arrays.asList(35, 21, 29, 10, 3, 44));
		Collections.sort(thisWeekLotto);
		
//		3. [1번]에서 생성한 번호와 [2번]에서 저장한 번호를 비교 후 아래에
//		 *    주어진 4가지 조건에 따른 결과를 내 번호(myLotto), 1등 번호
//		 *    (thisWeekLotto), 일치하는 번호 개수, 추첨 결과의 형태로
//		 *    아래의 표와 같이 출력
//		 *    1) 일치하는 번호 개수가 4개 미만: 꽝
//		 *    2) 일치하는 번호 개수가 4개: 3등
//		 *    3) 일치하는 번호 개수가 5개: 2등
//		 *    4) 일치하는 번호 개수가 6개: 1등
		
		int count = 0;
		for(Object o : thisWeekLotto) {
			if(myLotto.contains(o)) count++;
		}
		
		String result = "";
		switch (count) {
		case 0:
		case 1:
		case 2:
		case 3: result += "꽝"; 		break;
		case 4: result += "3등 당첨"; break;
		case 5: result += "2등 당첨"; break;
		case 6: result += "1등 당첨"; break;
			
		}
		
		System.out.println("내 번호 : " + myLotto);
		System.out.println("1등 번호 : " + thisWeekLotto);
		System.out.println("일치 개수 : " + count + "개(결과: " + result + ")");
		
		
		
		
	}

}
