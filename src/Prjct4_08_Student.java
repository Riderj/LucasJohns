import java.text.DecimalFormat;


public class Prjct4_08_Student {
	private String firstName, lastName;
	private Prjct4_08_Address homeAddress, schoolAddress;
	private double score1,score2,score3;
	
	public Prjct4_08_Student(String first, String last, Prjct4_08_Address home, Prjct4_08_Address school, double s1, double s2, double s3){
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		score1 = s1;
		score2 = s2;
		score3 = s3;
	}
	public Prjct4_08_Student(String first, String last, Prjct4_08_Address home, Prjct4_08_Address school){
		firstName = first;
		lastName = last;
		homeAddress = home;
		schoolAddress = school;
		score1 = 0;
		score2 = 0;
		score3 = 0;
	}
	
	public void setTestScore(int testNum, double score){
		switch(testNum) {
		case 1:
			score1 = score;
			break;
		case 2:
			score2 = score;
			break;
		case 3:
			score3 = score;
			break;
		}
	}
	
	public double getTestScores(int test){
		switch(test){
		case 1:
			return score1;
		case 2:
			return score2;
		case 3:
			return score3;
		default:
			System.out.println("The entered test number does not exist. (Error: getTestScores(int test))");
			break;
		}
		return 0;
	}
	
	public double getAverage(){
		double avg = 0;
		avg = (score1+score2+score3);
		avg = avg/3;
		return avg;
	}
	
	public String toString(){
		String result;
		DecimalFormat fmt = new DecimalFormat("#.##");
		
		result = firstName + " " + lastName + "\n";
		result += "Home Address:\n"+homeAddress+"\n";
		result += "School Address:\n"+schoolAddress;
		result += "\n\n"+firstName+"'s Test Scores:\n" + "Score 1: "+score1+"\nScore 2: "+score2+"\nScore 3: "+score3;
		result += "\nTest Score Average: "+fmt.format(getAverage());
		
		return result;
	}
}
