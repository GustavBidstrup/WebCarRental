package com.wulf.dbaccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.wulf.function.entities.Car;

import javax.annotation.Resource;
import javax.sql.DataSource;

public class CarMapper {
    @Resource(name = "jdbc/carrental")
    private static DataSource dataSource;

    public static int getMaxMPG(Connection con) {
        int retVal = 0;

        try {
            String SQL = "SELECT max(MPG_City) FROM cars";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            rs.next();
            retVal = rs.getInt(1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return retVal;
    }

        public static List<Car> getAllCars(Connection con) {
        List<Car> cars = new ArrayList<>();
        try {
            String SQL = "SELECT * FROM cars order by make";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            //(Make,Model,Cylinders,Horsepower,MPG_City,MPG_Highway,Weight,Wheelbase,BuildYear,Milage)
            //(int id, String make, String model, int cyl, int HK, int MPG_City, int MPG_Heighway, int wheelbase, int year, int milage)
            while(rs.next()) {
                String make  = rs.getString("Make");
                String model = rs.getString("Model");
                int cyl = rs.getInt("Cylinders");
                int hk = rs.getInt("Horsepower");
                int MPG_City = rs.getInt("MPG_City");
                int MPG_Highway = rs.getInt("MPG_Highway");
                int weight = rs.getInt("Weight");
                int length = rs.getInt("Wheelbase");
                int year = rs.getInt("BuildYear");
                int milage = rs.getInt("Milage");
                int id = rs.getInt("id");
                Car car = new Car(id,make,model,cyl,hk,MPG_City,MPG_Highway,length,year,milage);
                cars.add(car);
            }
        } catch(SQLException ex) {
            String methodName = "getOrders";
        }
        return cars;
    }
    public static List<Car> getTopCars(Connection con) {
        List<Car> topCars = new ArrayList<>();
        try {
            String SQL = "SELECT * FROM cars order by Horsepower desc LIMIT 5";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            //(Make,Model,Cylinders,Horsepower,MPG_City,MPG_Highway,Weight,Wheelbase,BuildYear,Milage)
            //(int id, String make, String model, int cyl, int HK, int MPG_City, int MPG_Heighway, int wheelbase, int year, int milage)
            while(rs.next()) {
                String make  = rs.getString("Make");
                String model = rs.getString("Model");
                int cyl = rs.getInt("Cylinders");
                int hk = rs.getInt("Horsepower");
                int MPG_City = rs.getInt("MPG_City");
                int MPG_Highway = rs.getInt("MPG_Highway");
                int weight = rs.getInt("Weight");
                int length = rs.getInt("Wheelbase");
                int year = rs.getInt("BuildYear");
                int milage = rs.getInt("Milage");
                int id = rs.getInt("id");
                Car car = new Car(id,make,model,cyl,hk,MPG_City,MPG_Highway,length,year,milage);
                topCars.add(car);
            }
        } catch(SQLException ex) {
            String methodName = "getOrders";
        }
        return topCars;
    }
}
