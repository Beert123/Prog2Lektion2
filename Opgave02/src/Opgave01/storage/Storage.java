package Opgave01.storage;

import Opgave01.model.Firkant;
import Opgave01.model.Rund;

import java.util.ArrayList;

public class Storage {
    public static ArrayList<Firkant> firkanter = new ArrayList<>();
    public static ArrayList<Rund> runde = new ArrayList<>();

    public static void addFirkant(Firkant firkant){
        firkanter.add(firkant);
    }
    public static void addRund(Rund rund){
        runde.add(rund);
    }

}
