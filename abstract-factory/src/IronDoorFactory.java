class IronDoorFactory implements DoorFactory {
    @Override
    public Door makeDoor() {
        return new IronDoor();
    }

    @Override
    public DoorFittingExpert makeDoorFittingExpert() {
        return new Welder();
    }
}
