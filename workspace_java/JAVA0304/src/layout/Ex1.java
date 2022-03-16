package layout;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ex1 {
	/*
	 * JFrame의 기본 레이아웃 BorderLayout의 5개의 영역에
	 * 버튼 5개(CENTER, EAST, WEST, SOUTH, NORTH) 부착하고
	 * 각 버튼을 클릭하면 "XXX 클릭됨" 출력하도록 5단계로 이벤트 처리
	 * */
	public Ex1() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame();
		f.setBounds(300, 200, 500, 500);
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
		
		// 각 버튼에 대한 이벤트 처리 - 5단계
		btnCenter.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("CENTER 버튼 클릭됨!");
			}
		});
		
		// 람다식
		btnCenter.addActionListener(e -> System.out.println("CENTER 버튼 클릭됨!"));
		btnEast.addActionListener(e -> System.out.println("EAST 버튼 클릭됨!"));
		btnWest.addActionListener(e -> System.out.println("WEST 버튼 클릭됨!"));
		btnNorth.addActionListener(e -> System.out.println("NORTH 버튼 클릭됨!"));
		btnSouth.addActionListener(e -> System.out.println("SOUTH 버튼 클릭됨!"));
		
		f.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Ex1();
	}

}
