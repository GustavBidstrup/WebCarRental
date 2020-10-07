package com.wulf.function;

import com.wulf.function.entities.Car;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.wulf.function.LogicFacade;

@WebServlet("/index.jsp")
public class Cars extends HttpServlet {
    @Resource(name = "jdbc/carrental")
    private DataSource dataSource;

    /*
    public void doinit() throws ServletException {
        try {
            alleBiler = LogicFacade.getAllCars();
        } catch (Exception e) {
            System.out.println("ERROR");
            e.printStackTrace();
            //throw new ServletException();
        }
    }

     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // lav data:
        String title = "KurtVerner";
        Car myCar = new Car(12,"Volvo","V70",4,123,34,45,1200,1999,123);
        Car myCar2 = new Car(12,"BMC","V704",4,123,34,45,1200,1999,123);
        List<Car> biler = new ArrayList<>();
        List<Car> alleBiler = new ArrayList<>();
        try {
            Connection con = dataSource.getConnection();
            alleBiler = LogicFacade.getAllCars(con);

        } catch (Exception e) {
            e.printStackTrace();
        }
        /*
        try {
            Connection con = dataSource.getConnection();
            String SQL = "SELECT * FROM cars order by Horsepower desc LIMIT 5";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            //(Make,Model,Cylinders,Horsepower,MPG_City,MPG_Highway,Weight,Wheelbase,BuildYear,Milage)
            //(int id, String make, String model, int cyl, int HK, int MPG_City, int MPG_Heighway, int wheelbase, int year, int milage)
            while(rs.next()) {
                String make = rs.getString("Make");
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
                Car car = new Car(id, make, model, cyl, hk, MPG_City, MPG_Highway, length, year, milage);
                alleBiler.add(car);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //alleBiler = LogicFacade.getAllCars();
        biler.add(myCar);
        //for (Car car: nyebiler ) {
        //   System.out.println(car.toStringBasic());
        //}
        // set på req-objektet
        req.setAttribute("billiste",biler);
        /*
        if (alleBiler == null) {
            alleBiler.add(myCar2);
            this.doinit();
        }

         */
        req.setAttribute("allebiler",alleBiler);

        req.setAttribute("navn",title);
        // hent dispatcher og send til jsp
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
