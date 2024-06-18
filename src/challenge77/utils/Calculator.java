package challenge77.utils;

import challenge77.geometry.Circle;
import challenge77.geometry.Rectangle;

public class Calculator {

    public static void main(String[] args) {

        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10, 5);

        double cirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rect.breadth * rect.length;

//        System.out.println("Area of the circle is: %s, Area of the Rectangle is %s",cirArea, rectArea);
    }

}
