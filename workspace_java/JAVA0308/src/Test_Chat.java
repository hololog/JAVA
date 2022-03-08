import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test_Chat {
	
	public Test_Chat() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("채팅 클라이언트");
		f.setBounds(800, 400, 400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ---------- 중앙(CENTER 영역) 채팅 메세지 출력 ----------
		// 채팅 메세지 스크롤을 위해 JScrollPane 생성 후 JTextArea 부착 필요
		JScrollPane scrollPane = new JScrollPane();
		f.add(scrollPane, BorderLayout.CENTER);
		
		JTextArea ta = new JTextArea();
		ta.setEditable(false);	// 편집 불가능 하도록 설정
		ta.setBackground(Color.LIGHT_GRAY); // 배경색 설정
		scrollPane.setViewportView(ta);
		
		// ---------- 하단(SOUTH 영역) 채팅 메세지 입력 및 버튼 ----------
		JPanel pSouth = new JPanel();
		f.add(pSouth, BorderLayout.SOUTH);
		
		JTextField tf = new JTextField(20); // Panel 부착시 COLUMN 크기 지정 필수!
											// 기본적으로 FlowLayout 이기 때문
		pSouth.add(tf);
		
		JButton btnSend = new JButton("전송");
		pSouth.add(btnSend);
		
		JButton btnClear = new JButton("초기화");
		pSouth.add(btnClear);
		
		// 전송 버튼 클릭 및 텍스트필드 입력 후 엔터키 입력 시 메세지 전송(JTextArea 출력)
//		ActionListener inputMessage = new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String str = tf.getText(); // 입력 메세지 가져오기
//				ta.setText(ta.getText() + "\n" + str); // JTextArea 기존 내용 뒤에 출력
//				tf.setText(""); 	// JTextField 입력 내용을 널스트링("")을 활용하여 초기화
//				tf.requestFocus();	// JTextField 커서 요청
//			}
//		};
		
		// 람다식으로 표현
		ActionListener inputMessage = e -> {
			String str = tf.getText(); // 입력 메세지 가져오기
			ta.setText(ta.getText() + "\n" + str); // JTextArea 기존 내용 뒤에 출력
			tf.setText(""); 	// JTextField 입력 내용을 널스트링("")을 활용하여 초기화
			tf.requestFocus();	// JTextField 커서 요청
		};
		
		
		// JTextField, JButton 컴포넌트에 이벤트 연결
		tf.addActionListener(inputMessage);
		btnSend.addActionListener(inputMessage);
		
		// 초기화 버튼 클릭 시 JTextArea 에 표시된 내용 모두 삭제하고 JTextField에 커서 요청
//		btnClear.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				ta.setText("");	// JTextArea 초기화
//				tf.requestFocus(); // JTextField 커서 요청
//			}
//		});
		
		// 람다식으로 표현
		btnClear.addActionListener(e -> {
			ta.setText("");	// JTextArea 초기화
			tf.requestFocus(); // JTextField 커서 요청
		});
		
		
		f.setVisible(true);
		
		// 모든 요소 화면에 표시 후 JTextField에 커서 요청
		tf.requestFocus();
	}
	
	public static void main(String[] args) {
		new Test_Chat();
	}

}
