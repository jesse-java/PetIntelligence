package com.naldojesse.web.controllers;

import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


abstract class Animals extends HttpServlet {

    abstract protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

    abstract protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
