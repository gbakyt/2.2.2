package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;

/**
 * @author Gaziz Bakyt
 */
@Controller
public class CarController {


    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> resultList;
        if (count == null) {
            resultList = carService.allCars();
        } else {
            resultList = carService.someCars(count);
        }
        model.addAttribute("resultList", resultList);
        return "cars";
    }
}
