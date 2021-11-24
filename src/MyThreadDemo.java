
public class MyThreadDemo extends Thread {
	
	public MyThreadDemo(String string) {

		System.out.println(string);
	}

	public void run() {
		System.out.println("Thread started");
	}

	public static void main(String[] args) {
		
		MyThreadDemo t1= new MyThreadDemo("Thread1");
		MyThreadDemo t2= new MyThreadDemo("Thread2");
	
		t1.start();
		t2.start();
	}

}
