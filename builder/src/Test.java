import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

class Test {

    public static void main(String[] args) {
        Burger burger = new Burger
                .BurgerBuilder(14)
                .addCheese()
                .addLettuce()
                .addPepperoni()
                .addTomato()
                .build();
    }
}
