import oop.ocp.AreaCalculator;

import oop.ocp.Circle;
import oop.ocp.Rectangle;

void main () {
    System.out.println(AreaCalculator.calculateArea(new Rectangle(2,3)));
    System.out.println(AreaCalculator.calculateArea(new Circle(3)));
    System.out.println(AreaCalculator.calculateArea(new Ellispe(4,5)));
}


