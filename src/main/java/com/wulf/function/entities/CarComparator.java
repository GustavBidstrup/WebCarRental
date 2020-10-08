package com.wulf.function.entities;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
        return o1.getMPG_City()-o2.getMPG_City();
    }
}
