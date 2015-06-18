/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kraftfoods.ws;

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
public class CategoriesTest {
    
    /**
     *
     */
    public CategoriesTest() {
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
     * Test of returnCats method, of class Categories.
     */
    @Test
    public void testReturnCats() {
        System.out.println("returnCats");
        Categories instance = new Categories();
        String[] result = new String[1];
        String[] expResult = new String[1]; 
        expResult[0] = "Appetizers/Snacks";
        String[] results = instance.returnCats();
        result[0] = results[0]; 
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of getAmountOfCategories method, of class Categories.
     */
    @Test
    public void testGetAmountOfCategories() {
        System.out.println("getAmountOfCategories");
        Categories instance = new Categories();
        int expResult = 12;
        instance.setAmountOfCategories(12);
        int result = instance.getAmountOfCategories();
        assertEquals(expResult, result);
 
    }

    /**
     * Test of setAmountOfCategories method, of class Categories.
     */
    @Test
    public void testSetAmountOfCategories() {
        System.out.println("setAmountOfCategories");
        int amountOfCategories =12;
        Categories instance = new Categories();
        instance.setAmountOfCategories(amountOfCategories);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
