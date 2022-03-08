import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Test_Calculator {

	public Test_Calculator() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("계산기");
		f.setBounds(600, 400, 300, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ------------ << 계산기 >> ----------------
		// ---------- 상단 숫자 표시 패널 -----------
		JTextField tfNum = new JTextField();
		
		tfNum.setHorizontalAlignment(JTextField.RIGHT);	// 텍스트 우측 정렬
		tfNum.setMargin(new Insets(5, 10, 5, 10)); // top, left, bottom, right
		tfNum.setText("0"); // 초기 숫자 0 표시
		tfNum.setEditable(false); // 숫자 편집 불가
		
		//----- 폰트 변경을 위한 설정 -----
		// 폰트 변경을 위한 객체의 setFont() 메서드 호출하여 Font 객체 전달
		// => Font 객체의 생성자 파라미터로 "폰트명", 폰트옵션, 사이즈 전달
		tfNum.setFont(new Font("맑은고딕", Font.BOLD, 25));
		f.add(tfNum, BorderLayout.NORTH);
		
		// ---------- 중앙 숫자 버튼 패널 ----------
		JPanel pCenter = new JPanel(new GridLayout(5, 4));
		f.add(pCenter, BorderLayout.CENTER);
		
		// JButton 컴포넌트 텍스트 폰트 설정위한 Font객체 생성
		Font btnFont = new Font("맑은고딕", Font.BOLD, 18);
		
		// 첫행 CE, C, ←, ÷ 
		JButton btnCE = new JButton("CE");
		btnCE.setFont(btnFont);
		btnCE.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnCE);
		
		JButton btnC = new JButton("C");
		btnC.setFont(btnFont);
		btnC.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnC);
		
		JButton btnDel = new JButton("←");
		btnDel.setFont(btnFont);
		btnDel.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnDel);
		
		JButton btnDiv = new JButton("÷");
		btnDiv.setFont(btnFont);
		btnDiv.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnDiv);
		
		// 두번째 행 7 8 9 ×
		JButton btnNum7 = new JButton("7");
		btnNum7.setFont(btnFont);
		btnNum7.setBackground(Color.WHITE);
		pCenter.add(btnNum7);
		
		JButton btnNum8 = new JButton("8");
		btnNum8.setFont(btnFont);
		btnNum8.setBackground(Color.WHITE);
		pCenter.add(btnNum8);
		
		JButton btnNum9 = new JButton("9");
		btnNum9.setFont(btnFont);
		btnNum9.setBackground(Color.WHITE);
		pCenter.add(btnNum9);
		
		JButton btnMul = new JButton("×");
		btnMul.setFont(btnFont);
		btnMul.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnMul);
		
		// 세번째 행 4 5 6 -
		JButton btnNum4 = new JButton("4");
		btnNum4.setFont(btnFont);
		btnNum4.setBackground(Color.WHITE);
		pCenter.add(btnNum4);
		
		JButton btnNum5 = new JButton("5");
		btnNum5.setFont(btnFont);
		btnNum5.setBackground(Color.WHITE);
		pCenter.add(btnNum5);
		
		JButton btnNum6 = new JButton("6");
		btnNum6.setFont(btnFont);
		btnNum6.setBackground(Color.WHITE);
		pCenter.add(btnNum6);
		
		JButton btnSub = new JButton("-");
		btnSub.setFont(btnFont);
		btnSub.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnSub);
		
		// 네번째 행 1 2 3 +
		JButton btnNum1 = new JButton("1");
		btnNum1.setFont(btnFont);
		btnNum1.setBackground(Color.WHITE);
		pCenter.add(btnNum1);
		
		JButton btnNum2 = new JButton("2");
		btnNum2.setFont(btnFont);
		btnNum2.setBackground(Color.WHITE);
		pCenter.add(btnNum2);
		
		JButton btnNum3 = new JButton("3");
		btnNum3.setFont(btnFont);
		btnNum3.setBackground(Color.WHITE);
		pCenter.add(btnNum3);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setFont(btnFont);
		btnAdd.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnAdd);
		
		// 다섯번째 행 ± 0 . =
		JButton btnSign = new JButton("±");
		btnSign.setFont(btnFont);
		btnSign.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnSign);
		
		JButton btnNum0 = new JButton("0");
		btnNum0.setFont(btnFont);
		btnNum0.setBackground(Color.WHITE);
		pCenter.add(btnNum0);
		
		JButton btnDot = new JButton(".");
		btnDot.setFont(btnFont);
		btnDot.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnDot);
		
		JButton btnEqual = new JButton("=");
		btnEqual.setFont(btnFont);
		btnEqual.setBackground(Color.LIGHT_GRAY);
		pCenter.add(btnEqual);
		
		// C(Clear) 버튼 클릭 시 숫자 표시창 초기화 후 0 출력
