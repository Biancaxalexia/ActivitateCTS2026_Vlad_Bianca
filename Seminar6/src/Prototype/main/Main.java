package Prototype.main;

import Prototype.clase.Rezervare;
import Prototype.clase.RezervareAbstracta;

public class Main {
    public static void main(String[] args) {
        RezervareAbstracta rez1 = new Rezervare("Ana", 20, 13, "0762946271");
        RezervareAbstracta rez2 = (Rezervare) rez1.clone();

        ((Rezervare)rez2).setOraRezervare(10);
        ((Rezervare)rez2).setZiuaRezervarii(10);

        System.out.println(rez1.toString());
        System.out.println(rez2.toString());
    }
}
