package main;

import clase.Medic;
import clase.Pacient;
import clase.ReceptieSpital;
import clase.Salon;

public class Main {
    public static void main(String[] args){
        Pacient pacient1 = new Pacient("Gigel", 5);
        Medic medic1 = new Medic();
        Salon salon1 = new Salon();

        if(medic1.areTrimitere(pacient1)) {
            int patLiber = salon1.getPatLiber();
            if(patLiber != -1) {
                System.out.println("Pacientul " + pacient1.getNume() + " va fi internat in patul " + patLiber);
                salon1.ocupaPat(patLiber);
            }
        }

        Pacient pacient2 = new Pacient("Mihai", 7);
        Pacient pacient3 = new Pacient("George", 8);
        Pacient pacient4 = new Pacient("Dan", 5);

        ReceptieSpital receptieSpital1 = new ReceptieSpital(medic1, salon1);
        receptieSpital1.interneazaPacient(pacient2);
        receptieSpital1.interneazaPacient(pacient3);
        receptieSpital1.interneazaPacient(pacient4);
    }
}
