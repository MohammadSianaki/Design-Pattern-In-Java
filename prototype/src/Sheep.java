public class Sheep implements Cloneable {
    private String name;

    public Sheep(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        return new Sheep(name);
    }

}
