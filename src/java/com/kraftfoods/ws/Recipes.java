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
public class Recipes {
    int amountOfResults;
    Categories cat;
    String search;
    boolean healthy;
    boolean under30Minutes;

    /**
     *
     * @param cat takes a category to list recipes from that category
     */
    public Recipes(Categories cat){
        this.cat = cat;
        
    }

    /**
     *
     * @param search If you seek a specific recipe
     */
    public Recipes(String search){
        this.search = search;
    }

    /**
     *
     * @param search If you seek a specific recipe
     * @param healthy true for healthy(according to kraft) false for not healthy
     */
    public Recipes(String search,boolean healthy){
        this.search = search;
        this.healthy = healthy;
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
    }
    /**
     * 
     * @param cat takes a category to list recipes from that category
     * @param healthy true for healthy(according to kraft) false for not healthy
     */
    public Recipes(Categories cat,boolean healthy){
        this.cat = cat;
        this.healthy = healthy;
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
    }    
}
