package Recu2021;

public class Item implements Product{
    public void accept (PVisitor v){
        v.visit(this);
    }
}
