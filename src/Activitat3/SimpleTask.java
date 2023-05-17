package Activitat3;

public class SimpleTask extends Task {

    public SimpleTask(int cost) {
        super(cost);
    }

    public void changeCost(int newCost){
        if (newCost <= 0) throw new IllegalArgumentException();
        this.cost = newCost;
        int difference = new CostChanged(this.cost, newCost).difference();
        setChanged();
        notifyObservers();
    }
}
