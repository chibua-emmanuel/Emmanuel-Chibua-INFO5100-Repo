/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatternassignment;

/**
 *
 * @author emmanuelchibua
 */
// Facade Pattern
public class Facade {
    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;

    public Facade(Subsystem1 subsystem1, Subsystem2 subsystem2) {
        this.subsystem1 = subsystem1;
        this.subsystem2 = subsystem2;
    }

    public void operation() {
        subsystem1.operation1();
        subsystem2.operation2();
    }

    private static class Subsystem1 {

        public Subsystem1() {
        }

        private void operation1() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }

    private static class Subsystem2 {

        public Subsystem2() {
        }

        private void operation2() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
