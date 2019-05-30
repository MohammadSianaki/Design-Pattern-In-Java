class Burger {
    private int size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean lettuce;
    private boolean tomato;

    private Burger(BurgerBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.lettuce = builder.lettuce;
        this.tomato = builder.tomato;
    }

    public static class BurgerBuilder {
        private int size;
        private boolean cheese;
        private boolean pepperoni;
        private boolean lettuce;
        private boolean tomato;

        public BurgerBuilder(int size) {
            this.size = size;
        }

        public BurgerBuilder addPepperoni() {
            this.pepperoni = true;
            return this;
        }

        public BurgerBuilder addLettuce() {
            this.lettuce = true;
            return this;
        }

        public BurgerBuilder addCheese() {
            this.cheese = true;
            return this;
        }

        public BurgerBuilder addTomato() {
            this.tomato = true;
            return this;
        }

        public Burger build() {
            return new Burger(this);
        }
    }

    public int getSize() {
        return size;
    }

    public boolean isCheese() {
        return cheese;
    }

    public boolean isPepperoni() {
        return pepperoni;
    }

    public boolean isLettuce() {
        return lettuce;
    }

    public boolean isTomato() {
        return tomato;
    }
}
