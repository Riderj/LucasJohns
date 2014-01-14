
public class Prjct6_07_GradeRange {
	public static void main (String[] args){
		Prjct6_07_Grade[] grades = {new Prjct6_07_Grade("A",95),new Prjct6_07_Grade("A-",90),
				new Prjct6_07_Grade("B+",87),new Prjct6_07_Grade("B",83),new Prjct6_07_Grade("B-",80),
				new Prjct6_07_Grade("C+",77),new Prjct6_07_Grade("C",73),new Prjct6_07_Grade("C-",70),
				new Prjct6_07_Grade("D+",67),new Prjct6_07_Grade("D",63),new Prjct6_07_Grade("D-",60),
				new Prjct6_07_Grade("F",0)};
		
		for(int level = 0; level < grades.length; level ++) {
			System.out.println(grades[level]);
		}
	}
}
