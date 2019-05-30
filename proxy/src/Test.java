class Test {

    public static void main(String[] args) {
        SecuredDoor securedDoor = new SecuredDoor(new LabDoor());
        securedDoor.open("invalid");

        securedDoor.open("1234");
        securedDoor.close();
    }
}
