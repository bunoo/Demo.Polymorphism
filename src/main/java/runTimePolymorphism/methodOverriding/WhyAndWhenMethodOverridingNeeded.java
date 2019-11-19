package runTimePolymorphism.methodOverriding;

public class WhyAndWhenMethodOverridingNeeded extends ClassA {
	/* It demonstrates the need of Method overloading. Suppose each of parent class and child class have one method defined, but they are altogether diff.
	   1. Create <<ref variable>> of ClassB 
	   2. Assign m/y of ClassB
	   3. Call the method of the parent class by the object of the child class ClassB
	   4. Expected: The method of the parent class will be called. 
	   
	   PS: 1.)Q: It is analogus to a scenario wherein father has a phone (say Nokia), but child does not has any phone. If someone asks the child, which phone he holds?
	   Ans: Since child does not has any phone till now, so he will say <<Nokia>>
	   
	   2.) Q: But the problem arises, when the child has grown adult and started owning a new phone (say Samsung). If someone asks the child, which phone he holds?
	   Ans: This time it will be <<Samsung>>. This is demonstrated in ClassB
	   */
	
	public void Enjoy() {
		System.out.println("Enjoying life with my papa's phone - Noka");
	}
	
	public static void main(String[] args) {
		WhyAndWhenMethodOverridingNeeded whyOverriding = new WhyAndWhenMethodOverridingNeeded();
		whyOverriding.whichPhonYouOwn(); // Expected: Nokia
	

	}

}
