package com.mycompany.oop221;
/**
 *
 * @author supan
 */
class Box {
    double height;
    double width;
    
    public Box(double height, double width){
        this.height = height;
        this.width = width;
    }
    
    public void display(){
        System.out.println("Box Height: "+height+"\nBox Width: "+width);
    }
}

public class BoxInfo{
     public static void main(String[] args) {
         Box box = new Box(4, 8);
         
         box.display();
     }
}
