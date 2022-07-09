/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.relegados.javaback.Servlet;

import com.relegados.javaback.api.ApiRequest;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fedrico Damaso Diaz Ramseyer
 */
public class ApiReservas extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            ApiRequest api = new ApiRequest();
            String responseJson = api.selectFrom("categories");
            
            PrintWriter out = response.getWriter();
            response.setContentType("application/json");
            response.setCharacterEncoding("UTF-8");
            out.print(responseJson);
            out.flush();
            //processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ApiReservas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
