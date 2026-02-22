package src.ro.ase.cts.main;

import src.ro.ase.cts.animals.FoodType;
import src.ro.ase.cts.animals.Lion;
import src.ro.ase.cts.animals.Zebra;
import src.ro.ase.cts.zoo.Zoo;
import src.ro.ase.cts.zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo Baneasa", new ZooKeeper("Ionescu"));
        zoo.addAnimal(new Lion("Leon", 5, FoodType.MEAT, 65));
        zoo.addAnimal(new Zebra("Zeta", 4, FoodType.GRASS, 150));

        zoo.feedAllAnimals();
    }
}