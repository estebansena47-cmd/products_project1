/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.mycompany.productslogydb;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author ONE
 */
public class registrador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

         String nombre= request.getParameter("nombreAp");
         String numero= request.getParameter("numeroT");
         String correo= request.getParameter("correoE");
         String userReg= request.getParameter("usuarioReg");
         String claveReg= request.getParameter("contraseñaReg");
         String claveAdm= request.getParameter("contraseñaJefe");
         
         request.setAttribute("nombreParaJSP", nombre);
         request.setAttribute("numeroParaJSP", numero);
         request.setAttribute("correoParaJSP", correo);
         request.setAttribute("userRegParaJSP", userReg);
         request.setAttribute("claveRegParaJSP", claveReg);
         request.setAttribute("claveAdmParaJSP", claveAdm);
         request.getRequestDispatcher("recibido.jsp").forward(request, response);
        }
    
    }
