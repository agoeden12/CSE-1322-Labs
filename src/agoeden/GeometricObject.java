package agoeden;

/**
 * GeometricObject
 */
public abstract class GeometricObject {

    protected int sides;
	protected int sideLength;

    public GeometricObject(int sides, int sideLength){
        this.sides = sides;
        this.sideLength = sideLength;
    }

    abstract double getArea();
    abstract double getPerimeter();

    /**
     * @return the sides
     */
    public int getSides() {
        return sides;
    }

    /**
     * @param sides the sides to set
     */
    public void setSides(int sides) {
        this.sides = sides;
    }

    /**
     * @return the sideLength
     */
    public int getSideLength() {
        return sideLength;
    }

    /**
     * @param sideLength the sideLength to set
     */
    public void setSideLength(int sideLength) {
        this.sideLength = sideLength;
    }
}