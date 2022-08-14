package Enums;

public enum Measures {
    MINI(1), NORMAL(2), BIG(3);

    public int getNumericSize() {
        return numericSize;
    }

    private int numericSize;
    private Measures(int numericSize) {
        this.numericSize = numericSize;
    }

}
