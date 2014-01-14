import java.util.Random;
public class Prjct5_05_Task implements Prjct5_04_Priority, Prjct5_04_Complexity, Comparable {
	private int priority = 0;
	private int complexityLevel = 0;
	Random ran = new Random();
	Prjct5_05_Task tskarg;
	
	/*
	 * 
	 * To do the comparisons, we just need to compare TWO things at a time, no more. Then compare priority then complexity if priority is the same.
	 * 
	 */
	
	
	//The following constructors provide a wide vareity of possible inputs for the class. 
	
	public Prjct5_05_Task() {
		setPriority(ran.nextInt(100));
		setComplexity(ran.nextInt(100));
	}
	
	public Prjct5_05_Task(int priority2) {
		setPriority(priority2);
		setComplexity(ran.nextInt(100));
	}
	
	public Prjct5_05_Task(int priority2, int complexity) {
		setPriority(priority2);
		setComplexity(complexity);
	}
	
	//---------------------

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

	public int compareTo(Object arg0) {
		tskarg = (Prjct5_05_Task) arg0;
		if(this.getPriority() > tskarg.getPriority()) {
			return 1;
		}else if(this.getPriority() < tskarg.getPriority()) {
			return 0;
		}else if(this.getPriority() ==tskarg.getPriority()){
			if(this.getComplexity() > tskarg.getComplexity()) {
				return 1;
			}else if(this.getComplexity() < ((Prjct5_05_Task) arg0).getComplexity()) {
				return 0;
			}
		}
		return 0; // if it does not find a match it will return 0 because they are the same.
	}

	
	public String toString() {
		String result = "";
		result =  " Priority: "+getPriority()+"    Complexity: "+getComplexity();
		return result;
	}
}
