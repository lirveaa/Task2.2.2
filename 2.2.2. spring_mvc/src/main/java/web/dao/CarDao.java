package web.dao;

import web.Model.Car;

import java.util.List;

public interface CarDao {
    List<Car> listCars();
    List<Car> getCar(int count);
}
