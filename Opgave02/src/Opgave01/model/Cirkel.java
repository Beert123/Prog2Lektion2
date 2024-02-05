package Opgave01.model;

public class Cirkel extends Rund{
    private double radius;

    public Cirkel(double areal, double xpos, double ypos, double radius) {
        super(areal, xpos, ypos);
        this.radius = radius;
    }
}
