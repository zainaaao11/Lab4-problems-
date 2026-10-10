package problem6;

import java.lang.Math;
public class Circle extends Forme {
    private double radius;
    public Circle(double radius){ this.radius= radius; }
    //getters & setters
    public double getRadius(){ return this.radius; }
    public void setRadius(double radius){ this.radius=radius; }
    public double getSurface(){
        return Math.PI*Math.pow(this.radius, 2);
    }
    @Override
    public String toString(){
        return String.format("Circle (radius %.1f cm)", this.radius);
    }
}
