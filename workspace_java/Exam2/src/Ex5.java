
public class Ex5 {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		
		// Runnable 인터페이스를 이용하여 구현하도록 변경
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<300; i++) {
					System.out.println(i + " : th작업");
				}
				
			}
		}).start();
		
		// 람다식
		new Thread(() -> {
			for(int i=0; i<300; i++) {
				System.out.println(i + " : lambda작업");
			}
		}).start();
		
		
		
	}

}

class MyThread extends Thread {

	@Override
	public void run() {
		for(int i=0; i<300; i++) {
			System.out.println(i + " : 작업");
		}
	}
	
}
