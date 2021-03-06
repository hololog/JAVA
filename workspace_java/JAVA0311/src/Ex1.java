import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Ex1 {
	
	public Ex1() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("Dialog 기초");
		f.setBounds(800, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * JOptionPane
		 * - 다이얼로그(팝업창)을 생성하는 객체
		 * - 사용자에게 알림 메세지를 팝업창으로 표시하거나
		 *   사용자의 선택을 받거나, 사용자로부터 데이터를 입력받는 용도로 사용
		 * - JOptionPane 클래스의 static 메서드인 showXXXDialog() 메서드를 호출해서 표시
		 *   => XXX 부분의 이름에 따라 다이얼로그 종류가 달라짐
		 * - 생성자 파라미터에 따라 각각 다른 옵션 설정이 가능    
		 * 
		 * 1) MessageDialog : 사용자에게 메세지를 표시하기 위한 다이얼로그
		 * 2) ConfirmDialog : 사용자로부터 선택을 받도록 버튼을 표시하는 다이얼로그
		 * 3) InputDialog : 사용자로부터 데이터를 입력받기 위한 다이얼로그
		 * */
		
		// JPanel 객체 생성하여 CENTER 영역에 부착
		JPanel p = new JPanel();
		f.add(p, BorderLayout.CENTER);
		
		// JButton 객체 3개(Message(btnMessage), Confirm(btnConfirm), Input(btnInput)) 생성
		JButton btnMessage = new JButton("Message");
		JButton btnConfirm = new JButton("Confirm");
		JButton btnInput = new JButton("Input");
		
		p.add(btnMessage); p.add(btnConfirm); p.add(btnInput);
		
		// 각 버튼 이벤트 처리 - 4단계
		// => ActionListener 구현체 내부에서 버튼 3개를 구별
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == btnMessage) {	// alert
					
					/*
					 * 1. parentComponent : 다이얼로그 표시할 부모 객체
					 *    => 만약, null 지정시 전체 화면의 중앙에 표시됨
					 * 2. message : 다이얼로그에서 표시할 본문
					 * 3. title : 다이얼로그 제목표시줄에 표시할 제목
					 * 4. messageType : 메시지 종류(아이콘 형태를 결정) 
					 * 		0 ~ 3, -1
					 *    1) ERROR_MESSAGE : 오류 메시지(빨간색 X)
						  2) INFORMATION_MESSAGE : 일반적인 메세지 (파란색 !)
						  3) WARNING_MESSAGE : 경고 메세지 (노란색 !)
						  4) QUESTION_MESSAGE : 질문 메시지 (초록색 ?)
						  5) PLAIN_MESSAGE : 아이콘 없음
					 * */
//					JOptionPane.showMessageDialog(
//							f,				// 다이얼로그 표시 대상 객체 
//							"다이얼로그 메세지", // 본문
//							"다이얼로그 제목", 	// 제목
//							JOptionPane.PLAIN_MESSAGE); // 메세지 형태
					
					// 만약, 간략한 메세지를 표시할 경우 대상 객체와 메세지만 지정 가능
					// => 제목 : 메시지, 메시지종류: INFORMATION_MESSAGE 로 자동 지정됨
					JOptionPane.showMessageDialog(f, "다이얼로그 메세지");
					
				} else if(e.getSource() == btnConfirm) {	// confirm
//					JOptionPane.showConfirmDialog(f, "종료하시겠습니까?");
					/*
					 * ConfirmDialog는 기본적으로 MessageDialog와 파라미터가 비슷함
					 * - optionType 파라미터 : 버튼의 종류를 결정
					 *   => JOptionPane.XXX_OPTION 상수를 활용하여 버튼 종류 설정 가능
					 * - 리턴값이 int 이므로 선택한 버튼의 고유값이 리턴됨
					 * 		ex) JOptionPane.YES_OPTION = 0
					 * 			JOPtionPane.NO_OPTION = 1
					 * */
					int select = JOptionPane.showConfirmDialog(
							f, 				// 표시할 대상 객체
							"종료 하시겠습니까?",// 메세지 
							"종료",			// 제목 
							JOptionPane.YES_NO_CANCEL_OPTION,	// 버튼종류 
							JOptionPane.QUESTION_MESSAGE);	// 메세지 형태
//					System.out.println(select); // 0(Yes),1(No),2(Cancle),-1(X)
					if(select == JOptionPane.YES_OPTION) { // 0(Yes)
						System.out.println("종료!");
					} else if(select == JOptionPane.NO_OPTION) { // 1(No)
						System.out.println("종료 안 함!");
					} else if(select == JOptionPane.CANCEL_OPTION) { // 2(Cancle)
						System.out.println("종료 취소!");
					} else if(select == JOptionPane.CLOSED_OPTION) { // -1(X)
						System.out.println("Confirm창 닫음");
					}
					
				} else if(e.getSource() == btnInput) {	// prompt
					String input = JOptionPane.showInputDialog(f, "검색할 이름 입력");
					System.out.println("입력 데이터 : " + input);
				}
				
			}
		};
		
		btnMessage.addActionListener(listener);
		btnConfirm.addActionListener(listener);
		btnInput.addActionListener(listener);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex1();
	}

}