//		btnC.addActionListener((e) -> {
//			tfNum.setText("0");
//		});
		
		// 모든 버튼을 하나의 ActionListener 리스너에 연결
		ActionListener btnListener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 숫자 0 ~ 9 버튼 판별하기
				// 1. 이벤트 대상 객체(e)의 getSource() 메서드를 통해 버튼 객체 비교하기
				// => 숫자 버튼 모두 비교해야함
//				if(btnNum0 == e.getSource() || 
//				   btnNum9 == e.getSource() ||
//				   btnNum1 == e.getSource()) {
//					System.out.println("0번 버튼");
//				}
				
				// 2. 이벤트 대상 객체(e) getActionCommand() 로 버튼 텍스트 비교하기
				//    e.getActionCommand().charAt(0) => 텍스트 첫번째 글자 가져오기
				// 2-1. 가져온 문자 1개가 '0' ~ '9' 범위인지 판별
				char btnCh = e.getActionCommand().charAt(0);
//				if(btnCh >= '0' && btnCh <= '9') {
//					System.out.println("숫자버튼!");
//				}
				
				// 2-2. 가져온 문자가 문자형 숫자인지 판별
				if(Character.isDigit(btnCh)) {
//					System.out.println("숫자버튼!");
					
					// 현재 표시된 숫자 가져오기
					String currNum = tfNum.getText();
					
					if(currNum.equals("0")) { // 0이 표시되어 있을 경우
						// 0 대신 입력ㅈㄷ받은 숫자 표시
						tfNum.setText(btnCh + "");
					} else { // 0이외의 숫자가 표시되어 있을 경우
						// 새로 입력된 숫자를 기존 숫자 뒤에 연결하여 표시
						tfNum.setText(currNum + btnCh);
					}
					
				} else if(btnCh == '←') { // 삭제 버튼 클릭 시
					String currNum = tfNum.getText(); // 현재 표시된 숫자 가져오기
					
					if(currNum.length() < 2) { // 현재 숫자가 2자리 미만일 경우
						// 더 이상 삭제가 불가능 하므로 0으로 초기화
						tfNum.setText("0");
					} else {
						// 마지막 숫자 제거
						// => 가장 마지막 숫자를 제외한 나머지 숫자만 추출하여 출력
						// => 마지막 숫자 앞자리까지 추출하기 위해서는
						//    끝 인덱스 파라미터에 전체 문자열 길이 -1 값을 전달해야함
						tfNum.setText(currNum.substring(0, currNum.length() - 1));
					}
				} else if(btnCh == 'C') { // C(Clear) 버튼 클릭 시
					tfNum.setText("0"); // 입력된 모든 숫자 초기화
				}
			}
		};
		
		// Alt + Shift + A (멀티 라인 수정 모드)
		btnC.addActionListener(btnListener);
		btnCE.addActionListener(btnListener);
		btnDel.addActionListener(btnListener);
		
		btnNum0.addActionListener(btnListener);
		btnNum1.addActionListener(btnListener);
		btnNum2.addActionListener(btnListener);
		btnNum3.addActionListener(btnListener);
		btnNum4.addActionListener(btnListener);
		btnNum5.addActionListener(btnListener);
		btnNum6.addActionListener(btnListener);
		btnNum7.addActionListener(btnListener);
		btnNum8.addActionListener(btnListener);
		btnNum9.addActionListener(btnListener);
		
		btnAdd.addActionListener(btnListener);
		btnSub.addActionListener(btnListener);
		btnMul.addActionListener(btnListener);
		btnDiv.addActionListener(btnListener);
		btnSign.addActionListener(btnListener);
		btnDot.addActionListener(btnListener);
		btnEqual.addActionListener(btnListener);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test_Calculator();
	}

}
