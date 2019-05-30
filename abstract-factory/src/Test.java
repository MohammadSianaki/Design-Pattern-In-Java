class Test {
    public static void main(String[] args) {
        WoodenDoorFactory woodenDoorFactory = new WoodenDoorFactory();
        Door door = woodenDoorFactory.makeDoor();
        DoorFittingExpert doorFittingExpert = woodenDoorFactory.makeDoorFittingExpert();

        door.getDescription();
        doorFittingExpert.getDescription();


        IronDoorFactory ironDoorFactory = new IronDoorFactory();
        Door ironDoor = ironDoorFactory.makeDoor();
        DoorFittingExpert ironDoorFittingExpert = ironDoorFactory.makeDoorFittingExpert();

        ironDoor.getDescription();
        ironDoorFittingExpert.getDescription();

    }

}
