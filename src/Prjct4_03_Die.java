import java.util.Random;
public class Prjct4_03_Die {
	public static final int MIN_FACES = 4;
	
	private static Random generator = new Random();
	private int numFaces;
	private int faceValue;
	
	//Defaults to a six-sided die. initial face value is 1.
	
	public Prjct4_03_Die(){
		numFaces = 6;
		faceValue = 1;
	}
	
	public Prjct4_03_Die(int faces){
		if (faces >= MIN_FACES){
			numFaces = faces;
		}else{
			numFaces = 6;
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
	public int getFaces() {
		return numFaces;
	}
}
