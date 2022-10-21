/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.session.CalcbeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Noelia
 */
@WebServlet(name = "CalcServlet", urlPatterns = {"/CalcServlet"})
public class CalcServlet extends HttpServlet {

    @EJB
    private CalcbeanLocal calcbean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcServlet</title>");
            out.println("</head>");
            out.println("<body>");

            String val1 = request.getParameter("val1");
            int v1 = Integer.parseInt(val1);
            String val2 = request.getParameter("val2");
            int v2 = Integer.parseInt(val2);

            String boton = request.getParameter("action");

            if ("SUMAR".equalsIgnoreCase(boton)) {
                out.println("<h1>El resultado de la suma es: " + calcbean.suma(v1, v2) + "</h1>");
            } else if ("RESTAR".equalsIgnoreCase(boton)) {
                out.println("<h1>El resultado de la resta es: " + calcbean.resta(v1, v2) + "</h1>");
            } else if ("MULTIPLICAR".equalsIgnoreCase(boton)) {
                out.println("<h1>El resultado de la multiplicacion es: " + calcbean.multiplicar(v1, v2) + "</h1>");
            } else if ("DIVIDIR".equalsIgnoreCase(boton)) {
                out.println("<h1>El resultado de la dividir es: " + calcbean.dividir(v1, v2) + "</h1>");
            } else if ("MODULO".equalsIgnoreCase(boton)) {
                out.println("<h1>El resultado del modulo es: " + calcbean.modulo(v1, v2) + "</h1>");
            } else if ("ELEVAR AL CUADRADO VAL1".equalsIgnoreCase(boton)) {
                out.println("<h1>El resultado elevar al cuadrado de val1 es: " + calcbean.elevarAlCuadradoVal1(v1) + "</h1>");
            } else if ("ELEVAR AL CUADRADO VAL2".equalsIgnoreCase(boton)) {
                out.println("<h1>El resultado elevar al cuadrado de val2 es: " + calcbean.elevarAlCuadradoVal2(v2) + "</h1>");
            }

            out.println("</body>");
            out.println("</html>");
        }
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
