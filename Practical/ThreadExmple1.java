package threads;

public class ThreadExmple1 implements Runnable{
	
	public void run() {
		System.out.println("I am thread....thread is running using runnnable");
	}

	public static void main(String[]args) {
		ThreadExmple1 r = new ThreadExmple1();
		Thread th = new Thread(r); //Thread (Runnable r)
		th.start();
		
		
		

	}

}
