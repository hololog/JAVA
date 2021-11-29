
public class Ex5 {

	public static void main(String[] args) {
		/*
		 * ���� 10000�� �ְ� ��� �Ѱ��� 1000�� �̶�� �Ҷ�
		 * 
		 * 1. �ִ� ���� ���� ����
		 * 2. ��� 3���� ����
		 * 3. ��� 5���� ��� ���� �ݾ�
		 * 4. ��� 5���� ��� ���̴� ������ (���űݾ��� 1%��� ����)
		 * 
		 * */
		int money = 10000;
		int apple = 1000;
		System.out.println(money / apple);
		System.out.println(apple * 3);
		System.out.println(money - (apple*5) );
		System.out.println(apple * 5 * 0.01);
		
	}

}
