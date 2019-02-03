class DoorFactory {

    public static Door makeDoor(double width, double height) {
        return new WoodenDoor(width, height);
    }

}
