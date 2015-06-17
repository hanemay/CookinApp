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
    private int amountOfResults = 100;
    private Categories cat;
    private String search;
    private boolean healthy = false;
    private boolean under30Minutes = false;
    private boolean bIsRecipePhotoRequired = false;
    private int catId;
    private int maxAmountItems;
    KraftX0020RecipeX0020WebX0020ServiceSoap soapService;
    RecipeSummariesResponse recSumResp;

    /**
     *
     * @param maxAmountItems
     */
    public Recipes(int maxAmountItems){
        this.maxAmountItems = maxAmountItems;
                StartRecipes();

    }
    /**
     *
     * @param cat takes a category to list recipes from that category
     */
    public void Search(Categories cat){
        this.cat = cat;
        StartRecipes();
        for(int i = 0; i < cat.amountOfCategories; i++){
            recSumResp = soapService.getRecipesByCategory(i, 0, null, null, this.bIsRecipePhotoRequired, this.under30Minutes, this.healthy, 1, 1, 0, this.maxAmountItems, true);
        }
    }
    private void StartRecipes(){
        KraftX0020RecipeX0020WebX0020Service webService = new KraftX0020RecipeX0020WebX0020Service();
        this.soapService = webService.getKraftX0020RecipeX0020WebX0020ServiceSoap();
    }

    /**
     *
     * @return
     */
    public  RecipeSummariesResponse results(){
        return recSumResp;
      //  return recSumResp;
    }

    /**
     *
     * @param search If you seek a specific recipe
     */
    public void Search(String search){
        this.search = search;
        recSumResp = soapService.getRecipesByKeywords(search, null, null, null, null, null, this.bIsRecipePhotoRequired, under30Minutes, null, null, 1, 1, 0, maxAmountItems);
        
    }

    /**
     *
     * @param search If you seek a specific recipe
     * @param healthy true for healthy(according to kraft) false for not healthy
     */
    public void Search(String search,boolean healthy){
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
    public void Search(String search,boolean healthy,boolean under30Minutes){
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
    public void Search(Categories cat,boolean healthy){
        this.cat = cat;
        this.healthy = healthy;
        StartRecipes();
        for(int i = 0; i < cat.amountOfCategories; i++){
            recSumResp = soapService.getRecipesByCategory(i, 0, null, null, this.bIsRecipePhotoRequired, this.under30Minutes, this.healthy, 1, 1, 0, this.maxAmountItems, true);
        }
    }
     
    /**
     *
     * @param cat takes a category to list recipes from that category
     * @param healthy true for healthy(according to kraft) false for not healthy
     * @param under30Minutes self explanatory
     */
    public void Search(Categories cat,boolean healthy,boolean under30Minutes){
        this.cat = cat;
        this.healthy = healthy;
        this.under30Minutes = under30Minutes;
        for(int i = 0; i < cat.amountOfCategories; i++){
            recSumResp = soapService.getRecipesByCategory(i, 0, null, null, this.bIsRecipePhotoRequired, this.under30Minutes, this.healthy, 1, 1, 0, this.maxAmountItems, true);
        }
        StartRecipes();
    }    

    /**
     *
     * @return
     */
    public String tmp(){
        System.out.println(recSumResp.recipeSummaries.recipeSummary.get(0).recipeName);
        return "";
    }

    /**
     *
     * @return
     */
    public int getAmountOfResults() {
        return amountOfResults;
    }

    /**
     *
     * @param amountOfResults
     */
    public void setAmountOfResults(int amountOfResults) {
        this.amountOfResults = amountOfResults;
    }

    /**
     *
     * @return
     */
    public Categories getCat() {
        return cat;
    }

    /**
     *
     * @param cat
     */
    public void setCat(Categories cat) {
        this.cat = cat;
    }

    /**
     *
     * @return
     */
    public String getSearch() {
        return search;
    }

    /**
     *
     * @param search
     */
    public void setSearch(String search) {
        this.search = search;
    }

    /**
     *
     * @return
     */
    public boolean isHealthy() {
        return healthy;
    }

    /**
     *
     * @param healthy
     */
    public void setHealthy(boolean healthy) {
        this.healthy = healthy;
    }

    /**
     *
     * @return
     */
    public boolean isUnder30Minutes() {
        return under30Minutes;
    }

    /**
     *
     * @param under30Minutes
     */
    public void setUnder30Minutes(boolean under30Minutes) {
        this.under30Minutes = under30Minutes;
    }

    /**
     *
     * @return if photo is required or not
     */
    public boolean isbIsRecipePhotoRequired() {
        return bIsRecipePhotoRequired;
    }

    /**
     *
     * @param bIsRecipePhotoRequired
     */
    public void setbIsRecipePhotoRequired(boolean bIsRecipePhotoRequired) {
        this.bIsRecipePhotoRequired = bIsRecipePhotoRequired;
    }

    /**
     *
     * @return category id
     */
    public int getCatId() {
        return catId;
    }

    /**
     *
     * @param catId
     */
    public void setCatId(int catId) {
        this.catId = catId;
    }

    /**
     *
     * @return maxAmountItems
     */
    public int getMaxAmountItems() {
        return maxAmountItems;
    }

    /**
     *
     * @param maxAmountItems
     */
    public void setMaxAmountItems(int maxAmountItems) {
        this.maxAmountItems = maxAmountItems;
    }
}
