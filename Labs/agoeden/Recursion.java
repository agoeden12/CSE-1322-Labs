package agoeden;

public class Recursion {

	public static int returnVowels(String input, int count) {
		
		if (input.length() > 1) {
			String singleLetter = input.substring(0,1);
			if (singleLetter.toUpperCase().matches(".*[AEIOU].*")) {
				count++;
			}
			return returnVowels(input.substring(1), count);
		} else {
			if (input.toUpperCase().matches(".*[AEIOU].*")) {
				count++;
			}
			return count;
		}
	}
	
	public static void main(String[] args) {
		String test = "Teesta";
		
		System.out.print(returnVowels(test,0));
	}
}
