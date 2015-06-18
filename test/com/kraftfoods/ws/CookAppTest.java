/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kraftfoods.ws;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hanemay
 */
public class CookAppTest {
    
    /**
     *
     */
    public CookAppTest() {
    }
    
    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of processRequest method, of class CookApp.
     */
  

    /**
     * Test of getServletInfo method, of class CookApp.
     */
    @Test
    public void testGetServletInfo() {
        GetRecipeCategories recipeCats = new GetRecipeCategories();
        recipeCats.setIBrandID(1);
        recipeCats.setILangID(1);
        KraftX0020RecipeX0020WebX0020Service webService = new KraftX0020RecipeX0020WebX0020Service();
        KraftX0020RecipeX0020WebX0020ServiceSoap soapService = webService.getKraftX0020RecipeX0020WebX0020ServiceSoap();
        GetRecipeCategoryResponse recResp =                 soapService.getRecipeCategories(1, 1);
        int getCount = 0;
              // recResp.recipeCategories.getRecipeCategory().get(0).categoryName;
        ArrayOfRecipeClassification tests = new ArrayOfRecipeClassification();
                   while(recResp.getTotalCount()!=getCount){
                int currentCatId = recResp.recipeCategories.getRecipeCategory().get(getCount).categoryID;
                GetRecipeSubCategoryResponse getSubs = soapService.getRecipeSubCategories(currentCatId);
                System.out.println(currentCatId);
                       
                System.out.print("<p>"+recResp.recipeCategories.getRecipeCategory().get(getCount).categoryName+ " " +
                recResp.recipeCategories.getRecipeCategory().get(getCount).getSubCategoryID()+"</p>");
                System.out.println("COUNT" + getSubs.getTotalCount());
                ArrayOfRecipeCategory ar = getSubs.getRecipeSubCategories();
                System.out.println(recResp.getRecipeCategories());
     
//recResp.getRecipeCategories().recipeCategory.
                //out.println("    [RECIPE TITLE ] :  " + summaryResponse.title);
                getCount ++;
            }
      //String[] ks = new String[rc.size()];
        System.out.println("LENGTH OF ARRAY "                );// ft.recipeCategories.getRecipeCategory().get(0).categoryName);
       // System.out.println(rc.isEmpty());
        assertEquals(1, 1);
        // TODO review the generated test code and remove the default call to fail.
        
    }
    
}
