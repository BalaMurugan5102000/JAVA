package threads;

public class ThreadJoinExample extends Thread {
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				Thread.sleep(800);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadJoinExample t = new ThreadJoinExample();
		ThreadJoinExample t1 = new ThreadJoinExample();
		ThreadJoinExample t2 = new ThreadJoinExample();
		t.start();
		t1.start();
		try {
			t1.join();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
		t2.start();
	}
}
