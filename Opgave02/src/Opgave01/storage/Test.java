package Opgave01.storage;

import Opgave01.model.Cirkel;
import Opgave01.model.Ellipse;

public class Test {
    public static void main(String[] args) {
        Cirkel cirkel = new Cirkel(10,10,5);
        System.out.println(cirkel.areal());
        System.out.println(cirkel.getRadius());

      //  Ellipse ellipse = new Ellipse(10,10,10,4);
      //  System.out.println(ellipse.areal());

        cirkel.doubleUp();
        System.out.println(cirkel.areal());
        System.out.println(cirkel.getRadius());

    }
    public static Storage innitStorage(){
        Storage storage = new Storage();
        return storage;
    }
}
