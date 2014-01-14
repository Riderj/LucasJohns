import java.text.DecimalFormat;
public class Prjct2_09 {
	public static void main(String[] args){
		double sphereRad = 3;
		double area,volume;
		DecimalFormat Dform = new DecimalFormat("0.####");
		volume = (4.0/3.0)*(Math.PI*(Math.pow(sphereRad,3)));
		area = 4*(Math.PI*(Math.pow(sphereRad, 2)));
		
		System.out.printf("The volume of a sphere with the radius %s is: %s \n The area of a sphere with the radius %s is: %s", sphereRad,Dform.format(volume),sphereRad,Dform.format(area));
	}
}
