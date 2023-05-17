package Activitat3;

public record CostChanged(int oldCost, int newCost) {
    public int difference(){
        return newCost - oldCost;
    }
}
