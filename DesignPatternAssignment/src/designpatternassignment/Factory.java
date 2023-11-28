/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternassignment;

/**
 *
 * @author emmanuelchibua
 */
// Factory Pattern
public class Factory {
    public Product createProduct(String type) {
        if ("Product1".equals(type)) {
            return new Product1();
        } else if ("Product2".equals(type)) {
            return new Product2();
        }
        return null;
    }

    private static class Product {

        public Product() {
        }
    }

    private static class Product1 extends Product {

        public Product1() {
        }
    }

    private static class Product2 extends Product {

        public Product2() {
        }
    }
}
