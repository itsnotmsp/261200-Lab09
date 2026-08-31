package oop.ocp;

public class Circle extends Shape{
    private double radius;
    private static final double PI=3.14;
    private static final double DEFAULT_RADIUS = 1.0;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if(radius > 0.0)
            this.radius = radius;
        else
            this.radius = DEFAULT_RADIUS;
    }
    public Circle(){
        this(DEFAULT_RADIUS);
    }
    public Circle(double radius){
        this.setRadius(radius);
    }
    @Override
    public double getArea(){
        return this.radius * this.radius * this.PI;
    }
}
