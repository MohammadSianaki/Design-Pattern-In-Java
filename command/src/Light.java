//Receiver
class Light {
    private boolean on;

    public void switchOn() {
        on = true;
        System.out.println("Light On");
    }

    public void switchOff() {
        on = false;
        System.out.println("Light Off");
    }
}
