package Activitat3;

public class Money {

    private int value;

    public Money(int value) throws IllegalArgumentException {
        if (value <= 0) throw new IllegalArgumentException();
        this.value = value;
    }

    public Money add(Money m) {
        return new Money(this.value + m.value);
    }
}
