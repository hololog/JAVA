package Wrapper;

import java.util.List;
import java.util.ArrayList;

public class Ex5 {

	public static void main(String[] args) {
		/*
		 * 컬랙션 프레임워크(Collection Framework)
		 * 1. Set 계열
		 * 		- 저장 순서가 유지되지 않음
		 * 		- 데이터 중복을 허용하지 않음 (중복 데이터를 제거할때 아주 효과적)
		 * 2. List 계열	(ArrayList, Vector, LinkedList)
		 * 		- 인덱스 번호를 사용하여 저장 순서가 유지됨
		 * 		- 데이터 중복 허용
		 * 		- 배열과 유사하나, 배열과는 달리 저장 공간이 "자동으로 확장됨"
		 * 3. Map 계열
		 * 		- 데이터를 키(key)와 값(Value) 한쌍의 형태로 관리하는 자료구조
		 * 		- 키는 중복이 불가능하며, 값은 중복이 가능함
		 * */
		
		List list = new ArrayList();
		list.add(10);
		list.add(20);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println("--- 추가 전 ---");
		System.out.println(list.size());
		
		list.add(30);
		list.add(40);
		System.out.println("--- 추가 후 ---");
		System.out.println(list.size());
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i)); 
		}
		
		
		
		
		
		
		
	}

}
