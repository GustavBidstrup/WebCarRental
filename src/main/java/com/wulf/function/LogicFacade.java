package com.wulf.function;
import com.wulf.dbaccess.CarMapper;
import com.wulf.function.entities.Car;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class LogicFacade {
    public static List<Car> getAllCars(Connection con) {
        List<Car> cars = new ArrayList<>();
        cars = CarMapper.getTopCars(con);
        return cars;
    }
}
