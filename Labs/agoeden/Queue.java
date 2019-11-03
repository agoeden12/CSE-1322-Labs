package agoeden;

public class Queue {
    
	private int size = 20;
    Food[] foods = new Food[size];
    private int index = 0;
    private int front = 0;

    public Queue() {

    }

    public void enqueue(Food item) {
        foods[index] = item;
        index++;
    }

    public void dequeue() {
        System.out.println("Item dequeued: " + getItemDescription(front));

        for (int i = 0; i < foods.length; i++) {
            if (foods[i] != null) {
                foods[i] = foods[i + 1];
            }
        }
        index = index - 1;
    }

    public Food dequeueCompare() {
        Food dequeuedFood = new Food();
        dequeuedFood = foods[0];

        for (int i = 0; i < foods.length; i++) {
            if (foods[i] != null) {
                foods[i] = foods[i + 1];
            }
        }
        index = index - 1;

        return dequeuedFood;
    }

    public String peek() {
        return "Peeked at item: " + getItemDescription(front);
    }

    public String getItemDescription(int index) {
        return foods[index].getName() + " ";
    }

    public Food getHighestCalorieCount() {
        int highest = foods[0].getTotalCalories();
        Food highestCalorieFood = new Food();
        Food tempFood = new Food();

        for (int i = 0; i < index; i++) {
            tempFood = dequeueCompare();
            if (tempFood.getTotalCalories() > highest) {
                highestCalorieFood = tempFood;
                System.out.println("Highest is " + highestCalorieFood.getName());
            }
            enqueue(tempFood);
        }

        return highestCalorieFood;
    }

    public double getAverageAmtOfCaloriesInQueue() {

        double sum = 0;
        int length = index;

        for (int i = 0; i < index; i++) {
            sum += foods[i].getCaloriesPerContainer();
        }

        return sum / length;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Food[] getFoods() {
        return foods;
    }

    public void setFoods(Food[] foods) {
        this.foods = foods;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
      
}