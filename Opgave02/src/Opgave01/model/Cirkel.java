package Opgave01.model;

public class Cirkel extends Figur implements Reziable{
    private double radius;

    public Cirkel(double xpos, double ypos, double radius) {
        super(xpos, ypos);
        this.radius = radius;
    }
    public double areal(){
        double areal = 0;
        areal = Math.PI * Math.pow(this.getRadius(),2);

        return areal;
    }
    public double getRadius() {
        return radius;
    }

    @Override
    public void doubleUp() {
        radius = radius * 2;
    }

    @Override
    public void halve() {

    }
}
