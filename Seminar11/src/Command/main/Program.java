package Command.main;

import Command.clase.Autobuz;
import Command.clase.Command;
import Command.clase.Operator;
import Command.clase.Plecare;

public class Program {
    static void main(String[] args){
        Operator operator = new Operator();
        Command comanda1 = new Plecare(new Autobuz("Mercedes"),223);
        Command comanda2 = new Plecare(new Autobuz("Audi"),178);

        operator.adaugaComanda(comanda1);
        operator.adaugaComanda(comanda2);
        operator.adaugaComanda(new Plecare(new Autobuz("Dacia"),123));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
