package acs.cts.simplefactory.clase;

public class Troleibuz extends MijlocTransport {
    public Troleibuz(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Troleibuzul are - Numar roti: ").append(super.nrRoti);
        sb.append("Troleibuzul are - Numar inmatriculare: ").append(super.nrInmatriculare);
        System.out.println(sb.toString());
    }
}
