package ro.ase.cts.clase.spital;

public class Medicament {
    private String nume;
    private float pret;

    public void achizitioneazaMedicament() {
        if(this.prezintaReteta()) {
            System.out.println("Medicament " + this.nume + " a fost achizitionat la pretul de " + this.pret + " RON");
        } else {
            System.out.println("!! NU A PREZENTAT RETETA !!");
        }
    }

    public String getNume() {
        return nume;
    }

    public Medicament(String nume, float pret) {
        this.pret = pret;
        this.nume = nume;
    }

    public boolean prezintaReteta() {
        return this.nume.length() >= 10;
    }
}
