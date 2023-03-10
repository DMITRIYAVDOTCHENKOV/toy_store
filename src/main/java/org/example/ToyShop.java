package org.example;

import java.util.ArrayList;
import java.util.Random;

/**
 * представляет как магазин игрушек
 */
public class ToyShop {

    private final ArrayList<Toy> toys;

    /**
     * магазин, со списком игрушек
     */
    public ToyShop() {
        this.toys = new ArrayList<Toy>();
    }
    /**
     * Добавляем игрушку
     *
     */
    public void addToy(Toy toy) {
        toys.add(toy);
    }

    /**
     * обновляем вес
     *
     */
    public void updateToyWeight(int toyId, double newWeight) {
        for (Toy toy : toys) {
            if (toy.getToyId() == toyId) {
                toy.setWeight(newWeight);
                break;
            }
        }
    }

    /**
     * выбираем случайную игрушку
     *
     */
    public Toy choosePrizeToy() {
        Random random = new Random();
        double totalWeight = 0;
        for (Toy toy : toys) {
            totalWeight += toy.getWeight();
        }
        double randomNumber = random.nextDouble() * totalWeight;
        double weightSum = 0;
        for (Toy toy : toys) {
            weightSum += toy.getWeight();
            if (weightSum >= randomNumber) {
                toy.setQuantity(toy.getQuantity() - 1);
                toys.remove(toy);
                return toy;
            }
        }
        return null;
    }
}

