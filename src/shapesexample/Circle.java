/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapesexample;

/**
 * Circle class
 * @author Tyler
 */
public class Circle {
    
    private int radius; //radius of the circle.
    
    /**
     * Default Constructor
     */
    public Circle(){
        radius = 5;
    }
    
    /**
     * Constructor that accepts one integer as a variable
     * @param rad 
     */
    public Circle(int radius){
        /**
         * this.radius refers to the class variable length. radius refers to the
         * variable passed into the constructor. They can be called the same thing,
         * but must be differentiated using the "this" modifier in that case.
         */
        this.radius = radius;
    }
    
    /**
     * Sets the radius of the circle to a new value.
     * @param radius 
     */
    public void setRadius(int radius){
        this.radius = radius;
    }
    
    /**
     * Returns the radius of the circle.
     * @return 
     */
    public int getRadius(){
        return this.radius;
    }
}
