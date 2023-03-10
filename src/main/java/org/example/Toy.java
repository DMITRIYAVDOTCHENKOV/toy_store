package org.example;

public class Toy {
    int toyId;
    String name;
    int quantity;
    double weight;
    /**
     * Класс игрушка с четырмя свойствами
     * @param toyId дентификатор ID
     * @param name название игрушки
     * @param quantity кол-во
     * @param weight вес
     */
    public Toy(int toyId, String name, int quantity, double weight) {
        this.toyId = toyId;
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
    }

    public int getToyId() {
        return toyId;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

