class Test {
    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());

        coffee = new MilkCoffee(coffee);
        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());

        coffee = new WhipCoffee(coffee);
        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());

        coffee = new VanillaCoffee(coffee);
        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());
    }
}
