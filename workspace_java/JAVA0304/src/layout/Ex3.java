package layout;

import java.awt.*;

import javax.swing.*;

public class Ex3 {
	public Ex3() {
		showFrame();
	}
	
	private void showFrame() {
		JFrame f = new JFrame();
		f.setBounds(800, 300, 300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * 레이아웃 변경
		 * - 기존에 설정된 레이아웃을 변경하여 다른 형태로 컴포넌트 배치 가능
		 * - 컨테이너 객체 생성 시 생성자에 레이아웃 객체를 전달하거나
		 *   컨테이너 객체의 setLayout() 메서드를 호출하여 레이아웃 변경 가능
		 * 
		 * < FlowLayout >
		 * - 컨테이너 내의 컴포넌트들을 흐름에 따라 자연스럽게 배치하는 레이아웃
		 *   좌 -> 우, 상 -> 하 방향으로 컴포넌트를 차례대로 배치
		 * - 컨테이너 크기가 변경되면, 컴포넌트의 크기는 유지되나, 위치가 변경됨  
		 *   (컨테이너 크기에 따라 위치가 자동으로 조절됨)
		 * - 하나의 컨테이너 내부에 여러개의 컴포넌트 배치가 가능함(위치 지정 불가)
		 * - JPanel(패널)의 기본 레이아웃
		 * - 생성자에 정렬 방식을 전달하여 변경 가능
		 *   (파라미터: FlowLayout.XXX 상수 전달 => CENTER, RIGHT, LEFT 등)  
		 * 
		 * */
		// 1. 레이아웃 객체 생성
//		FlowLayout flowLayout = new FlowLayout();
		// FlowLayout의 정렬 방식 변경할 경우 생성자 파라미터로 정렬값 상수 사용
//		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT); // 좌측 정렬
		// 2. setLayout() 메서드를 호출하여 변경할 레이아웃 객체 전달
//		f.setLayout(flowLayout);
		
		// 위 두문장을 한 문장으로 결합 가능
		f.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		// 버튼 5개 생성
		JButton btn1 = new JButton("BUTTON 1");
		JButton btn2 = new JButton("BUTTON 2");
		JButton btn3 = new JButton("BUTTON 3");
		JButton btn4 = new JButton("BUTTON 4");
		JButton btn5 = new JButton("BUTTON 5");
		
		// 생성한 버튼을 frame 부착
		// BorderLayout 과 달리 FlowLayout은 컴포넌트 배치 시 별도의 위치 지정 불필요
		f.add(btn1);
		f.add(btn2);
		f.add(btn3);
		f.add(btn4);
		f.add(btn5);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex3();
	}

}







