import java.awt.*;
import java.awt.event.*;
import java.util.*;

import javax.swing.*;
import javax.swing.event.*;

public class Ex3 {

	public Ex3() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("ComboBox 기초");
		f.setBounds(600, 400, 300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		f.getContentPane().add(p, BorderLayout.CENTER);
		
		/*
		 * 콤보박스(JComboBox(UIPltform)) 
		 * = selectBox(Html, JavaScript), DropdownList(C#)
		 * - 여러 항목을 목록 형태로 나열하는 컴포넌트
		 *   => 하나의 항목만 표시하고 목록 확장을 통해 선택 가능하도록 제공
		 * - 목록은 Vector 객체를 사용하여 저장하고, JComboBox 객체 생성자에 전달하여 표시  
		 * */
		
		// 콤보박스에 표시할 데이터를 Vector 객체에 전달
		// => 이름을 문자열로 저장하므로 제네릭 타입을 String 타입으로 지정
		Vector<String> listData = new Vector<String>();
		listData.add("항목을 선택하세요.");
		listData.add("항목1");
		listData.add("항목2");
		listData.add("항목3");
		
		// JComboBox 객체 생성 시 생성자 파라미터로 목록이 저장된 Vector객체 전달
		JComboBox comboBox = new JComboBox(listData);
		
		// JComboBox를 먼저 생성하고 차후에 데이터를 추가하는 경우
		// => Vector 객체의 add() 메서드를 호출하여 새로 추가되는 항목을 추가
//		listData.add("항목을 선택하세요.");
//		listData.add("항목1");
//		listData.add("항목2");
//		listData.add("항목3");
		
		comboBox.setFont(new Font("굴림체", Font.BOLD, 20));
		
		f.getContentPane().add(comboBox, BorderLayout.CENTER);
		
		// 콤보박스 이벤트 처리 - 5단계
		comboBox.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 콤보박스에 선택된 항목 출력 => getSelectedItem() 메서	드 사용
				// => 단, 첫번째 항목(제목)을 제외한 나머지를 선택했을 때만 항목 출력
//				System.out.println(comboBox.getSelectedIndex());
//				System.out.println(comboBox.getSelectedItem());
				if(comboBox.getSelectedIndex() > 0) {
					System.out.println(comboBox.getSelectedItem());
				}
			}
		});
		
		// ===========================================================
		/*
		 * 스피너(JSpinner)
		 * - 데이터를 목록 형태로 사용하는 것은 콤보박스와 동일하나
		 *   목록을 모두 표시하지 않고 화살표를 눌러서 목록을 하나씩 회전시키는 컴포넌트
		 * - 별다른 데이터 추가 및 설정이 없을 경우 기본적으로 정수 데이터가 사용됨
		 *   (정수 값이 1씩 증가 또는 감소)  
		 * */
		JSpinner spinner = new JSpinner();
		// 스피너에 필요한 항목 생성하려면 SpinnerXXXModel 객체 생성 필요
		// => 해당 모델 객체에 String[] 배열 또는 List 계열 객체를 추가하여 데이터 전달
		// 1. 배열 생성하여 데이터 저장
//		String[] items = {"자바", "JSP", "안드로이드"}; // String[] 배열 사용시
		ArrayList<String> items = new ArrayList<String>();
		items.add("자바"); items.add("JSP"); items.add("안드로이드");
		
		SpinnerListModel slm = new SpinnerListModel(items);
		spinner.setModel(slm);
		
		// 스피너 이벤트 처리 - 5단계
		// ActionListener 없음.
//		spinner.addChangeListener(new ChangeListener() {
//			
//			@Override
//			public void stateChanged(ChangeEvent e) {
//				// 항목이 변경되면 자동으로 호출되는 메서드
//				// => getValue() 메서드를 호출하면 항목 내용 가져오기 가능
//				System.out.println(spinner.getValue());
//			}
//		});
		
		// 람다식
		spinner.addChangeListener(e -> System.out.println(spinner.getValue()));
		
		
		spinner.setFont(new Font("굴림체", Font.BOLD, 20));
		f.add(spinner, BorderLayout.CENTER);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex3();
	}

}
