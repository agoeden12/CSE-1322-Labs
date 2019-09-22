package AndrewGoeden;

/**
 * Vacation
 */
public abstract class Vacation{

    public String destination;
    public int cost, budget;

    public Vacation(int budget, int cost, String destination){
        this.budget = budget;
        this.cost = cost;
        this.destination = destination;
    }

    public Vacation(int budget, String destination){
        this.budget = budget;
        this.destination = destination;
    }

    /**
     * @param budget the budget to set
     */
    public void setBudget(int budget) {
        this.budget = budget;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * @return the budget
     */
    public int getBudget() {
        return budget;
    }
    
    /**
     * @return the cost
     */
    public int getCost() {
        return cost;
    }

    /**
     * @return the destination
     */
    public String getDestination() {
        return destination;
    }

    abstract int keptToBudget();


}