package com.naldojesse.web.controllers;

//import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.naldojesse.web.models.Cat;

@WebServlet("/animals/cat")
public class Cats extends Animals {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Cat d = new Cat(request.getParameter("name"), request.getParameter("breed"), Double.parseDouble(request.getParameter("weight")));
//        System.out.println(d.getName());
//        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }
}
