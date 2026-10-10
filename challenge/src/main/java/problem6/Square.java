package problem6;

public class Square extends Forme {
    private double side;
    public Square(double side){ this.side =side ; }
    //getters & setters first
    public double getSide(){ return this.side;}
    public void setSide(double side){ this.side= side; }
    public double getSurface(){
        return Math.pow(this.side, 2);
    }
    @Override
    public String toString(){
        return String.format("Square (side %.1f cm)", this.side);

    }
}
