package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.Service.CarServiceImpl;

@Controller
@RequestMapping("/car")
public class CarsController {

    private CarServiceImpl carService;

    @Autowired
    public CarsController(CarServiceImpl carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String getCars(Model model) {
        model.addAttribute("car", carService.listCars());
        return "cars";
    }

    @GetMapping(value = "/car_size")
    public String carSize(Model model) {
        model.addAttribute("cars_size", carService.carSize());
        return "cars_size";
    }
}
