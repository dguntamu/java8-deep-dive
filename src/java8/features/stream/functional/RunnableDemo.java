package java8.features.stream.functional;

import java.util.concurrent.Callable;

public class RunnableDemo {

	public static void main(String[] args) throws Exception {
		//Way-1
		Runnable r = () -> System.out.println("Runnable test");
		Thread t = new Thread(r);
		t.start();
		
		//Way-2
		Run rr = new Run();
		Thread t2 = new Thread(rr);
		t2.start();
		
		//Callable
		Call call = new Call();
		Thread t3 = new Thread();
		t3.start();
		
		
		/*
		 * Runnable r2 = new Runnable() {
		 * 
		 * @Override public void run() { // TODO Auto-generated method stub
		 * 
		 * }
		 * 
		 * };
		 */
	}

}
class Run implements Runnable{
	public void run() {
		System.out.println("Run implemented");
	}
}

class Call implements Callable{

	@Override
	public Object call() throws Exception {
		// TODO Auto-generated method stub
		return 10;
	}
	
}