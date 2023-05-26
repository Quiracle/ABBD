package Recu2021;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ItemsOverPriceVisitor implements PVisitor{
    private final int min;
    private final Set<Product> visited;
    private final List<Item> result;

    public ItemsOverPriceVisitor(int min){
        this.min = min;
        this.visited = new HashSet<>();
        this.result = new ArrayList<>();
    }

    public void visit(Item item){
        if (item.getPrice()>minPrice && visited.add(item)){
            result.add(item);
        }
    }

    public void visit(Pack pack){
        if (visited.add(pack)) {
            var it = pack.getProducts();
            while (it.hasNext()) {
                it.Next().accept(this);
            }
        }
    }

    public List<Item> getResult(){
        return this.result;
    }
}
