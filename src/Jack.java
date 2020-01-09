
class c{
	public void name(){
		System.out.println("Name");
	}
}

class d extends Thread{
	
	c r;
	
	public d() {
		r= new c();
	}
	
	public void run(){
		r.name();
	}
	
}

public class Jack {
	
	public static void main(String[] args) {
		
			c obj = new c();
			d obj1= new d();
			obj1.start();
			
	}

}
