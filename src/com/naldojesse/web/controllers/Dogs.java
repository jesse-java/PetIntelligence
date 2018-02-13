package com.naldojesse.web.controllers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.naldojesse.web.models.Dog;

@WebServlet("/animals/dog")
public class Dogs extends Animals {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Dog d = new Dog(request.getParameter("name"), request.getParameter("breed"), Double.parseDouble(request.getParameter("weight")));

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Dog d = new Dog(request.getParameter("name"), request.getParameter("breed"), Double.parseDouble(request.getParameter("weight")));
//        response.setContentType("text/html");
//        PrintWriter pwriter = response.getWriter();
        String name=request.getParameter("name");
        String breed=request.getParameter("breed");
        Double weight=Double.parseDouble(request.getParameter("weight"));
        System.out.println(name);
        System.out.println(breed);
        System.out.println(weight);



        request.getRequestDispatcher("/WEB-INF/dog.jsp").forward(request,response);


    }
}


