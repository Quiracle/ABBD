package Recu2021;

import java.util.Set;

public class PriceModifierVisitor implements PVisitor{
    private final float factor;

    public PriceModifierVisitor(float factor){
        if (factor <= 0 || factor >= 1) throw new IllegalArgumentException("factor not in range (0,1)");
        this.factor = factor;
    }

    @Override
    public void visit(Item item) {
        item.setPrice(item.getPrice()*(1.0f-factor));
    }

    @Override
    public void visit(Pack pack) {
        var it = pack.getProducts();
        while (it.hasNext()){
            it.next().accept(this);
        }
    }
}
