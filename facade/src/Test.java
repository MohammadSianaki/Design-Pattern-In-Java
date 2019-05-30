class Test {

    public static void main(String[] args) {
        ComputerFacade computerFacade = new ComputerFacade(new Computer());

        computerFacade.turnOn();
        computerFacade.turnOff();
    }
}
