package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarsDaoListImpl;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarsDaoListImpl carsDaoList;

    @Autowired
    public CarServiceImpl(CarsDaoListImpl carsDaoList) {
        this.carsDaoList = carsDaoList;
    }

    @Override
    public List<Car> listCars() {
        return carsDaoList.listCars();
    }

    @Override
    public List<Car> listCars(int count) {
        List<Car> cars = carsDaoList.listCars();
        if (count >= cars.size()) {
            return cars;
        } else {
            return cars.subList(0, count);
        }
    }

    @Override
    public int carSize() {
        return carsDaoList.listCars().size();
    }
}
