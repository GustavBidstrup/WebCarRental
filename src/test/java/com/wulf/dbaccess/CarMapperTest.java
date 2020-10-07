package com.wulf.dbaccess;

import com.wulf.function.entities.Car;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CarMapperTest {
    CarMapper carMapper;

    @Before
    public void setUp() throws Exception {
        carMapper = new CarMapper();
    }

    @Test
    public void getAllCars() {
        List<Car> allCars = carMapper.getAllCars();
        System.out.println("test");
    }
}