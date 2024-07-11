package web.Service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> cars;

    public CarServiceImpl(List<Car> cars) {
        this.cars = cars;
    }

    public CarServiceImpl() {
        cars = new ArrayList<>();
        cars.add(new Car(2012, "BMW", "Black"));
        cars.add(new Car(2013, "Honda", "White"));
        cars.add(new Car(2014, "Toyota", "Orange"));
    }

    @Override
    public List<Car> getCars(Integer count) {
        if (count == null || count >= cars.size()) {
            return cars;
        }
        else {
            return cars.subList(0, count);
        }
    }

}
