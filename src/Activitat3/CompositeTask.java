package Activitat3;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public abstract class CompositeTask extends Task implements Observer {
    protected List<Task> tasks;

    public CompositeTask() {
        super(0);
        this.tasks = new ArrayList<>();
    }


    public void addTask(Task task) {
        tasks.add(task);
        task.addObserver(this);
        int oldCost = this.cost;
        this.cost += task.costInEuros();
        setChanged();
        notifyObservers(new CostChanged(oldCost, this.cost));
    }

    @Override
    public void update(Observable observable, Object o) {
        CostChanged change = (CostChanged) o;
        int oldCost = this.cost;
        this.cost += change.newCost() - change.oldCost();
        setChanged();
        notifyObservers(new CostChanged(oldCost, this.cost));
    }
}
