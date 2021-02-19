package web.dao;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import web.Model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

     List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "Chevrolet", 2012));
        cars.add(new Car(2, "Toyota", 2020));
        cars.add(new Car(3, "Honda", 2016));
        cars.add(new Car(4, "Mazda", 2018));
        cars.add(new Car(5, "BMW", 2011));
    }

    @Override
    public List<Car> listCars() {
        return cars;
    }

    @Override
    public List<Car> getCar(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }


}
