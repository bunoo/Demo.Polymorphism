package runTimePolymorphism.upCasting.multiLevelInheritance;

public class MultilevelInheritance {

	public static void main(String[] args) {

		Animal a1;  
		a1=new Animal();
		a1.eat();  
		
		Animal a2;
		a2=new Dog();
		a2.eat();  
		
		Animal a3;
		a3=new BabyDog();  
        a3.eat();  

	}

}
