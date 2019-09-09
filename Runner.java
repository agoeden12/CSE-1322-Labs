import java.util.Arrays;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        // Create scanner from input file
        Scanner scanner = new Scanner(Runner.class.getResourceAsStream("input.txt"));
        String line;

        // Print out header
        System.out.printf("| %6s | %6s | %14s | %7s | %s", "First", "Last", "Grades", "Average", "Letter Grade\n");
        while (scanner.hasNextLine()) { // Scan entire file
            line = scanner.nextLine(); // Assign line variable to current line
            if (line.isEmpty()) { // If line is empty, print separator for next dataset and continue loop
                System.out.println("------------------------------------------");
                continue;
            }
            String[] split = line.split(" "); // Split data into readable input array
            String[] scores = Arrays.copyOfRange(split, 2, split.length); // Isolate test scores into separate array
            Tests tests = new Tests(split[0], split[1], scores); // Instantiate tests object

            // Output data into formatted columns as per example
            System.out.printf("%8s %8s | %14s | %7.2f | %s\n", tests.getFirstName(), tests.getLastName(), join(scores, " "), tests.getGradeAverage(), tests.getLetterGrade());
        }
    }

    /**
     * Helper method to join array into clean string
     *
     * @param array Array to join
     * @param delimiter String to join array with
     * @return Joined string
     */
    private static String join(String[] array, String delimiter) {
        StringBuilder stringBuilder = new StringBuilder(array[0]); // Create stringbuilder object with first string predetermined
        for (int i = 1; i < array.length; i++) { // Start loop at index 1 to prevent doubling up on the first object
            stringBuilder.append(delimiter).append(array[i]); // Append delimiter and string to stringbuilder
        }
        return stringBuilder.toString(); // Output built string
    }
}