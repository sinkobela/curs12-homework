package extramile;

import java.util.List;

public class CarMain {
    public static void main(String[] args) {
        CarShop carShop = new CarShop(List.of(
                new Car("Mercedes", 3, 50000, 30000),
                new Car("Mercedes", 4, 55000, 25000),
                new Car("Audi", 1, 30000, 40000),
                new Car("Opel", 8, 300000, 7000),
                new Car("Dacia", 18, 500000, 500),
                new Car("Dacia", 15, 450000, 500),
                new Car("Dacia", 11, 322000, 600),
                new Car("Ferrari", 4, 1000, 1000000)));

        System.out.println(carShop.mapNamesToNumbers());

        System.out.println("\n");
        System.out.println(carShop.mapNamesToKilometers());

    }
}
