class Client {
    public static void main(String[] args) {
        RemoteController controller = new RemoteController();
        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        //switch on
        controller.setCommand(lightOn);
        controller.pressButton();

        //switch off
        controller.setCommand(lightOff);
        controller.pressButton();
    }
}
