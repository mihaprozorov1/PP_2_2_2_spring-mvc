package web.Service;

import web.model.Car;

import java.util.List;

public interface CarService {

    public List<Car> listCars();

    public List<Car> listCars(int count);

    public int carSize();
}
