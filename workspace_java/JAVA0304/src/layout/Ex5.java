package layout;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ex5 {
	
	// 다른 메서드에서 접근을 위해 멤버변수로 선언
	JTextField tf;
	
	public Ex5() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame();
		f.setBounds(600, 400, 300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * JTextField
		 * - 텍스트 한 줄을 입력 가능한 컴포넌트
		 * - BorderLayout에 바로 부착할 경우 기본 생성자로 생성 가능하지만,
		 *   주로 JPanel 등에 부착해서 사용할 때 생성자 파라미터로 컬럼길이를 전달해야함
		 * - getText() 메서드로 입력된 텍스트를 가져오고,
		 *   setText() 메서드로 새 텍스를 표시할 수 있다.
		 * - ActionListener 를 연결하면 텍스트 입력 후 엔터키에 대한 동작 처리 가능
		 * - KeyListener를 연결하면 키보드에서 눌러지는 키에 대한 동작 처리 가능  
		 * 
		 * */
		
		// JTextField 객체 생성
//		JTextField tf = new JTextField();
		tf = new JTextField();
		// JFrame 객체의 CENTER 영역에 부착
		f.add(tf, BorderLayout.CENTER);
		
		// JButton 객체 생성 후 JFrame 객체의 South 영역에 부착
		JButton btn = new JButton("입력");
		f.add(btn, BorderLayout.SOUTH);
		
		// JButton 객체 이벤트 처리
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// JTextField에 입력된 텍스트를 가져와서 출력 후 텍스트 초기화
//				String str = tf.getText();
//				System.out.println(str);
//				tf.setText(""); // 널스트링("") 값 설정 = 입력된 텍스트 초기화
				
				printMessage();
			}
		});
		
		// JTextField 컴포넌트의 엔터키 입력에 대한 이벤트 처리
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// JTextField에 입력된 텍스트를 가져와서 출력 후 텍스트 초기화
//				String str = tf.getText();
//				System.out.println(str);
//				tf.setText(""); // 널스트링("") 값 설정 = 입력된 텍스트 초기화
				printMessage();
				
			}
		});
		
		
		
		f.setVisible(true);
	}
	// JTextField에 입력된 텍스틑 가져와서 출력하는 메서드 정의
	public void printMessage() {
		// JTextField에 입력된 텍스트를 가져와서 출력 후 텍스트 초기화
		String str = tf.getText();	// 텍스트 가져오기
		System.out.println(str);
		tf.setText(""); // 널스트링("") 값 설정 = 입력된 텍스트 초기화
		
		// 입력 작업 완료 후 텍스트 초기화 끝난 뒤 다시 입력을 위해 커서 요청할 경우
		tf.requestFocus();
	}
	
	
	public static void main(String[] args) {
		new Ex5();
	}
}
