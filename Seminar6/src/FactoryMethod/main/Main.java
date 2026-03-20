package FactoryMethod.main;

import FactoryMethod.clase.FelMancare;
import FactoryMethod.enums.TipDesert;
import FactoryMethod.enums.TipSupa;
import FactoryMethod.fabrici.FabricaDesert;
import FactoryMethod.fabrici.FabricaSupa;

public class Main {
    public static void main(String[] args) {
        FabricaDesert fabricaDesert = new FabricaDesert();
        FabricaSupa fabricaSupa = new FabricaSupa();

        FelMancare supaCiuperci = fabricaSupa.getFelMancare(TipSupa.CIUPERCI, 15.5f, 300.0f);
        FelMancare supaLegume = fabricaSupa.getFelMancare(TipSupa.LEGUME, 20.0f, 350.0f);

        FelMancare clatite = fabricaDesert.getFelMancare(TipDesert.CLATITE, 20.0f, 350.0f, 500);
        FelMancare papanasi = fabricaDesert.getFelMancare(TipDesert.PAPANASI, 35.0f, 200.0f, 300);

        supaCiuperci.afisare();
        supaLegume.afisare();

        clatite.afisare();
        papanasi.afisare();
    }
}
