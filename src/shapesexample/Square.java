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
public class Square {
    /**
     * Class variables are normally private so that anybody using the class
     * can't just mess with the variables. They always have to use setters.
     */
    
    private int length; //length of one side of the square.
    private int area;   //area of the square.
    private int perimeter; //perimeter of the square.
    
    /**
     * Default constructor of the square class.
     */
    public Square(){
        length = 5;
        area = length * length;
        perimeter = length * 4;
    }
    
    public Square(int len){
        /**
         * Note that I did not use the "this" modifier. That's because I called
         * the class variable and the variable passed into the constructor something
         * different. This also works. I prefer the other way.
         */
        length = len;
        setArea(len);
        setPerimeter(len);
    }
    
    /**
     * Sets the length variable.
     * @param len 
     */
    public void setLength(int len){
        length = len;
        
        /**
         * You can call other methods inside of methods to help you with basic tasks,
         * like changing a variable that relies on another variable.
         */
        setArea(length);
        setPerimeter(length);
    }
    
    /**
     * Set area
     * @param len 
     */
    private void setArea(int len){
        area = len * len; 
    }
    
    /**
     * Set perimeter
     */
    private void setPerimeter(int len){
        perimeter = len * 4;
    }
    
    public int getLength(){
        return length;
    }
    
    public int getArea(){
        return area;
    }
    
    public int getPerimeter(){
        return perimeter;
    }
}
