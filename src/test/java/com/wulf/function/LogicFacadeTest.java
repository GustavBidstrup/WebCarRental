package com.wulf.function;

import com.wulf.function.entities.Car;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import static org.junit.Assert.*;

public class LogicFacadeTest {

    @Test
    public void getAllCars() {
        List<Car> cars = new ArrayList<>();
        cars = LogicFacade.getAllCars();
        System.out.println("test");
    }
}