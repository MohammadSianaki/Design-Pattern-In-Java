class Test {

    private static final String[] COLOR = {"RED", "BLUE", "GREEN", "BLACK", "YELLOW"};


    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Circle circle = (Circle) ShapeFactory.makeShape(getRandomColor());
            circle.setRadius(100);
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return COLOR[(int) (Math.random() * COLOR.length)];
    }

    private static int getRandomX() {
        return (int) (Math.random() * 100);
    }

    private static int getRandomY() {
        return (int) (Math.random() * 100);
    }
}
