/**
 * 
 */
package testPrepping;

/**
 * @author Benjamin Elfen
 *
 */
public class Interfaces implements Interface1 {

	String outputString;
	
	@Override
	public boolean workedOut() {
		return false;
	}

	@Override
	public String spotted() {
		return "this rubbish interface";
	}
	
	public Interfaces(String teeeest) {
		outputString = teeeest;
	}
	
	public static void main(String[] args) {
		Interfaces one = new Interfaces("blub");
		
		System.out.println(one.spotted());
		System.out.println(one.workedOut());
	}

}
