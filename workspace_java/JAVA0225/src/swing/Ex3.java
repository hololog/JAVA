package swing;

import java.awt.event.*;

import javax.swing.*;

public class Ex3 extends JFrame {
	public Ex3() {
		showFrame();
	}
	
	public void showFrame() {
		setBounds(600, 400, 300, 300);
		
		// 버튼 컴포넌트(JButton)를 생성하여 프레임(JFrame = 현재 객체) 에 부착
		JButton btn = new JButton("버튼");
		add(btn);
		
//		btn.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				System.out.println("버튼클릭");
//			}
//		});
		btn.addActionListener(e -> System.out.println("버튼클릭"));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex3();
	}

}
