package ExerciciVisitor;

public class Machine extends MachineComponent{
    private int hours;

    @Override
    public void accept(MCVisitor v) {
        v.visit(this);
    }

    public int getHours(){
        return this.hours;
    }
}
