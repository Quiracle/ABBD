package Recu2021;

import java.util.List;

public class Pack implements Product{
    private List<Product> productList;
    public void accept(PVisitor v){
        v.visit(this);
    }
}
