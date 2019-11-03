package agoeden;

public class Stack {
    
    private int size = 20;
    Clothes[] clothes = new Clothes[size];
    private int index = 0;
     
    public Stack() {}
    
    public void pop() {
 
     System.out.println("Item popped: " + getItemDescription(index-1));
     
          for (int i = index; i > 0; i-- ) { 
                 if (clothes[i] != null) {
                    clothes[i] = clothes[i-1];
                 }
            }
          index = index - 1;
    }
    
    public void push(Clothes item) {
        Clothes tempCloth;
       
        
       if (index != size) { 
        tempCloth = clothes[index];
        clothes[index] = item;
        clothes[index+1] = tempCloth;
         index++;
       }
    }
    
    
    public String peek() {
        return "Peeked at item: " + getItemDescription(index-1) + " located at index: " + index;
    }
    
    public String getSameColors(String color) {
        String output = "";
        for (int i = 0; i < index; i++) {
            if (clothes[i].getColor().equalsIgnoreCase(color)) {
                output += "Items of same color: " +clothes[i].getName() + ", ";
            }
        }
        return output;
    }
    
    public int getAmountOfHighTempClothes() {
        int total = 0;
        for (int i = 0; i < index; i++) {
            if (clothes[i].isHighTemp() == true) {
                total += 1;
            }
        }
        
        return total;
    }
    
    public String getItemDescription(int index) {
        return clothes[index].getColor() + " " +clothes[index].getName();
    }
    
    
    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Clothes[] getClothes() {
        return clothes;
    }

    public void setClothes(Clothes[] clothes) {
        this.clothes = clothes;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
}
