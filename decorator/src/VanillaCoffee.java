class VanillaCoffee implements Coffee {

    private Coffee coffee;

    public VanillaCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double getCost() {
        return this.coffee.getCost() + 7;
    }

    @Override
    public String getDescription() {
        return this.coffee.getDescription() + ", vanilla";
    }
}
