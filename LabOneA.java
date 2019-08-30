import java.util.Scanner;

public class LabOneA{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("How old are you?");
        int age = scanner.nextInt();
//        scanner.nextLine();
//        String newTest = scanner.nextLine();  -- Flushes next line for after the nextInt() call.
        System.out.println(String.format("It's nice to meet you, %s. Thanks for letting me know you are %d years old.", name, age));
        scanner.close();
    }
}