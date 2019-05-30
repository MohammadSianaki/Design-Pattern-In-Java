class WildDogAdapter implements Lion {

    private WildDog dog;

    public WildDogAdapter(WildDog dog) {
        this.dog = dog;
    }

    @Override
    public void roar() {
        this.dog.bark();
    }
}
