package agoeden;

/**
 * Octagon
 */
public class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {

    public Octagon(int sides, int sideLength) {
        super(sides, sideLength);
    }

    @Override
    double getArea() {
        return Math.round((2 + 4 / Math.sqrt(2)) * Math.pow(sideLength, 2.0));
    }

    @Override
    double getPerimeter() {
        return sides * sideLength;
    }

    @Override
    public int compareTo(Octagon octagon) {
       return sides == octagon.getSides() && sideLength == octagon.getSideLength() ? 0 : -1;
    }

    @Override
    protected Octagon clone() throws CloneNotSupportedException {
        return (Octagon) super.clone();
    }
}