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
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import com.wulf.function.LogicFacade;

@WebServlet("/index.jsp")
public class Cars extends HttpServlet {
    @Resource(name = "jdbc/carrental")
    private DataSource dataSource;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // lav data:
        String title = "KurtVerner";
        List<Car> alleBiler = new ArrayList<>();
        try {
            Connection con = dataSource.getConnection();
            alleBiler = LogicFacade.getAllCars(con);

        } catch (Exception e) {
            e.printStackTrace();
        }
        req.setAttribute("allebiler",alleBiler);

        req.setAttribute("navn",title);
        // hent dispatcher og send til jsp
        req.getRequestDispatcher("/WEB-INF/index.jsp").forward(req,resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req,resp);
    }
}
