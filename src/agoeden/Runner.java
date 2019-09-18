package agoeden;

/**
 * Runner
 */
public class Runner {

    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon octagon = new Octagon(8, 4);

        System.out.println(String.format("Octagon side length: %s | perimeter: %s | area: %s", octagon.getSideLength(),
                octagon.getPerimeter(), octagon.getArea()));

        Octagon newOctagon = octagon.clone();
        System.out.println(
                octagon.compareTo(newOctagon) == 0 ? "The octagons are the same!" : "The octagons are different.");
    }
}