package Activitat3;

public class SimpleTask extends Task {

    private Money cost;

    public SimpleTask(Money cost) {
        this.cost = cost;
    }

    @Override
    public Money costInEuros() {
        return cost;
    }

    public void changeCost(Money newCost){
        this.cost = newCost;
        setChanged();
        notifyObservers();
    }
}
