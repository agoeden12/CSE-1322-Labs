package agoeden;

public class Clothes {
    private String name;
    private String color;
    private boolean highTemp;
    
    public Clothes() {

    }
    
    public Clothes(String name, String color, boolean highTemp) {
        this.name = name;
        this.color = color;
        this.highTemp = highTemp;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHighTemp() {
        return highTemp;
    }

    public void setHighTemp(boolean highTemp) {
        this.highTemp = highTemp;
    }
    
}
