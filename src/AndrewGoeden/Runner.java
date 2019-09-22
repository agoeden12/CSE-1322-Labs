package AndrewGoeden;

import java.util.*;

/**
 * Runner
 */
public class Runner {

    public static void main(String[] args) {


        Vacation vacation = new AllInclusive("Break", 2, 200, "Nille");
        System.out.println(vacation.toString() + "\n Since this is all inclusive your budget vs cost is $"
                + vacation.keptToBudget() + " left over.");

        AllInclusive firstVacation = new AllInclusive("Khalid", 5, 2500, "Nashville");
        System.out.println(firstVacation.toString() + "\n Since this is all inclusive your budget vs cost is $"
                + firstVacation.keptToBudget() + " left over.");

        Map<String, Integer> prices = new HashMap<String, Integer>();

        prices.put("Travel", 1050);
        prices.put("Food", 1050);

        PieceMeal secondVacation = new PieceMeal("Atlanta", 4000, prices);
        System.out.println(secondVacation.toString() + "\n Your budget vs cost is $"
        + secondVacation.keptToBudget() + " left over.");

        prices.clear();
        prices.put("Partying", 510);
        prices.put("Room", 900);

        Vacation thirdVacation = new PieceMeal("New York", 3000, prices);
        System.out.println(thirdVacation.toString() + "\n Your budget vs cost is $"
        + thirdVacation.keptToBudget() + " left over.");
    }
}
