
public class Activity3Tester {

	public static void main(String[] args) {
		
		//Declare a Board object
		Board b = new Board();
		b.populateOne();
		b.populateOne();
		b.populateOne();
		b.populateOne();
		//create an array with some values you want to 
		//slideRight. ie [2 0 0 0]
		System.out.println(b.toString());
		System.out.println();
		//invoke the slideRight method on the array 
		b.combineDown();
		
		//print out the array to see if slideRight
		//worked
		System.out.println(b.toString());
		
	}

}
