package java_jungsuck3;

class ThreadEx10 implements Runnable { // 이 클래스에 run()클래스가 작성되어 있다는 것을 의미
	static boolean autoSave = false;
	
	public static void main (String[] args) {
		Thread t = new Thread(new ThreadEx10()); // Thread 생성자인 Thread (Runnable r)에 넣어준다.
		// runnable인터페이스 타입에 매개변수를 선언해주는게 있다.
		// 생성자 호출할때 runnable인터페이스를 구현한 클래스 객체를 넣어줘야 한다는 의미
		// runnable 인터페이스에 구현된 run메서드를 작성해서 쓰레드에 생성자를 전달하라는 의미
		 
		t.setDaemon(true);
		t.start();
		
		for(int i=1;i<=10;i++) {
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e) {}
			System.out.println(i);
			
			if (i==5)
				autoSave = true;
		}
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void run() { 
		while(true) {
			try {
				Thread.sleep(3 * 1000); // 3초마다
			}catch(InterruptedException e) {}
			//autoSave의 값이 true이면 autoSave()를 호출한다.
			if(autoSave) {
				autoSave();
			}
		}
	}
	
//	public void autoSave() {
		System.out.println("작업파일이 자동저장되었습니다.");
	}
}