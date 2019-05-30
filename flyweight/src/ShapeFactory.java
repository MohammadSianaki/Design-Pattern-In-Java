import java.util.HashMap;

class ShapeFactory {

    private static final HashMap<String, Shape> map = new HashMap<>();

    public static Shape makeShape(String color) {
        Circle circle = (Circle) map.get(color);

        if (circle == null) {
            circle = new Circle(color);
            map.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
