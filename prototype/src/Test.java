class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep original = new Sheep("Jolly");
        System.out.println(original.getName());


        Sheep cloned = original.clone();
        cloned.setName("Dolly");
        System.out.println(cloned.getName());
    }
}
