package ExerciciVisitor;

import java.util.List;

// 2n parcial 21/22
public abstract class MachineComponent {
    private List<MachineComposite> components;
    protected boolean broken = false;

    public abstract void accept(MCVisitor visitor);
    public final boolean isBroken() { return broken; }

    public List<> getComponents(){
        return components;
    }
}
