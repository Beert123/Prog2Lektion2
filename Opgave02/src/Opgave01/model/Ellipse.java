package Opgave01.model;

public class Ellipse extends Figur {
    private double aRadius;
    private double bRadius;

    public Ellipse(double xpos, double ypos, double aRadius, double bRadius) {
        super(xpos, ypos);
        this.aRadius = aRadius;
        this.bRadius = bRadius;
    }
    public double areal(){
        double areal = 0;
        areal = Math.PI * aRadius * bRadius;
        return areal;
    }
}

