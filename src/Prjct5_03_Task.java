import java.util.Random;
public class Prjct5_03_Task implements Prjct5_03_Priority {
	private int priority = 0;
	
	public Prjct5_03_Task() {
		Random ran = new Random();
		setPriority(ran.nextInt(10));
	}
	
	public Prjct5_03_Task(int priority2) {
		setPriority(priority2);
	}

	public void setPriority(int value) {
		priority = value;
		
	}
	public int getPriority() {
		return priority;
	}

}
