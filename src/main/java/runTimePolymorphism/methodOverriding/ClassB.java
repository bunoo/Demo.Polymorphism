package runTimePolymorphism.methodOverriding;

public class ClassB extends ClassA {
	
	public void whichPhonYouOwn() {
		System.out.println("Samsung");
	}

	
	public static void main(String[] args) {
		
		ClassB objB = new ClassB();
		objB.whichPhonYouOwn(); //Expected: Samsung
		
	}

}
