
public class Prjct4_08_Address {
	private String streetAddress, city, state;
	private int zipCode;
	
	public Prjct4_08_Address(String street, String town, String st, int zip){
		streetAddress = street;
		city = town;
		state = st;
		zipCode = zip;
	}
	
	public String toString(){
		String result;
		
		result = streetAddress + "\n";
		result+= city + ", "+state+" "+zipCode;
		
		return result;
	}
}
