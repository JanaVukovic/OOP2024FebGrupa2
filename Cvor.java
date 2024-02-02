public class Cvor<T>{
    private T vrednost;
    Cvor<T> sledeci = null, prethodni = null;

    public Cvor(T vrednost) {
        this.vrednost = vrednost;
    }

    public T getVrednost() {
        return vrednost;
    }

    public Cvor<T> getSledeci() {
        return sledeci;
    }

    public Cvor<T> getPrethodni() {
        return prethodni;
    }

    public void setSledeci(Cvor<T> sledeci) {
        this.sledeci = sledeci;
    }

    public void setPrethodni(Cvor<T> prethodni) {
        this.prethodni = prethodni;
    }
}
