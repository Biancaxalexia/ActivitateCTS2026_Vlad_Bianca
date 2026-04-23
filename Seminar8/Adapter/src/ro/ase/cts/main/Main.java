package ro.ase.cts.main;

import ro.ase.cts.adapter.Adapter;
import ro.ase.cts.clase.spital.Medicament;

public class Main {
    public static void procurareMedicament(ro.ase.cts.clase.farmacie.Medicament medFarmacie) {
        medFarmacie.cumparaMedicament();
    }

    public static void main(String[] args){
        Medicament medSpital = new Medicament("Paracetamol", 25.43f);
        ro.ase.cts.clase.farmacie.Medicament medFarmacie = new ro.ase.cts.clase.farmacie.Medicament("Furazolidon");

        medSpital.achizitioneazaMedicament();
        medFarmacie.cumparaMedicament();

        procurareMedicament(medFarmacie);
        //procurareMedicament(medSpital);

        Adapter adapterMedicament = new Adapter(medSpital);
        procurareMedicament(adapterMedicament);
    }
}
