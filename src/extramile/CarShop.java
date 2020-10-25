package extramile;

import java.util.*;

public class CarShop {
    private final List<Car> carList;

    public CarShop(List<Car> carList) {
        this.carList = carList;
    }

    public Map<String, Integer> mapNamesToNumbers() {
        Map<String, Integer> result = new HashMap<>();
        List<String> carNameList = new ArrayList<>();

        for (Car car : carList) {
            carNameList.add(car.getName());
            result.put(car.getName(), Collections.frequency(carNameList, car.getName()));
        }
        return result;
    }

    public Map<String, Integer> mapNamesToKilometers() {
        Map<String, Integer> result = new HashMap<>();

        for (Car car : carList) {
            result.put(car.getName(), car.getKm());
        }
        return result;
    }

    public List<Car> getCarList() {
        return carList;
    }
}


