package web.service;

import web.model.Car;

import java.util.List;

/**
 * @author Gaziz Bakyt
 */

public interface CarService {

    List<Car> allCars();

    List<Car> someCars(int n);

}
