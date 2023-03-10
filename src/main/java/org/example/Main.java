package org.example;

import java.util.ArrayList;

import static org.example.WritePrizesToFile.writePrizesToFile;


public class Main {
    public static void main(String[] args) {
        ToyShop toyShop = new ToyShop();
        toyShop.addToy(new Toy(1, "Designer", 10, 30));
        toyShop.addToy(new Toy(2, "Table games", 5, 20));
        toyShop.addToy(new Toy(3, "Soft toys", 8, 25));
        toyShop.updateToyWeight(1, 50);


        //выбираем три игрушки для установки их в призы
        ArrayList<Toy> prizes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Toy prize = toyShop.choosePrizeToy();
            if (prize != null) {
                prizes.add(prize);
            }
        }

        writePrizesToFile(prizes, "prizes.txt");
    }
}
