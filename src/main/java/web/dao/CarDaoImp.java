package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Component
public class CarDaoImp {

    private final List<Car> cars = Arrays.asList(
            new Car("LADA", "black", 2010), new Car("BMW", "white", 2003),
            new Car("GAZ", "grey", 1990), new Car("SHKODA", "blue", 1999),
            new Car("NISAN", "green", 2018));

    public List<Car> getCars() {
        return cars;
    }
}
