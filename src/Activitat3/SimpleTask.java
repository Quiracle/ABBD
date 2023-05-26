package Activitat3;

public class SimpleTask extends Task {

    public SimpleTask(int cost) {
        super(cost);
    }

    public void changeCost(int newCost){
        if (newCost <= 0) throw new IllegalArgumentException();
        if (this.cost == newCost) return;
        int oldCost = this.cost;
        this.cost = newCost;
        setChanged();
        notifyObservers(new CostChanged(oldCost, newCost));
    }
}
