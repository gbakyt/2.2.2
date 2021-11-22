package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarServiceImpl;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Gaziz Bakyt
 */
@Controller
public class CarController {


    List<Car> resultList;

    @GetMapping(value = "/cars")
    public String printCar(@RequestParam(value = "count", required = false) Integer count, Model model) {
        try {
            resultList = new CarServiceImpl().someCars(count);
            model.addAttribute("resultList", resultList);
            return "cars";

        } catch (Exception ex) {
            System.out.println("Everything is good, dont worry!");
        }
        resultList = new CarServiceImpl().someCars(5);
        model.addAttribute("resultList",resultList);
        return "cars";
    }
}
