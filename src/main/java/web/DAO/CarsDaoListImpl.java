package web.DAO;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarsDaoListImpl implements CarsDaoList {

    private List<Car> cars;

    {
        cars.add(new Car("BMW", "red ", "diesel"));
        cars.add(new Car("Infiniti", "grey", "gas"));
        cars.add(new Car("Jaguar", "green", "diesel"));
        cars.add(new Car("Lexus", "yellow", "gas"));
        cars.add(new Car("Mitsubishi", "orange", "diesel"));
    }

    @Override
    public List<Car> listCars() {
        return cars;
    }
}
