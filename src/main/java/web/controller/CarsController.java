package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        if (count != null) {
            model.addAttribute("car", carService.listCars(count));
        } else {
            model.addAttribute("car", carService.listCars());
        }
        return "cars";
    }

    @GetMapping(value = "/car_size")
    public String carSize(Model model) {
        model.addAttribute("cars_size", carService.carSize());
        return "cars_size";
    }
}
