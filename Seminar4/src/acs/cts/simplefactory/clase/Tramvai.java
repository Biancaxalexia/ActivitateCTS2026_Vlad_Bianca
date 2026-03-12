package acs.cts.simplefactory.clase;

public class Tramvai extends MijlocTransport {
    public Tramvai(int nrRoti, String nrInmatriculare) {
        super(nrRoti, nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tramvaiul are - Numar roti: ").append(super.nrRoti);
        sb.append("Tramvaiul are - Numar inmatriculare: ").append(super.nrInmatriculare);
        System.out.println(sb.toString());
    }
}
