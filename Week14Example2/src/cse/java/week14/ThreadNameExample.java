package cse.java.week14;

class ThreadA extends Thread {
	public ThreadA() {
		setName("ThreadA");
	}
	
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}

class ThreadB extends Thread {
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); // 이 코드를 실행하는 스레드 객체 얻기
		System.out.println("프로그램 시작 스레드 이름: " + mainThread.getName()); 
		
		ThreadA threadA = new ThreadA(); //ThreadA 객체 생성
		System.out.println("작업 스레드 이름: " + threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB(); //ThreadB 객체 생성
		System.out.println("작업 스레드 이름: " + threadB.getName());
		threadB.start();	
	}
}
