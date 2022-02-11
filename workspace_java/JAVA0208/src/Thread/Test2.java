package Thread;

public class Test2 {

	public static void main(String[] args) {
		// 메시지 전송과 파일 전송을 동시에 수행할 경우
		// 1. 싱글쓰레드로 구현한 경우
		SendMessage sm = new SendMessage("안녕하세요", 10);
		FileTransfer ft = new FileTransfer("a.java", 100000);
		
		ft.run(); // 파일 전송이 끝나야만
		sm.run(); // 메세지 전송이 시작됨
		
		System.out.println("============================");
		
		// 2. 멀티쓰레드로 구현한 경우
		SendMessageThrad smt = new SendMessageThrad("안녕하세요", 10);
		FileTransferThread ftt = new FileTransferThread("a.java", 100000);
		ReceiveMessageThread rmt = new ReceiveMessageThread("Re:안녕하세요", 50000);
		
		// 반드시 start() 메서드 호출 필수!
		ftt.start();	// 파일 전송 쓰레드가 시작되면 전송이 끝나지 않더라도
		smt.start();	// 메세지 전송이 시작되어 파일전송과 메시지 전송이 동시에 수행됨
		rmt.start();
		
		
	}
}

class SendMessage {
	String str;
	int count;
	public SendMessage(String str, int count) {
		this.str = str;
		this.count = count;
	}
	
	public void run() {
		for(int i=1; i<=count; i++) {
			System.out.println(i + " : " + str + "메세지 전송");
		}
	}
}


class FileTransfer {
	String str;
	int count;
	
	public FileTransfer(String str, int count) {
		this.str = str;
		this.count = count;
	}
	
	public void run() {
		for(int i=1; i<=count; i++) {
			System.out.println(i + " : " + str + "파일 전송");
		}
	}
	
}

// 메시지 전송 클래스를 Thread 클래스를 상속받아 정의 SendMessageThrad
class SendMessageThrad extends Thread {
	String str;
	int count;
	
	public SendMessageThrad(String str, int count) {
		this.str = str;
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=count; i++) {
			System.out.println(i + " : " + str + "메세지 전송");
		}
	}
}

// 파일 전송 클래스를 Thread 클래스를 상속받아 정의 FileTransferThread
class FileTransferThread extends Thread {
	String str;
	int count;
	
	public FileTransferThread(String str, int count) {
		this.str = str;
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i=1; i<=count; i++) {
			System.out.println(i + " : " + str + "파일 전송");
		}
	}
	
}

// 메시지 수신 클래스를 Thread 클래스를 상속받아 정의 ReceiveMessageThread
class ReceiveMessageThread extends Thread {
	String str;
	int count;
	
	public ReceiveMessageThread(String str, int count) {
		this.str = str;
		this.count = count;
	}
	
	@Override
	public void run() {
		for(int i=1; i <= count; i++) {
			System.out.println(i + " : " + str + "메세지 수신");
		}
	}
	
	
}











