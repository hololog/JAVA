package array;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * 학생 5명의 점수를 배열 score에 저장하고
		 * 각 학생 점수의 총점과 평균을 계산하여 출력
		 * 
		 * < 출력 예시 >
		 * 1번 학생: 80점
		 * 2번 학생: 100점
		 * 3번 학생: 50점
		 * 4번 학생: 90점
		 * 5번 학생: 77점
		 * --------------
		 * 총점: 397점
		 * 평균: 79.4점
		 * ========================
		 * < 추가 항목 >
		 * 1. 학생 이름을 저장하는 배열 names를 생성하여
		 *    이순신, 홍길동, 강감찬, 김태희, 전지현 문자열 5개를 저장한 후
		 *    학생 번호 대신 이름을 출력
		 * 2. 학생 점수 중 최고점수와 최저점수를 찾아 출력
		 * 
		 * < 출력 예시 >
		 * 이순신: 80점
		 * 홍길동: 100점
		 * 강감찬: 50점
		 * 김태희: 90점
		 * 전지현: 77점
		 * ------------
		 * 총점: 397점
		 * 평균: 79.4점
		 * 최고 점수: 100점
		 * 최저 점수: 50점
		 * 
		 * */
		
		int[] score = {80, 100, 50, 90, 77};
		String[] names = {"이순신", "홍길동", "강감찬", "김태희", "전지현"};	// 학생이름
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(names[i] +": " + score[i] + "점");
			sum += score[i];
		}
		
		double avg = (double)sum / score.length;
		System.out.println("------------");
		System.out.println("총점: " + sum + "점");
		System.out.println("평균: " + avg + "점");
		
//		int maxScore = 0, minScore = 30;
//		for(int i = 0; i < score.length; i++) {
//			if(maxScore < score[i]) {
//				maxScore = score[i];
//			}
//			
//			if(minScore > score[i]) {
//				minScore = score[i];
//			}
//		}
		
		int maxScore = score[0];
		int minScore = score[0];
//		for(int i = 1; i < score.length; i++) {
//			if(maxScore < score[i]) {
//				maxScore = score[i];
//			}
//			
//			if(minScore > score[i]) {
//				minScore = score[i];
//			}
//		}
		
		for(int num : score) {
			maxScore = maxScore < num ? num : maxScore;
			minScore = minScore > num ? num : minScore;
		}
		
		
		System.out.println("최고 점수: " + maxScore + "점");
		System.out.println("최저 점수: " + minScore + "점");
		System.out.println("-------------------------");
		
		// 향상된 for문 for-each
		String[] class1 = {"김윤진", "차동원", "소지섭"};
		for(String s : class1) {
			System.out.println(s);
		}
		System.out.println("-------------");
		
		
	}

}
