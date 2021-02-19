package web.service;

import org.springframework.stereotype.Service;
import web.Model.Car;
import web.dao.CarDao;
import web.service.CarService;

import java.util.List;

@Service
public class CarServiceImpl  implements CarService {

    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    private CarDao carDao;


    @Override
    public List<Car> listCars() {
        return carDao.listCars();
    }

    @Override
    public List<Car> getCar(int count) {
        return carDao.getCar(count);
    }
}
