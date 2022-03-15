import java.awt.*;
import java.util.*;

import javax.swing.*;
import javax.swing.table.*;

public class Ex2 {

	public Ex2() {
		showFrame();
	}
	
	public void showFrame() {
		JFrame f = new JFrame("테이블 기초");
		f.setBounds(800, 400, 400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		 * JTable
		 * - 데이터를 테이블(표) 형식으로 표현하는 컴포넌트
		 * - 행, 열 구조로 데이터가 구성
		 * - 2차원 배열을 사용하여 데이터를 추가하거나, Vector 객체 사용하여 추가 가능
		 *   => 직접 추가하는것 보단 Model 객체(DefaultTableModel)를 사용하여 추가
		 * - 기본적으로 스크롤 기능이 없으므로 데이터가 많아지면 관리가 어려움
		 *   => JScollPane 객체를 활용하여 스크롤 기능 추가하여 사용
		 *   => JTable -> JScrollPane -> JFrame 순서로 부착  
		 * 
		 * */
		
		// 1. JScrollPane 객체 생성 후 JFrame에 부착
		JScrollPane scrollPane = new JScrollPane();
		f.add(scrollPane, BorderLayout.CENTER);
		
		// 2. JTable 객체 생성 후 JScrollPane 의 ViewportView 영역에 부착
		JTable table = new JTable();
		scrollPane.setViewportView(table);
		
		// =======================================================
		// 3. JTable 데이터 추가
		// 1) DefaultTableModel 객체에 배열 형태로 데이터 추가
		//	  => 1차원 배열 생성하여 열 제목 저장, 2차원 배열 생성하여 데이터 추가
		//		 이 때, 2차원 배열의 1개 행 = 1개 레코드(= 여러개의 컬럼 집합)
		//    => 크기가 불변 이므로 데이터가 추가되는 경우 사용이 어려움
//		String[] columnNames = {"번호", "이름", "아이디", "패스워드"};	// 제목
//		String[][] data = {	// 데이터
//				{"1", "홍길동", "hong", "hong123"},
//				{"2", "이순신", "leess", "lee123"},
//				{"3", "강감찬", "kang", "kang123"},
//		};
//		
//		DefaultTableModel dtm = new DefaultTableModel(data, columnNames);
//		table.setModel(dtm);
		
		// --------------------------------------------------------
		// 2) DefaultTableModel 객체에 Vector 객체 형태로 데이터 추가
		// 2-1. 제목과 데이터가 한꺼번에 추가되는 경우
		//      => 데이터가 미리 준비된 상태에서 Model 객체 생성과 테이블 추가 작업이 수행
//		Vector<String> columnNames = 
//				new Vector<String>(Arrays.asList("번호", "이름", "아이디", "패스워드"));
//		Vector data = new Vector();
//		// 번호, 이름, 아이디, 패스워드 순으로 데이터 추사할 Vector 객체 생성하여
//		// 데이터를 저장한 후 전체 Vector 객체에 1개 레코드 데이터 Vector 객체 추가
//		Vector rowData = new Vector();
//		rowData.add(1); rowData.add("홍길동"); rowData.add("hong"); rowData.add("hong123");
//		// 1개 레코드를 전체 Vector에 추가
//		data.add(rowData);
//		
//		// 새로운 Vector 객체를 생성하여 다시 새로운 1개 레코드 저장 후 전체 Vector에 추가
//		rowData = new Vector();
//		rowData.add(2); rowData.add("이순신"); rowData.add("leess"); rowData.add("lee123");
//		data.add(rowData);
//		
//		rowData = new Vector();
//		rowData.add(3); rowData.add("강감찬"); rowData.add("kang"); rowData.add("kang123");
//		data.add(rowData);
//		
//		// 제목이 저장된 Vector 객체와 전체 데이터가 저장된 Vector 객체를 Model객체에 추가
//		DefaultTableModel dtm = new DefaultTableModel(data, columnNames);
//		// Model 객체를 JTable에 추가
//		table.setModel(dtm);
		
		// ---------------------------------------------------------------------------
		// 2-2 제목만 추가 후 1개 레코드 씩 데이터 Vector 객체를 별도로 추가하는 경우
		// => 데이터가 미리 만들어져 있지 않은 상태에서 열 제목만 먼저 추가하고
		//    데이터는 차후에 추가하는 방법
		Vector<String> columnNames = 
				new Vector<String>(Arrays.asList("번호", "이름", "아이디", "패스워드"));
		
		// DefaultTableModel 객체를 생성하여 제목열 Vector 객체를 먼저 추가
		DefaultTableModel dtm = new DefaultTableModel(columnNames, 0);
		// 제목만 저장된 DefaultTableModel 객체를 먼저 테이블에 추가 가능
		table.setModel(dtm);
		
		// 별도로 데이론터를 추가하기 위해 Vector 객체를 생성하여
		// 1개 레코드를 저장한 후 DefaultTableModel 객체의 addRow() 메서드를 통해 추가
		// => 별도의 메서드에서 데이터 추가작업이 이루어져야 할 경우
		//    DefaultTableModel 객체를 JTable 객체로부터 가져와서 작업을 수행
		//    => getModel() 메서드를 통해 Model 객체 형태로 리턴받아 추가작업 수행
		//       Model -> DefaultTableModel 형변환 필요
		
		DefaultTableModel myModel = (DefaultTableModel) table.getModel();
		// => 기존의 제목열 및 추가된 데이터가 있을 경우 그대로 유지됨
		
		Vector rowData = new Vector();
		rowData.add(1); rowData.add("홍길동"); rowData.add("hong"); rowData.add("hong123");
		myModel.addRow(rowData);
		
		rowData = new Vector();
		rowData.add(1); rowData.add("홍길동"); rowData.add("hong"); rowData.add("hong123");
		myModel.addRow(rowData);
		
		rowData = new Vector();
		rowData.add(1); rowData.add("홍길동"); rowData.add("hong"); rowData.add("hong123");
		myModel.addRow(rowData);
		
		// 새로운 데이터가 추가된 Model 객체를 다시 JTable 객체에 추가
		table.setModel(myModel);
		
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex2();
	}

}






