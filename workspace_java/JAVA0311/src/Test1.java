import java.awt.*;

import javax.swing.*;

public class Test1 {

	public Test1() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("CheckBox 연습");
		f.setBounds(600, 400, 400, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 패널을 하나 생성한 후 프레임에 부착
		JPanel p = new JPanel();
		f.add(p, BorderLayout.CENTER);
		
		// 체크박스 4개 ("Java", "JSP", "Android", "전체선택") 생성
		JCheckBox cb1 = new JCheckBox("Java");
		JCheckBox cb2 = new JCheckBox("JSP");
		JCheckBox cb3 = new JCheckBox("Android");
		JCheckBox cb4 = new JCheckBox("전체선택");
		
		// 패널에 체크박스 부착
		p.add(cb1); p.add(cb2); p.add(cb3); p.add(cb4);
		
		/*
		 * 전체선택 체크박스에 대한 이벤트 처리 => ActionListener
		 * => 전체선택 체크 시 cb1, cb2, cb3를 모두 체크하고 (cb4에 텍스트 "전체선택 해제"),
		 *    전체선택 체크 해재 시 cb1, cb2, cb3를 모두 체크해제 (cb4에 텍스트 "전체선택")
		 * */
		
//		cb4.addActionListener((e) -> {
//			if(e.getSource() == cb4) {
//				cb1.doClick();
//				cb2.doClick();
//				cb3.doClick();
//			}
//		});
		
		cb4.addActionListener((e) -> {
			if(cb4.isSelected()) { // 체크 됨
//				System.out.println("전체선택 체크됨");
				// 체크박스 3개 모두 체크 설정
				cb1.setSelected(true);
				cb2.setSelected(true);
				cb3.setSelected(true);
				// 텍스트 "전체선택 해제" 로 세팅
				cb4.setText("전체선택 해제");
			} else { // 체크해제
//				System.out.println("전체선택 체크해제됨");
				cb1.setSelected(false);
				cb2.setSelected(false);
				cb3.setSelected(false);
				// 텍스트 "전체선택" 로 세팅
				cb4.setText("전체선택");
			}
		});
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Test1();
	}

}
