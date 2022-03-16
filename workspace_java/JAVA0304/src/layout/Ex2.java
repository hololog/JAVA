package layout;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ex2 {

	public Ex2() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame();
		f.setBounds(800, 300, 400, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 버튼 5개 생성
		JButton btnCenter = new JButton("CENTER");
		JButton btnEast = new JButton("EAST");
		JButton btnWest = new JButton("WEST");
		JButton btnNorth = new JButton("NORTH");
		JButton btnSouth = new JButton("SOUTH");
		
		// 생성한 버튼을 frame 부착
		f.add(btnCenter, BorderLayout.CENTER);
		f.add(btnEast, BorderLayout.EAST);
		f.add(btnWest, BorderLayout.WEST);
		f.add(btnNorth, BorderLayout.NORTH);
		f.add(btnSouth, BorderLayout.SOUTH);
		
		// 각버튼에 대한 이벤트 처리 - 4단계
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 전달된 버튼 객체게 ActionEvent 타입으로 변환되어 전달되므로
				// 각 버튼을 ActionEvent 객체(e)와 비교해야함
				// => e.getSource() 리턴값을 JButton 객체와 비교하거나 JButton 타입으로 형변환
//						JButton btn = (JButton)e.getSource();
				// 만약, 각 버튼에 대한 텍스트 정보만 필요할 경우
				// => getActionCommand() 또는 getText() 활용
//						System.out.println(btn.getText() + "버튼 클릭됨!");
				
//				if(e.getActionCommand().equals("CENTER")) {
//					System.out.println("CENTER 버튼 클릭됨!");
//					// CENTER 버튼 클릭 시 수행할 작업들을 명시...
//				} else if(e.getActionCommand().equals("EAST")) {
//					System.out.println("EAST 버튼 클릭됨!");
//				}
//				System.out.println(e.getActionCommand() + " 버튼 클릭됨!");
				
				// -------------------------------------------------------
				// 조건식 동등비교연산을 통해 버튼객체와 e.getSource() 결과 비교
				// => 같을 경우 해당 버튼임을 증명하게됨
				// => 주로, 특정 버튼에 따라 서로 다른 작업을 수행해야할 경우 사용하는 방법
				if(btnCenter == e.getSource()) {
					System.out.println("CENTER 버튼 클릭됨!");
					// CENTER 버튼 클릭시 수행할 작업들을 명시...
				} else if(btnEast == e.getSource()) {
					System.out.println("EAST 버튼 클릭됨!");
					// EAST 버튼 클릭시 수행할 작업들을 명시...
				} else if(btnWest == e.getSource()) {
					System.out.println("WEST 버튼 클릭됨!");
					// WEST 버튼 클릭시 수행할 작업들을 명시...
				} else if(btnNorth == e.getSource()) {
					System.out.println("NORTH 버튼 클릭됨!");
					// NORTH 버튼 클릭시 수행할 작업들을 명시...
				} else if(btnSouth == e.getSource()) {
					System.out.println("SOUTH 버튼 클릭됨!");
					// SOUTH 버튼 클릭시 수행할 작업들을 명시...
				}
				
			}
		};
		
		btnCenter.addActionListener(listener);
		btnEast.addActionListener(listener);
		btnWest.addActionListener(listener);
		btnNorth.addActionListener(listener);
		btnSouth.addActionListener(listener);
		
		f.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ex2();
	}

}
