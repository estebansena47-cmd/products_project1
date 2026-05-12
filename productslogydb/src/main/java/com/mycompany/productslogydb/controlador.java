package com.mycompany.productslogydb;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.annotation.WebServlet;
import firstpack.HiberCrud;
import java.io.PrintWriter;

/**
 *
 * @author ONE
 */
@WebServlet(name = "controlador", urlPatterns = {"/controlador"})

public class controlador extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

         String info= request.getParameter("yuser");
         String clave= request.getParameter("ycontra");

         System.out.println("Usuario recibido: " + info);
   System.out.println("Clave recibida: " + clave);
         HiberCrud crud= new HiberCrud();
        boolean validado= crud.ValidarDatos(info, clave);
            
               response.setContentType("application/json");
              PrintWriter out= response.getWriter();
              if(validado){
                  out.print("{\"mensaje\":\"Login Exitoso\"}");
              } else{
                  response.setStatus(401);
                  out.print("{\"mensaje\":\"Error: Datos Incorrectos V3\"}");
              }
              out.flush();
              return;
         //request.setAttribute("mensajeParaJSP", info);
         //request.setAttribute("claveParaJSP", clave);
         //request.getRequestDispatcher("resultado.jsp").forward(request, response);   

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
