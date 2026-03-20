package FactoryMethod.clase;

public class SupaLegume extends Supa{
    public SupaLegume(float gramaj, float pret) {
        super(gramaj, pret);
    }

    @Override
    public void afisare() {
        StringBuilder sb = new StringBuilder();
        sb.append("Supa de legume are").append(super.toString());
        System.out.println(sb);
    }
}
