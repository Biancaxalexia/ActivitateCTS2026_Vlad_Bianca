package Flyweigh.main;

import Flyweigh.clase.Autobuz;
import Flyweigh.clase.ManagerLinie;

public class Main {
    public static void main(String[] args){
        Autobuz autobuz101=new Autobuz("Mercedes", 1999, 50);
        Autobuz autobuz102=new Autobuz("Lada", 1989, 40);

        ManagerLinie manager=new ManagerLinie();
        manager.getLinie("Romana", "Universitate", 102).numarMaximPasageriPeLinie(autobuz102);
        manager.getLinie("Pipera", "Berceni", 101).descriereLinie(autobuz101);
    }
}
