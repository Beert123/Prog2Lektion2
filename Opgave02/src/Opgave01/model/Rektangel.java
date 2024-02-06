package Opgave01.model;

public class Rektangel extends Firkant {
    public Rektangel(double xpos, double ypos, double højde, double bredde) {
        super(xpos, ypos, højde, bredde);
    }
    public double areal(){
        double areal = 0;
        areal = this.getBredde() * this.getHøjde();
        return areal;
    }
}
