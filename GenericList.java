public class GenericList<T>{
    private Cvor<T> pocetak = null;

    public GenericList(){
        pocetak = null;
    }
    public GenericList(Cvor<T> pocetak) {
        this.pocetak = pocetak;
    }
    public void dodaj(Cvor<T> kraj){
        if(pocetak == null){
            pocetak = kraj;
            return;
        }
        Cvor<T> a = pocetak;
        while(a.getSledeci() != null){
            a = a.getSledeci();
        }
        a.setSledeci(kraj);
    }
    public int cout(T info){
        Cvor<T> a = pocetak;
        int i = 0;
        while(a != null){
            if(a.getVrednost().equals(info))i++;
            a = a.getSledeci();
        }
        return i;
    }
    public int length(){
        int i = 0;
        Cvor<T> a = pocetak;
        while(a != null){
            i++;
            a =a.getSledeci();
        }
        return i;
    }
    public void ukloni(){
        if(this.length() == 0){
            throw new IndexOutOfBoundsException("Neee");
        }
        if(this.length() == 1){
            this.pocetak = null;
            return;
        }
        Cvor<T> a = pocetak;
        if(this.length() == 2){
            this.pocetak.setSledeci(null);
            return;
        }
        while(a.getSledeci().getSledeci() != null){
            a = a.getSledeci();
        }
        a.setSledeci(null);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[ ");
        Cvor<T> a = pocetak;
        while(a != null){
            sb.append(a.getVrednost()).append(", ");
            a = a.getSledeci();
        }
        sb.append(" ]");
        return String.valueOf(sb);
    }
}
