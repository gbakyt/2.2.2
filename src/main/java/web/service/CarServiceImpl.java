package web.service;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gaziz Bakyt
 */
@Component
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> allCars() {
        List<Car> listOfCars = new ArrayList<>();
        listOfCars.add(new Car(1, "Camry", "75"));
        listOfCars.add(new Car(2, "Camry", "45"));
        listOfCars.add(new Car(3, "Camry", "55"));
        listOfCars.add(new Car(4, "Camry", "60"));
        listOfCars.add(new Car(5, "Camry", "35"));
        return listOfCars;
    }

    @Override
    public List<Car> someCars(int n) {
        List<Car> listOfCars = new ArrayList<>();
        listOfCars.add(new Car(1, "Camry", "75"));
        listOfCars.add(new Car(2, "Camry", "45"));
        listOfCars.add(new Car(3, "Camry", "55"));
        listOfCars.add(new Car(4, "Camry", "60"));
        listOfCars.add(new Car(5, "Camry", "35"));
        if (n <= listOfCars.size()) {
            return listOfCars.subList(0, n);
        } else {
            return listOfCars;
        }
    }
}
