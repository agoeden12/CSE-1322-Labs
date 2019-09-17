package AndrewGoeden;

/**
 * AllInclusive
 */
public class AllInclusive extends Vacation {

    private String brand;
    private int rating, totalCost;

    public AllInclusive(String brand, int rating, int totalCost) {
        super(0, 0, "destination");
    }

    @Override
    public int keptToBudget(int budget, int cost) {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString() + ""; //TODO: customize output to have variables
    }
    
}