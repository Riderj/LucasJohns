
public class Prjct3_07 {
	public static void main(String[] args){
		for(int r=0;r<=12;r++){
			System.out.print(r+"\t");
		}
		System.out.println();
		for(int c=1;c<13;c++){
			System.out.print(c);
			for(int p=1;p<13;p++){
				System.out.print("\t"+(p*c));
			}
			System.out.println();
		}
	}
}
