package if_statement;

public class Ex1 {

	public static void main(String[] args) {

		/*
		 *	중첩 if문
		 *  - if문 블록 내에서 또 다른 if문을 기술하는 것
		 *    (else 블록 내에서 기술해도 됨)
		 *  - 중첩 횟수에는 제한이 없음
		 * 
		 * < 기본 문법 >
		 * if(조건식1){
		 * 		
		 * 		if(조건식1-1){
		 * 			if(조건식 1-1-1){
		 * 			
		 * 			}
		 * 		}
		 * 
		 * 		if(조건식1-2){
		 * 
		 * 		} else {
		 * 
		 * 		}
		 * } else {
		 * 
		 * }
		 * 
		 * */
		
		// 학생 점수 (score)에 대한 학점(grade) 판별
		// A학점: 90 ~ 100점
		// B학점: 80 ~ 89점
		// C학점: 70 ~ 79점
		// D학점: 60 ~ 69점
		// F학점: 0  ~ 59점
		// 그 외: "점수입력 오류!"
		
		
//		if(90 <= score && score <= 100) {
//			grade = "A학점";
//		} else if(80 <= score) {
//			grade = "B학점";
//		} else if(70 <= score) {
//			grade = "C학점";
//		} else if(60 <= score) {
//			grade = "D학점";
//		} else if(0 <= score) {
//			grade = "F학점";
//		} else {
//			grade = "점수입력 오류!";
//		}
//		
//		System.out.println(score + "점의 학점: " + grade);
		
		int score = 76;
		String grade = "";
		
		if(score >= 0 && score <= 100) {
			
			if(score >= 90) {
				grade = "A학점";
			} else if(score >= 80) {
				grade = "B학점";
			} else if(score >= 70) {
				grade = "C학점";
			} else if(score >= 60) {
				grade = "D학점";
			} else {
				grade = "F학점";
			}
			System.out.println(score + "점의 학점: " + grade);
			
		} else {
			System.out.println("점수입력 오류!");
		}
		
		
		
		
		
		
		
	}

}
