package Composite.main;

import Composite.clase.Departament;
import Composite.clase.Sectie;
import Composite.clase.Structura;

public class Program {
    public static void main(String[] args){
        Structura depSpital= new Departament("Spital");
        Structura depAdministrativ = new Departament("Administrativ");
        Structura sectieSecretariat = new Sectie("Secretariat",20);
        Structura sectieManagement = new Sectie("Management",30);

        ((Departament) depSpital).adaugaStructura(depAdministrativ);
        ((Departament) depSpital).adaugaStructura(sectieManagement);
        ((Departament) depAdministrativ).adaugaStructura(sectieSecretariat);

        depSpital.afiseazaDetaliiStructura("");

        ((Departament) depSpital).stergeStructura((sectieManagement));
        ((Departament) depAdministrativ).adaugaStructura(sectieManagement);
        depSpital.afiseazaDetaliiStructura("");
    }
}
