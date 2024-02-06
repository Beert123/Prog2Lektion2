package Opgave01.model;

public class Rektangel extends Firkant implements Reziable {
    public Rektangel(double xpos, double ypos, double højde, double bredde) {
        super(xpos, ypos, højde, bredde);
    }
    public double areal(){
        double areal = 0;
        areal = this.getHøjde() * 2;
        return areal;
    }

    @Override
    public void doubleUp() {
        setHøjde(2*this.getHøjde());
        setBredde(2*this.getBredde());
    }

    @Override
    public void halve() {
        setHøjde(this.getHøjde()*0.5);
        setBredde(this.getBredde()*0.5);

    }

}
