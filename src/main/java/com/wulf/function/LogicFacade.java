package com.wulf.function;
import com.wulf.dbaccess.CarMapper;
import com.wulf.function.entities.Car;

import java.util.ArrayList;
import java.util.List;

public class LogicFacade {
    public static List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        cars = CarMapper.getTopCars();
        return cars;
    }
}
