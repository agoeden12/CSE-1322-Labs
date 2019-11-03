package agoeden;

public class Food {
    
    private String name;
    private int caloriesPerContainer;
    private int numOfServings;
    private int totalCalories = numOfServings * caloriesPerContainer;
    
    public Food() {
       
    }
    
    public Food(String name, int caloriesPerContainer, int numOfServings) {
        this.name = name;
        this.caloriesPerContainer = caloriesPerContainer;
        this.numOfServings = numOfServings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCaloriesPerContainer() {
        return caloriesPerContainer;
    }

    public void setCaloriesPerContainer(int caloriesPerContainer) {
        this.caloriesPerContainer = caloriesPerContainer;
    }

    public int getNumOfServings() {
        return numOfServings;
    }

    public void setNumOfServings(int numOfServings) {
        this.numOfServings = numOfServings;
    }

    public int getTotalCalories() {
        return totalCalories;
    }

    public void setTotalCalories(int totalCalories) {
        this.totalCalories = totalCalories;
    }
}
