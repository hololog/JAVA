import java.awt.*;

import javax.swing.*;

public class Ex1 {

	public Ex1() {
		showFrame();
	}
	
	public void showFrame() {
		/*
		 * 레이아웃(Layout)
		 * - 화면을 구성하는 형태(요소들의 배치 형태)
		 * - 다양한 레이아웃을 사용하여 요소들의 배치 형태를 결정 가능
		 * - 각 레이아웃을 지원하는 객체 사용하여 레이아웃 적용 가능
		 * - BorderLayout, FlowLayout, GridLayout, CardLayout 등
		 * 
		 * BorderLayout
		 * - 대상 컨테이너의 동, 서, 남, 북, 중앙 5개의 영역으로 분할하여 컴포넌트를 배치
		 * - JFrame 객체(프레임)의 기본 레이아웃
		 *   => 별도의 설정이 없을 경우 기본적으로 BorderLayout이 적용되어 있음
		 * - 배치할 영역을 지정하는 경우 add() 메서드의 두번째 파라미터로
		 *   BorderLayout.XXX 상수를 사용하여 위치 지정 가능  
		 *   => 또는 "North", "Center" 등의 문자열도 사용 가능하나 오타로 인한 오류 가능성 있음)
		 *   ex) 가운데 영역 지정 : "Center" 문자열 또는 BorderLayout.CENTER 상수 사용
		 *       우측(동쪽) 영역 지정 : "East" 문자열 또는 BorderLayout.EAST 상수 사용
		 *   => 만약, 영역 지정을 생략할 경우 기본 영역이 CENTER영역으로 지정됨
		 * - 한 영역 당 1개의 컨테이너나 또는 컴포넌트 배치 가능
		 *   => 만약, 한 영역에 두 개 이상의 컴포넌트 등을 배치할 경우
		 *   	마지막에 배치된 대상만 표시됨(나머지는 뒤에 가려짐)
		 * - BorderLayout 이 적용된 대상의 크기를 변경하더라도
		 *   내부에 배치된 컴포넌트의 크기만 변경되고, 배치된 형태(위치)는 변경되지 않음        
		 * */
		JFrame f = new JFrame("레이아웃 기초");
		f.setBounds(200, 200, 500, 500);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnCenter = new JButton("CENTER");
		
		// 현재 프레임의 중앙(CENTER 영역)에 버튼 객체 추가(부착)
//		f.add(btnCenter, "Center"); // 문자열을 사용하여 영역 지정할 경우
//		f.add(btnCenter, "CENTER"); // 주의!! 예외 발생 => CENTER 문자열 틀림
		f.add(btnCenter, BorderLayout.CENTER); // 가급적 상수 사용 권장!
		
		// ------------------------------------------------
		// 만약, 동일한 영역에 2개의 컴포넌트를 부착할 경우
//		JButton btnCenter2 = new JButton("CENTER2");
//		f.add(btnCenter2, BorderLayout.CENTER);
//		f.add(btnCenter2); // 영역 지정 생략 시 CENTER 영역에 배치됨
		// ------------------------------------------------
		
		// 두번째 버튼을 생성하여 상단(North 영역)에 버튼 부착
		JButton btnNorth = new JButton("NORTH");
//		f.add(btnNorth, "North");			 // 문자열 사용시
		f.add(btnNorth, BorderLayout.NORTH); // 상수 사용시
		
		JButton btnEast = new JButton("EAST");
		f.add(btnEast, BorderLayout.EAST);
		
		JButton btnWest = new JButton("WEST");
		f.add(btnWest, BorderLayout.WEST);
		
		JButton btnSouth = new JButton("SOUTH");
		f.add(btnSouth, BorderLayout.SOUTH);
		
		f.setVisible(true);
	}
	
		
	public static void main(String[] args) {
		new Ex1();
	}

}
