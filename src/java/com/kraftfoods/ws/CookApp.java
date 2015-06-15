/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kraftfoods.ws;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hanemay
 */
@WebServlet(name = "CookApp", urlPatterns = {"/CookApp"})
public class CookApp extends HttpServlet {

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
        GetRecipeCategories k = new GetRecipeCategories();
        k.setIBrandID(1);
        k.setILangID(1);
        KraftX0020RecipeX0020WebX0020Service kk = new KraftX0020RecipeX0020WebX0020Service();
        KraftX0020RecipeX0020WebX0020ServiceSoap kkk = kk.getKraftX0020RecipeX0020WebX0020ServiceSoap();
        GetRecipeCategoryResponse ft =                 kkk.getRecipeCategories(1, 1);
        int getCount = 0;
              // ft.recipeCategories.getRecipeCategory().get(0).categoryName;
        ArrayOfRecipeClassification tests = new ArrayOfRecipeClassification();
         GetRecipeCategoriesResponse ff = new GetRecipeCategoriesResponse();
       // rc = tests.recipeClassification;
         
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>" );
            out.println("<title>Servlet CookApp</title>" );            
            out.println("</head>");
            out.println("<body>");
            out.print("[CATEGORIES]");
            while(ft.getTotalCount()!=getCount){

                out.print("<p>"+ft.recipeCategories.getRecipeCategory().get(getCount).categoryName+ " " +
                ft.recipeCategories.getRecipeCategory().get(getCount).subCategoryName+"</p>");
                //out.println("    [RECIPE TITLE ] :  " + summaryResponse.title);
                getCount ++;
            }
            
            out.println("<h1>Servlet CookApp at " + request.getContextPath() + "</h1>");
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
