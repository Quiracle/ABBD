package Activitat3;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public abstract class CompositeTask extends Task implements Observer {
    protected List<Task> tasks;

    public CompositeTask() {
        this.tasks = new ArrayList<>();
    }


    public void addTask(Task task) {
        tasks.add(task);
        task.addObserver(this);
        setChanged();
        notifyObservers();
    }

    @Override
    public Money costInEuros() {
        Money m = new Money(0);

        for(Task t : tasks)
            m = m.add(t.costInEuros());

        return m;
    }

    @Override
    public void update(Observable observable, Object o) {
        setChanged();
        notifyObservers();
    }
}
