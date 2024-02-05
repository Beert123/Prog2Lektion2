package Opgave01.model;

public class Firkant extends Figur {
    private double højde;
    private double bredde;

    public Firkant(double areal, double xpos, double ypos, double højde, double bredde) {
        super(areal, xpos, ypos);
        this.højde = højde;
        this.bredde = bredde;
    }
}
