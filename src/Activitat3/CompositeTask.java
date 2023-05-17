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
        setChanged();
        notifyObservers();
    }

    @Override
    public void update(Observable observable, Object o) {
        int m = 0;

        for(Task t : tasks)
            m += t.costInEuros();

        this.cost = m;
        setChanged();
        notifyObservers();
    }
}
