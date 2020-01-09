
class Printer{	
		public void printing(int num, String name){
			for(int i=1;i<=num;i++){
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(name+" "+ i);
			}
		}
}

class B extends Thread{
	
	Printer bref;
	public B(Printer obj) {
		bref=obj;
	}
	public void run(){
		synchronized (bref) {
			bref.printing(10, "c#");	
		}
		
	}
}

class A extends Thread{
	
	Printer aref;
	public A(Printer obj) {
		aref=obj;
	}
	public void run(){
		synchronized (aref) {
			aref.printing(10, "Java");
		}
		
	}
}


public class Test {
	//Execute Done in Main Function
	public static void main(String[] args) {
		
		//job1
		System.out.println("Application started");
		
		Printer obj= new Printer();
		A obj1= new A(obj);
		B obj2= new B(obj);
		obj1.start();
//		try {
//			obj1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		obj2.start();
		
		//obj.printing(10, "Java");
		
		//job4
		System.out.println("Application Finished");
	}
}
