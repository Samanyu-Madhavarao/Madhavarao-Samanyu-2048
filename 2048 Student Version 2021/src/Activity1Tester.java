
public class Activity1Tester {

	public static void main(String[] args) {
		
		// Create a Board object
		Board b = new Board();
		
		// invoke the toString method by passing the object to 
		// print or println
		int[] row = {4, 2, 4, 4};
		b.combineLeft(row);
		for(int i = 0; i < 4; i++) {
			System.out.print(row[i]+" ");
		}
		
		
	}

}
