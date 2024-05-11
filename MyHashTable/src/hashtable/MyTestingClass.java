package hashtable;

public class MyTestingClass {
    private int value1;
    private int value2;

    public MyTestingClass(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    @Override
    public int hashCode() {
        final int prime = 41;
        int hash = 1;
        hash = prime * hash + value1;
        hash = prime * hash + value2;
        return hash;
    }
}
