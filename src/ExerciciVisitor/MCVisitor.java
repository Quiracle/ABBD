package ExerciciVisitor;

public interface MCVisitor {
    void visit(Machine m);
    void visit(MachineComposite mc);

    public int numMachinesOverMin(int minHours){

        return MachineOverMin(minHours, newHashSet<>())
    }

    public int numMachineOverMin(int minHours, set<MachineComponent> visited){

    }

}
