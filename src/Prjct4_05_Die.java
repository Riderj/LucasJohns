import java.util.Random;
public class Prjct4_05_Die {
	private final int MIN_FACES = 4;
	
	private static Random generator = new Random();
	private int numFaces;
	private int faceValue;
	
	//Defaults to a six-sided die. initial face value is 1.
	
	public Prjct4_05_Die(){
		numFaces = 6;
		faceValue = 1;
	}
	
	public Prjct4_05_Die(int faces){
		if (faces < MIN_FACES){
			numFaces = 6;
		}else{
			numFaces = faces;
		}
		
		faceValue = 1;
	}
	
	public int roll(){
		faceValue = generator.nextInt(numFaces)+1;
		return faceValue;
	}
	
	public int getFaceValue(){
		return faceValue;
	}
}
