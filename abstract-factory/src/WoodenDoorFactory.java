class WoodenDoorFactory implements DoorFactory {
    @Override
    public Door makeDoor() {
        return new WoodenDoor();
    }

    @Override
    public DoorFittingExpert makeDoorFittingExpert() {
        return new Carpenter();
    }
}
