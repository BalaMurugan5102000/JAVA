package threads;

public class ThreadExample extends Thread {
	public void run() {
		System.out.println("I  am thread....thread is running");
		
	}

	public static void main(String[]args) {
		ThreadExample t = new ThreadExample();
		t.start();
		
		String s = t.getName(); // getting the thread name by invoking the getName()
		System.out.println(s);
		
	}
	}