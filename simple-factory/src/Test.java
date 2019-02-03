public class Test {

    public static void main(String[] args) {
        Door door = DoorFactory.makeDoor(100, 200);
        System.out.println("Width = " + door.getWidth());
        System.out.println("Height = " + door.getHeight());
    }
}
