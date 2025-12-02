package cse.java.week14;

public class ThreadExample {
	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<20; i++) {
					System.out.println("0");
					try {
						Thread.sleep(100); // 0.1초간 일시 정지
					} catch(Exception e) {
						
					}
				}
			}
		});
		thread.start();
		
		
		for(int i=0; i<20; i++) {
			System.out.println("1");
			try {
				Thread.sleep(100); // 0.1초간 일시 정지
			} catch(Exception e) {
				
			}
		}
	}
}
