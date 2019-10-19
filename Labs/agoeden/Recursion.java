package agoeden;

public class Recursion {

	public static boolean palindromeCheck(String input) {
    char[] letters = input.toCharArray();
    if (letters.length < 2) {
      return true;
    } else if (letters[0] == letters[letters.length - 1]){
      return palindromeCheck(input.substring(1, input.length() - 1));
    }
    return false;
  }

  public static void main(String[] args) {
    System.out.println(palindromeCheck("mam"));
  }
}
