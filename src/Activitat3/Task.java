package Activitat3;

import java.util.Observable;
import java.util.Observer;

public class Task extends Observable {
    protected int cost;

    protected Task(int cost) throws IllegalArgumentException{
        if (cost <= 0) throw new IllegalArgumentException();
        this.cost = cost;
    }

    public int costInEuros() {
        return this.cost;
    }

    public record CostChanged(int oldCost, int newCost) {
    }
}