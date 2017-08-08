/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesexample;

/**
 *
 * @author Tyler
 */
public class ShapesExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c1 = new Circle();
        Circle c2 = new Circle(10);
        
        Square s1 = new Square();
        Square s2 = new Square(30);
        
        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());
        
        System.out.println(s1.getLength());
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        
        System.out.println(s2.getLength());
        System.out.println(s2.getArea());
        System.out.println(s2.getPerimeter());
        
        s1.setLength(40);
        
        System.out.println(s1.getLength());
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        
    }
    
}
