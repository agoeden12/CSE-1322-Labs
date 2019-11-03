package agoeden;

import java.util.Scanner;

public class BaseFile {

	public static void main(String[] args) {

      BirdSurvey survey = new BirdSurvey();  
      survey.addBirdFront("Test");
      survey.getCount("Test");
      String bird = "";
         do {
             bird = inputBirdNames();
             if (!bird.equalsIgnoreCase("done"))
             survey.add(bird);
             } while (!bird.equalsIgnoreCase("done"));
          survey.getReport();
    }
    
    
    public static String inputBirdNames() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a bird name: ('done' ends the program)");
       String input = scanner.next();
        return input;
    }
}
