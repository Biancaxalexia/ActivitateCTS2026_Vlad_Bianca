package ro.ase.cts.adapter;

import ro.ase.cts.clase.farmacie.Medicament;

public class Adapter extends Medicament{
    private ro.ase.cts.clase.spital.Medicament medicament;

    public Adapter(String nume) {
        super(nume);
    }

    public Adapter(ro.ase.cts.clase.spital.Medicament medicament) {
        super(medicament.getNume());
        this.medicament = medicament;
    }

    @Override
    public void cumparaMedicament() {
        this.medicament.achizitioneazaMedicament();
    }
}
