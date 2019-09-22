package AndrewGoeden;

/**
 * AllInclusive
 */
public class AllInclusive extends Vacation {

    private String brand;
    private int rating, totalCost;

    public AllInclusive(String brand, int rating, int totalCost, String destination) {
        super(totalCost, destination);

        this.brand = brand;
        this.rating = rating;
        this.totalCost = totalCost;
    }

    /**
     * @param totalCost the totalCost to set
     */
    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @param rating the rating to set
     */
    public void setRating(int rating) {
        this.rating = rating;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @return the rating
     */
    public int getRating() {
        return rating;
    }

    /**
     * @return the totalCost
     */
    public int getTotalCost() {
        return totalCost;
    }

    @Override
    public int keptToBudget() {
        return budget - totalCost;
    }

    @Override
    public String toString() {
        return String.format("All Inclusive %s vacation in %s with a %s-star rating coming in at $%s", getBrand(),
                getDestination(), getRating(), getCost());
    }

}