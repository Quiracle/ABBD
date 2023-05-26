package ExerciciVisitor;

public class MachineComposite extends MachineComponent{
    public void accept(MCVisitor v){
        v.visit(this);
    }

}
