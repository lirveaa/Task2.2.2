package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;
import web.dao.CarDao;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller

public class CarController {

    public CarController(CarService carService) {
        this.carService = carService;
    }
    CarService carService;

    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count",required = false)int count, Model model){
        model.addAttribute("cars",carService.getCar(count));
        return  "cars";
    }

}
