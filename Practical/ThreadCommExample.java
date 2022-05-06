package threads;

class Data {
	int i;
	boolean valueSet = false;
	
	synchronized void produce(int i) {
		if(valueSet)
			try {
				wait();
			}
		catch(Exception e) {
			System.out.println(e);
		}
		this.i = i;
		valueSet = true;
		System.out.println(" Data production done "+ i);
		notify();
	}
   synchronized int consume() {
	   if(!valueSet)
		   try {
			   wait();
		   }
	   catch(Exception e) {
		   System.out.println(e);
	   }
	   System.out.println(" Data consumed "+ i);
	   valueSet = false;
	   notify();
	   return i;
   }
}


class Producer extends Thread{
	Data d;
	
	public Producer(Data d) {
		this.d = d;
	}
	public void run() {
		for(int j=1; j<=5; j++) {
			d.produce(j);
		}
	}
}
class Consumer extends Thread{
	Data d;
	public Consumer(Data d) {
		this.d = d;
	}
	public void run() {
		for(int k=1; k<=5; k++) {
			d.consume();
		}
	}
}

public class ThreadCommExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Data d = new Data();
      Producer p = new Producer(d);
      Consumer c = new Consumer(d);
      p.start();
      c.start();
      
	}

}
