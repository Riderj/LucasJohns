
public class Prjct2_08 {
	public static void main(String[] args){
		System.out.println(lineLength(4,3,2,5));
	}
	public static double lineLength(double x1,double x2, double y1, double y2){
		return Math.sqrt((Math.pow((x2-x1), 2)+Math.pow((y2-y1),2)));
	}
}
