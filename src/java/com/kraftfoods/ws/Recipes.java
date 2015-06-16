/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kraftfoods.ws;

/**
 *
 *  
 * @author hanemay
 */
public class Recipes extends RecipeSummariesResponse {
    int amountOfResults;
    Categories cat;
    String search;
    boolean healthy;
    boolean under30Minutes;
    int catId;
    KraftX0020RecipeX0020WebX0020ServiceSoap soapService;
    RecipeSummariesResponse recSumResp;
    /**
     *
     * @param cat takes a category to list recipes from that category
     */
    public Recipes(Categories cat){
        this.cat = cat;
        StartRecipes();
        for(int i = 0; i < cat.amountOfCategories; i++){
            recSumResp = soapService.getRecipesByCategory(i, 0, null, null, false, false, false, 1, 1, 0, 1000, true);
        }
    }
    private void StartRecipes(){
        KraftX0020RecipeX0020WebX0020Service webService = new KraftX0020RecipeX0020WebX0020Service();
        this.soapService = webService.getKraftX0020RecipeX0020WebX0020ServiceSoap();
    }
    public RecipeSummariesResponse results(){
        return recSumResp;
      //  return recSumResp;
    }

    /**
     *
     * @param search If you seek a specific recipe
     */
    public Recipes(String search){
        this.search = search;
        StartRecipes();
    }

    /**
     *
     * @param search If you seek a specific recipe
     * @param healthy true for healthy(according to kraft) false for not healthy
     */
    public Recipes(String search,boolean healthy){
        this.search = search;
        this.healthy = healthy;
        StartRecipes();
    }

    /**
     * 
     * @param search If you seek a specific recipe
     * @param healthy true for healthy(according to kraft) false for not healthy
     * @param under30Minutes self explanatory 
     */
    public Recipes(String search,boolean healthy,boolean under30Minutes){
        this.search = search;
        this.healthy = healthy;
        this.under30Minutes = under30Minutes;
        StartRecipes();
    }
    /**
     * 
     * @param cat takes a category to list recipes from that category
     * @param healthy true for healthy(according to kraft) false for not healthy
     */
    public Recipes(Categories cat,boolean healthy){
        this.cat = cat;
        this.healthy = healthy;
        StartRecipes();
        for(int i = 0; i < cat.amountOfCategories; i++){
            recSumResp = soapService.getRecipesByCategory(i, 0, null, null, false, false, this.healthy, 1, 1, 0, 1000, true);
        }
    }
     
    /**
     *
     * @param cat takes a category to list recipes from that category
     * @param healthy true for healthy(according to kraft) false for not healthy
     * @param under30Minutes self explanatory
     */
    public Recipes(Categories cat,boolean healthy,boolean under30Minutes){
        this.cat = cat;
        this.healthy = healthy;
        this.under30Minutes = under30Minutes;
        for(int i = 0; i < cat.amountOfCategories; i++){
            recSumResp = soapService.getRecipesByCategory(i, 0, null, null, false, this.under30Minutes, this.healthy, 1, 1, 0, 1000, true);
        }
        StartRecipes();
    }    
}
