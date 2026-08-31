import oop.ocp.Shape;

public class Ellispe extends Shape {
    private double majorAxis;
    private double minorAxis;
    private static final double PI=3.14;
    private static final double DEFAULT_majorAxis = 1.0;
    private static final double DEFAULT_minorAxis = 1.0;
    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
       if(majorAxis>0.0)
           this.majorAxis = majorAxis;
       else
           this.majorAxis = DEFAULT_majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        if(minorAxis>0.0)
            this.minorAxis=minorAxis;
        else
            this.minorAxis=DEFAULT_minorAxis;
    }

    public Ellispe(){
        this(DEFAULT_majorAxis,DEFAULT_minorAxis);
    }
    public Ellispe(double majorAxis,double minorAxis){
        this.setMajorAxis(majorAxis);
        this.setMinorAxis(minorAxis);
    }

    @Override
    public double getArea(){
        return this.minorAxis * this.majorAxis * this.PI;
    }
}
