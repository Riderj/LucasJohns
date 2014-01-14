
public class Prjct6_07_Grade {
	private String letter;
	private int cutoff;
	public Prjct6_07_Grade(String gradeLetter, int gradeCutoff) {
		this.letter = gradeLetter;
		this. cutoff = gradeCutoff;
	}
	
	public int getCutoff() {
		return cutoff;
	}
	
	public String getLetter() {
		return letter;
	}
	
	public String toString() {
		return getLetter() + "\t" + getCutoff();
		
	}
	
}
