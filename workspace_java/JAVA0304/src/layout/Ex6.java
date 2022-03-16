package layout;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ex6 {
	
	JTextField tf; // 다른 메서드에서 접근을 위해 멤버변수로 선언
	
	public Ex6() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame();
		f.setBounds(600, 400, 300, 100);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * JPanel(패널)
		 * - 여러개의 컴포넌트를 하나로 묶는 경량 컨테이너
		 * - 기본 레이아웃 : FlowLayout
		 * - 주로, 프레임(JFrame)에 패널(JPanel)을 부착하여 컴포넌트를 배치하는 형태로 사용
		 * 
		 * */
		
		// 프레임의 CENTER 영역에 JTextField와 JButton 컴포넌트를 하나로 묶어서 부착
		// => 복수개의 컴포넌트를 묶기 위해서 JPanel(패널) 사용
		// 1. JPanel 객체 생성
		JPanel p = new JPanel();
		// 2. JPanel 컨테이너를 JFrame 컨테이너의 CENTER 영역에 부착(나중에 부착해도 됨)
		f.add(p, BorderLayout.CENTER);
		
		// 3. TextField와 JButton 객체를 생성
		// => 주의! FlowLayout을 갖는 JPanel에 JTextField를 부착하는 경우
		//    반드시 JTextField의 컬럼크기 설정 필수!
		tf = new JTextField(15);	// 컬럼크기를 15로 설정
		JButton btn = new JButton("확인");
		
		// 4. JTextField와 JButton 객체를 JPanel에 부착
		p.add(tf);
		p.add(btn);
		
		// 5. 리스너 연결 => 리스너 구현 코드 중복 제거를 위해 4단계 구현
//		ActionListener listener = new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				printMessage();
//			}
//		};
		
		// 람다식
		ActionListener listener = e -> printMessage();
		
		// 미리 구현된 4단계 리스너 객체를 파라미터로 사용하여 리스너 연결
		tf.addActionListener(listener);
		btn.addActionListener(listener);
		
		f.setVisible(true);
	}
	
	// JTextField에 입력된 텍스트를 가져와서 출력하는 메서드 정의
	public void printMessage() {
		String str = tf.getText();
		System.out.println(str);
		tf.setText(""); // 널스트링("") 값 설정 = 입력된 텍스트 초기화
		
		// 입력 작업 완료 후 텍스트 초기화 끝난 뒤 다시 입력을 위해 커서 요청할 경우
		tf.requestFocus();
	}
	
	
	public static void main(String[] args) {
		new Ex6();
	}

}








