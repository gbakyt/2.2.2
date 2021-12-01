package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Gaziz Bakyt
 */
@Service
public class CarServiceImpl implements CarService {

    static List<Car> createList() {
        List<Car> listOfCars = new ArrayList<>();
        listOfCars.add(new Car(1, "Camry", "75"));
        listOfCars.add(new Car(2, "Camry", "45"));
        listOfCars.add(new Car(3, "Camry", "55"));
        listOfCars.add(new Car(4, "Camry", "60"));
        listOfCars.add(new Car(5, "Camry", "35"));
        return listOfCars;
    }

    @Override
    public List<Car> allCars() {
        return createList();
    }

    @Override
    public List<Car> someCars(int n) {
        List<Car> listOfCars = createList();
        if (n <= listOfCars.size()) {
            return listOfCars.subList(0, n);
        } else {
            return listOfCars;
        }
    }
}
