package com.wulf.function;
import com.wulf.dbaccess.CarMapper;
import com.wulf.function.entities.Car;
import com.wulf.function.entities.CarComparator;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public class LogicFacade {

    public static List<Car> getTopCars(Connection con) {
        List<Car> cars = new ArrayList<>();
        cars = CarMapper.getTopCars(con);
        return cars;
    }

    public static ArrayList<Car> getEcoCars(Connection con) {
        ArrayList<Car> ecoCars = new ArrayList<>();
        int max = CarMapper.getMaxMPG(con);
        System.out.println("test " + max);
        List<Car> cars = CarMapper.getAllCars(con);
        cars.sort(new CarComparator());
        for(int i=cars.size()-1;i>cars.size()-7;i--) {
            ecoCars.add(cars.get(i));
        }
        return ecoCars;
    }
}
