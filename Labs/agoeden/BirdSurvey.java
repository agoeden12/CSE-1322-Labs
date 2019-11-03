package agoeden;

public class BirdSurvey {
private Bird first;

public BirdSurvey() {
    first = null;
}

 class Bird {
    private String species = "";
    private int count = 0;
    public Bird next;
    
   private Bird() {
    
   }
   
   private Bird(String species, int count) {
       this.species = species;
       this.count = count;
   }
   
   public void display() {
       System.out.println("Bird species: " + species + " count: " + count);
       }
        
    }
    
    public boolean isEmpty() {
        return (first == null);
    }
    
    public void addBirdFront(String species) {
        Bird newBird = new Bird(species, 1);
        newBird.next = first;
        first = newBird;
    }
    
    public void addBirdFront(String species, int count) {
        Bird newBird = new Bird(species,count);
        newBird.next = first;
        first = newBird;
    }
    
     public void addBirdBack(String species) {
       Bird tempBird = new Bird(species, 1);
       Bird current = first;
       while (current.next != null)
           current = current.next;
       current.next = tempBird;
    } 
     
     public void addBirdBack(String species, int count) {
         Bird tempBird = new Bird(species, count);
       Bird current = first;
       while (current.next != null)
           current = current.next;
       current.next = tempBird;  
    }
     
      public void increaseBirdCount(String species) {
        Bird current = first;
        Bird prev = current;
        if (current.species.equalsIgnoreCase(species)) {
            current.count = current.count + 1;
            return;
        }
        
        while(!current.species.equalsIgnoreCase(species)) {
            prev = current;
            current = current.next;
             if (current.species.equalsIgnoreCase(species)) {
                 current.count = current.count + 1;
                 return;
                 }
             }
           prev.next = current.next;
        
    }
    
    public void remove(String species) {
        Bird current = first;
        Bird prev = current;
        if (current.species.equalsIgnoreCase(species)) {
            first = current.next;
            return;
        }
        
        while(!current.species.equalsIgnoreCase(species)) {
            prev = current;
            current = current.next;
            if (current == null) 
                return;
             }
           prev.next = current.next;
        
    }
    
    public void getReport() {
        Bird bird = first;
        
        while(bird != null) {
            bird.display();
            bird = bird.next;
        }
    }
   
    public Bird findBird(String species) {
        Bird tempBird = first;
        if (!isEmpty()) {
            while(!first.species.equalsIgnoreCase(species)) {
                if (tempBird.next == null) {
                    return null;
                } else {
                    tempBird = tempBird.next;
                }
            }
        }
        return tempBird;
    }
    
    
    public void add(String species) { 
        if (findBird(species) == null) {
            addBirdFront(species, 1);
        } else {
            increaseBirdCount(species);
        }
    }
    
    public int getCount(String species) {
        Bird tempBird = first;
        if (!isEmpty()) {
            while(!first.species.equalsIgnoreCase(species)) {
                if (tempBird.next == null) {
                    return 0;
                } else {
                    tempBird = tempBird.next;
                }
            }
        }
        return tempBird.count;
    }
}
