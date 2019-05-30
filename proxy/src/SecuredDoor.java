class SecuredDoor {

    private Door door;

    public SecuredDoor(Door door) {
        this.door = door;
    }

    public void open(String password) {
        if (authenticate(password)) {
            this.door.open();
        } else {
            System.out.println("Invalid Password");
        }
    }

    private boolean authenticate(String password) {
        return password.equals("1234");
    }

    public void close() {
        this.door.close();
    }
}
