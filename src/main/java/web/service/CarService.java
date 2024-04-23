package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarService {

    final CarDaoImp carDaoImp;

    @Autowired
    public CarService(CarDaoImp carDaoImp) {
        this.carDaoImp = carDaoImp;
    }

    public List<Car> getCars(int count) {
        if (count < 5) {
            return carDaoImp.getCars()
                    .stream()
                    .limit(count)
                    .collect(Collectors.toList());
        } else {
            return carDaoImp.getCars();
        }
    }
}
