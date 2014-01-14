
public class Prjct2_07 {
	public static void main(String args[]){
		int hour,min,sec,temp;
		/*hour = 2;
		min = 32;
		sec = 24;*/
		
		int totalSeconds = 9999;
		
		hour = totalSeconds/3600;
		temp = ((totalSeconds)%3600);// issue part, the minutes
		min = temp/60;
		sec = temp%60;
		System.out.println("The total time in "+totalSeconds+" seconds is: "+hour+" hours "+min+" minutes and "+sec+" seconds");
	}
}
