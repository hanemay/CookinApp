/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kraftfoods.ws;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
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
        response.setContentType("text/html");
        Categories recResp = new Categories();
        int getCount = 0;
              // recResp.recipeCategories.getRecipeCategory().get(0).categoryName;
        ArrayOfRecipeClassification tests = new ArrayOfRecipeClassification();
         GetRecipeCategoriesResponse ff = new GetRecipeCategoriesResponse();
       // rc = tests.recipeClassification;
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>" );
            out.println("<LINK href=\"C:/Users/hanemay/Documents/NetBeansProjects/CookingApp/web/style.css\" rel=\"stylesheet\" type=\"text/css\">");

            //out.println("<title>Servlet CookApp</title>" );
            out.println("<div id=\"header\">\n" +
"<h1>Kraft Recipes</h1>\n" +
"</div>");
            out.println("</head>");
            out.println("<body>");
                              Enumeration<String> infomaterials= request.getParameterNames();
while(infomaterials.hasMoreElements()) {
   System.out.println(infomaterials.nextElement()); 
}
                
            int amount = 100;
            String[] test = recResp.returnCats();
            try{
                amount = Integer.parseInt(request.getParameter("Question3"));
            }catch(Exception e){
            
            }
            Recipes reccResp = new Recipes(amount);        

            try{
                if(request.getParameter("isHealthy").equalsIgnoreCase("healthy"))
                    reccResp.setHealthy(true);
                }catch(Exception e){}
                try{
                if(request.getParameter("isFastFood").equalsIgnoreCase("Fast food"))
                    reccResp.setUnder30Minutes(true);
                }catch(Exception e){}
                try{
                if(request.getParameter("reqPic").equalsIgnoreCase("Pictures required"))
                    reccResp.setbIsRecipePhotoRequired(true);
                }catch(Exception e){}
                    reccResp.setbIsRecipePhotoRequired(true);
            while(recResp.amountOfCategories != getCount){
                //int currentCatId = recResp.recipeCategories.getRecipeCategory().get(getCount).categoryID;
     

                       
                
                   reccResp.Search(recResp,recResp.recResp.getRecipeCategories().getRecipeCategory().get(getCount).categoryID);
                 RecipeSummariesResponse  recSumResp = reccResp.results();
                   for(int recNames = 0; recNames < reccResp.getMaxAmountItems(); recNames++) {
                       String url = recSumResp.getRecipeSummaries().getRecipeSummary().get(recNames).photoURL;
                       if(recNames == 0){
                                      out.println("<div id=\"header\">\n" +
"<h2>"+test[getCount]+"</h2>\n" +
"</div>");}
                       if(recNames % 2==0)
                           out.println("<div \"row\">\n" +
"<div id=\"sectionl\">\n" +
"<img src=\""+url+"\" style=\"height:254px;width:254px\">\n" +
"<p>\n" +
"<p>Number of ingrediens needed for this recipe :<p> "+reccResp.recSumResp.getRecipeSummaries().getRecipeSummary().get(recNames).getNumberOfIngredients()+"</p>\n" +
"</p>");
                       else{
                           out.println("</div>\n" +
"<div id=\"sectionr\">\n" +
"<img src=\""+url+"\" style=\"height:254px;width:254px\">\n" +
"<p>\n" +
"<p>Number of ingrediens needed for this recipe :<p> "+reccResp.recSumResp.getRecipeSummaries().getRecipeSummary().get(recNames).getNumberOfIngredients()+"</p>\n" +
"</p>\n" +
"</div>\n" +
"<div>");}
                                              

                       //out.println("[RECIPE]" +  recSumResp.getRecipeSummaries().getRecipeSummary().get(recNames).recipeName+"");
                       //out.println("<img src="+recSumResp.getRecipeSummaries().getRecipeSummary().get(recNames).photoURL + ">");
                      // out.println("<p>Number of ingrediens needed for this recipe : "+reccResp.recSumResp.getRecipeSummaries().getRecipeSummary().get(recNames).getNumberOfIngredients()+"</p>");
                       
                       /*RecipeDetailResponse rec = soapService.getRecipeByRecipeID(recSumResp.getRecipeSummaries().getRecipeSummary().get(recNames).getRecipeID(), true, 1, 1);
                       for(int ingredientCounter = 0; ingredientCounter < Integer.parseInt(recSumResp.getRecipeSummaries().getRecipeSummary().get(recNames).getNumberOfIngredients()) -1 ; ingredientCounter++ ){
                       out.print("<p>[INGREDIENT]: " + rec.recipeDetail.ingredientDetails.getIngredientDetail().get(ingredientCounter).ingredientName + " amount : "+ rec.recipeDetail.ingredientDetails.getIngredientDetail().get(ingredientCounter).quantityNum+"</p>");
                       }*/
                   }         
                getCount ++;
            }
            
            out.println("</body>");
            out.println(" <style>\n" +
"#header {\n" +
"    background-color:green;\n" +
"    color:white;\n" +
"    text-align:center;\n" +
"    padding:5px;\n" +
"}\n" +
"#nav {\n" +
"    line-height:30px;\n" +
"    background-color:#eeeeee;\n" +
"    \n" +
"    width:100px;\n" +
"    float:left;\n" +
"    padding:5px;\n" +
"}\n" +
"#row {\n" +
"    display:inline-block;\n" +
"}\n" +
"#sectionl {\n" +
"    width:250px;\n" +
"    float:left;\n" +
"    padding:10px;\n" +
"}\n" +
"#sectionr {\n" +
"    width:250px;\n" +
"    float:right;\n" +
"    padding:10px;\n" +
"}\n" +
"\n" +
"#footer {\n" +
"    background-color:green;\n" +
"    color:white;\n" +
"    clear:both;\n" +
"    text-align:center;\n" +
"    padding:5px;\n" +
"}\n" +
"</style> ");
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
       
                  Enumeration<String> infomaterials= request.getParameterNames();
while(infomaterials.hasMoreElements()) {
   System.out.println(infomaterials.nextElement()); 
}
           
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
