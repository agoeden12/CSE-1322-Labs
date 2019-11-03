package agoeden;

public class BaseFile {
    
	
	public static void main(String[] args) {
		Stack stack = new Stack();
	
	    Clothes shirt1 = new Clothes("polo shirt", "green", true);
	    Clothes shirt2 = new Clothes("t-shirt", "white", false);
	    Clothes shirt3 = new Clothes("socks", "blue", true);
	    Clothes jeans1 = new Clothes("jeans", "red", false);
	    Clothes jacket1 = new Clothes("jacket", "blue", true);
	
	    stack.push(shirt1);
	    stack.push(shirt2);
	    stack.push(shirt3);
	    stack.push(jeans1);
	    stack.push(jacket1);
	
	    System.out.println(stack.getSameColors("blue"));
	
	    System.out.println("\nAmount of high temp clothes in stack: " + stack.getAmountOfHighTempClothes());
	    System.out.println("\n" + stack.peek() + "\n");
	
	    stack.pop();
	    System.out.println("\n");
	
	    for (int i = stack.getIndex(); i > 0; i--) {
	        System.out.println(stack.getItemDescription(i));
	    }
 
        
        /*
        lab 5b part 2
        */
        System.out.println("\n\n\n\nLab 5b Part 2\n\n\n\n");
        Queue queue = new Queue();
        
        Food pizza1 = new Food("Cheese Pizza", 350, 5);
        Food soup1 = new Food("Chicken Noodle Soup", 110, 12);
        Food soup2 = new Food("Chicken Tortilla Soup", 250, 10);
        Food protein1 = new Food("Buffalo Fried Chicken Wing", 150, 30);
        Food protein2 = new Food("Ribeye Steak 10oz", 420, 1);
        
        queue.enqueue(pizza1);
        queue.enqueue(soup1);
        queue.enqueue(soup2);
        queue.enqueue(protein1);
        queue.enqueue(protein2);
        
        System.out.println("Highest calories: " + queue.getHighestCalorieCount().getName());
        queue.dequeue();
        System.out.println(queue.peek());
        System.out.println("\n");
        
        for (int i = 0; i < queue.getIndex(); i++) {
            System.out.println(queue.getItemDescription(i));
        }
    }
}
