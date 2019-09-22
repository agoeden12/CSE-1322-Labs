package AndrewGoeden;

import java.util.*;

/**
 * PieceMeal
 */
public class PieceMeal extends Vacation {

    public Map<String, Integer> prices;
    public int totalCost;

    public PieceMeal(String destination, int budget, Map<String, Integer> prices) {
        super(budget, destination);

        this.prices = prices;
        this.totalCost = getTotalCost();
    }

    public int getTotalCost() {
        int total = 0;

        for (int price : prices.values()) {
            total += price;
        }
        return total;
    }

    public String getPricesString() {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 0;

        for (Map.Entry<String, Integer> price : prices.entrySet()) {
            stringBuilder.append(price.getKey()).append(" - $").append(price.getValue());
            if (count <= prices.size() - 1){
                stringBuilder.append(" | ");
            }
        }
        
        stringBuilder.delete(stringBuilder.lastIndexOf("|") - 1, stringBuilder.length());

        return stringBuilder.toString();
    }

    @Override
    public int keptToBudget() {
        return (budget - totalCost);
    }
    
    @Override
    public String toString() {
        return String.format("Piecemeal vacation in %s coming in at $%s from these costs %s",
                getDestination(), getTotalCost(), getPricesString());
    }
}