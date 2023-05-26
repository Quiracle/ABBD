package ExerciciVisitor;

import java.util.HashSet;
import java.util.Set;

public class NumMachinesOverMinVisitor implements MCVisitor{
    private final int minHours;
    private final Set<MachineComponent> visited;
    private int result;

    public NumMachinesOverMinVisitor (int minHours){
        this.minHours = minHours;
        this.visited = new HashSet<>();
        this.result = 0;
    }
    public void visit(Machine m){
        if (visited.add(m) && m.getHours() > this.minHours) result +=1;
    }

    public void visit(MachineComposite mc){
        if (!visited.add(mc)) return;
        for(var subcomp : mc.getComponents()){
            subcomp.accept(this);
        }
    }

    public int getResult() {
        return this.result;
    }
}
