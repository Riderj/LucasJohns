import java.util.Random;
public class Prjct5_04_Task implements Prjct5_04_Priority, Prjct5_04_Complexity {
	private int priority = 0;
	private int complexityLevel = 0;
	Random ran = new Random();
	
	public Prjct5_04_Task() {
		setPriority(ran.nextInt(100));
		setComplexity(ran.nextInt(100));
	}
	
	public Prjct5_04_Task(int priority2) {
		setPriority(priority2);
		setComplexity(ran.nextInt(100));
	}
	
	public Prjct5_04_Task(int priority2, int complexity) {
		setPriority(priority2);
		setComplexity(complexity);
	}

	public void setPriority(int value) {
		priority = value;
		
	}
	public int getPriority() {
		return priority;
	}

	public void setComplexity(int complexity) {
		complexityLevel = complexity;
	}

	public int getComplexity() {
		return complexityLevel;
	}

}
