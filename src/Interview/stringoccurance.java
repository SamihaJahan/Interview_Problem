package Interview;

public class stringoccurance {

	
	public static void main(String[] args) {
		// count single character occurrences
		String str = "Error";
		int intial_length = str.length();
		str = str.replace("r", "");
		int final_length = str.length();
		int count = intial_length - final_length;
		System.out.println("Number of occurrence of 'r' is: " + count);

		
		

}
	
	
}
