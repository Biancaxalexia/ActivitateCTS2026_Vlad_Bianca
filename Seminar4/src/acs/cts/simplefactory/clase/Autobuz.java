package acs.cts.simplefactory.clase;

public class Autobuz extends MijlocTransport {
    public Autobuz(int nrRoti, String nrInmatriculare) {
        super(nrRoti,nrInmatriculare);
    }

    @Override
    public void afiseazaDescriere(){
        StringBuilder sb = new StringBuilder();
        sb.append("Autobuzul are - Numar roti: ").append(super.nrRoti);
        sb.append("Autobuzul are - Numar inmatriculare: ").append(super.nrInmatriculare);
        System.out.println(sb.toString());
    }
}
