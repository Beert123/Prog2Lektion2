package Opgave01.model;

import java.util.ArrayList;

public class Firkant extends Figur {
    private double højde;
    private double bredde;

    private ArrayList<Firkant> firkanter;

    public Firkant(double xpos, double ypos, double højde, double bredde) {
        super(xpos, ypos);
        this.højde = højde;
        this.bredde = bredde;
    }
    public double getHøjde() {
        return højde;
    }

    public double getBredde() {
        return bredde;
    }
}
