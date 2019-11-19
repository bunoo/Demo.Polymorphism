package runTimePolymorphism.downCasting;

public class DownCasting {

	public void whichPhonYouOwn() {
		System.out.println("Samsung");
	}
	
	public static void main(String[] args) {
	
		/* I am creating a ref variable of the child class <<DownCasting>> and store m/y of parent class. This is a
		   phenomenon of <<DOWNCASTING> which is not supported in java, hence it throws error at <<compile>> time. */
		
		// DownCasting dCast = new ClassA(); 

	}

}
