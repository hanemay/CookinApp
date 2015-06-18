/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kraftfoods.ws;

/**
 *
 * @author hanemay
 */
public class Categories extends GetRecipeCategoryResponse{
    GetRecipeCategoryResponse recResp;
    int amountOfCategories;

    /**
     *
     */
    public Categories(){
        KraftX0020RecipeX0020WebX0020Service webService = new KraftX0020RecipeX0020WebX0020Service();
        KraftX0020RecipeX0020WebX0020ServiceSoap soapService = webService.getKraftX0020RecipeX0020WebX0020ServiceSoap();
        recResp =  soapService.getRecipeCategories(1, 1);
    }

    /**
     *
     * @return
     */
    public int getAmountOfCategories() {
        return amountOfCategories;
    }

    /**
     *
     * @param amountOfCategories
     */
    public void setAmountOfCategories(int amountOfCategories) {
        this.amountOfCategories = amountOfCategories;
    }

    /**
     *
     * @return
     */
    public String[] returnCats(){
        amountOfCategories = recResp.totalCount;
        String[] results = new String[amountOfCategories];
        for(int i = 0; i<amountOfCategories; i++){
            results[i] = recResp.getRecipeCategories().getRecipeCategory().get(i).categoryName;
            System.out.println(recResp.getRecipeCategories().getRecipeCategory().get(i).categoryName);
        }
        return results;
    }
}
