package oop.ocp;

public class Rectangle extends Shape {
    private double width;
    private double height;
    private static final double DEFAULT_WIDTH = 1.0;
    private static final double DEFAULT_HEIGHT =1.0;
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height > 0.0)
            this.height = height;
        else
            this.height = DEFAULT_WIDTH;
    }

    public void setWidth(double width) {
       if(width > 0.0)
           this.width = width;
       else
           this.width = DEFAULT_WIDTH;
    }

    public Rectangle(){
        this(DEFAULT_WIDTH, DEFAULT_HEIGHT);
    }

    public Rectangle(double width, double height){
        this.setHeight(height);
        this.setWidth(width);
    }

    @Override
    public double getArea() {
        return this.width * this.height;
    }

}
