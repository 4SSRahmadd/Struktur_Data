package Keg1;

public class Segitiga<T> {
    private T alas;
    private T tinggi;

    public Segitiga(T alas, T tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public int getResultAsInt(){
        return ((Integer)alas*(Integer)tinggi/2);
    }

    public double getResultAsDouble(){
        return ((Double)alas*(Double)tinggi/2);
    }
}