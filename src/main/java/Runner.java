import products.Product;
import vehicles.*;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Runner {

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle(10, 20, new Product(350, 5, "BMX"));

        System.out.println(bicycle.getWheelCount());
        System.out.println(bicycle.getPrice());
        System.out.println(bicycle.getTitle());

        Car car = new Car(200, 120, new Product(10000, 3, "2015 Dacia Duster"), new Engine(100, 150));
        car.startEngine();
        Engine betterEngine = new Engine(300, 400);
        car.setEngine(betterEngine);
        System.out.println(car.getHp());

        Speedboat speedboat = new Speedboat(500, 70, new Product(3500, 3, "Queen of the Sea"), new Motor(100, 100));
        System.out.println(speedboat.getMaxSpeed());
        System.out.println(speedboat.getPrice());

        Kayak kayak = new Kayak(250, 5, new Product(100, 10, "SpongeBob"));
        System.out.println(kayak.getTitle());
        System.out.println(kayak.getPrice());

    }

}
