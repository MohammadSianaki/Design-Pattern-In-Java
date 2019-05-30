class MilkCoffee implements Coffee {

    private Coffee coffee;

    MilkCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return this.coffee.getCost() + 2;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", milk";
    }
}
