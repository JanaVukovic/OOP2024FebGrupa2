import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Knjizara {
    List<Knjiga> mojaLista = new LinkedList<>();

    public Knjizara() {
    }
    public void dodaj(Knjiga k){
        this.mojaLista.add(k);
    }
    public Knjizara(List<Knjiga> mojaLista) {
        this.mojaLista = mojaLista;
    }

    public List<Knjiga> getMojaLista() {
        return mojaLista;
    }

    public String ispisiKomentare(int indeks) throws Exception{
        try{
            return mojaLista.get(indeks).vratiKomentare();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
