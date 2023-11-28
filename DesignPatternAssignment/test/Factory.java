/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author emmanuelchibua
 */
public class Factory {
    
    public Factory() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testFactory() {
        Factory factory = new Factory();
        Product product1 = factory.createProduct("Product1");
        assertTrue(product1 instanceof Product1);
        Product product2 = factory.createProduct("Product2");
        assertTrue(product2 instanceof Product2);
        Product product3 = factory.createProduct("Product3");
        assertNull(product3);
    }

    private Product createProduct(String product2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static class Product {

        public Product() {
        }
    }
}
