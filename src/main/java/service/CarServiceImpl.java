package service;

//import dao.CarDao;
//import dao.CarDaoImpl;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Gaziz Bakyt
 */
public class CarServiceImpl implements CarService {

    @Autowired
    private List<Car> listOfCars = new LinkedList<>();

    @Override
    public List<Car> someCars(int n) {
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
