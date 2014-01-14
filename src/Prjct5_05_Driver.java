
public class Prjct5_05_Driver {
	public static void main(String args[]) {
		Prjct5_05_Task obj1 = new Prjct5_05_Task(0,1);// random
		Prjct5_05_Task obj2 = new Prjct5_05_Task(1);// random
		
		if(obj1.compareTo(obj2) == 1) {
			System.out.println("Object 1: "+obj1);
			System.out.println("Object 2: "+obj2);
		}else if(obj1.compareTo(obj2) == 0) {
			System.out.println("Object 2: "+obj2);
			System.out.println("Object 1: "+obj1);
		}
	}
}
