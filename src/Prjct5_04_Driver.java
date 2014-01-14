
public class Prjct5_04_Driver {
	public static void main(String args[]) {
		Prjct5_04_Task obj1 = new Prjct5_04_Task(); // Constructor will set both priority and complexity to a random number.
		Prjct5_04_Task obj2 = new Prjct5_04_Task(24); // constructor will set the priority to 24, complexity to a random value
		Prjct5_04_Task obj3 = new Prjct5_04_Task(222,12); //Sets complexity to 12 and priority to 222
		Prjct5_04_Task obj4 = new Prjct5_04_Task();// random
		Prjct5_04_Task obj5 = new Prjct5_04_Task();// random
		
		System.out.println("Priority: " +obj1.getPriority() + "  || Complexity: " + obj1.getComplexity());
		System.out.println("Priority: "  +obj2.getPriority() + " || Complexity: " + obj2.getComplexity());
		System.out.println("Priority: "  +obj3.getPriority() + " || Complexity: " + obj3.getComplexity());
		System.out.println("Priority: "  +obj4.getPriority() + " || Complexity: " + obj4.getComplexity());
		System.out.println("Priority: "  +obj5.getPriority() + " || Complexity: " + obj5.getComplexity());
	}
}
