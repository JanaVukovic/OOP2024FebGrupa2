public class Main {
    public static void main(String[] args) throws Exception {
        Knjizara k = new Knjizara();
        Roman a1 = new Roman("Ubcs", "Jana", 2, new String[]{"Oop najgori predmet"}, "autobiograija");
        NaucnaKnjiga b1 = new NaucnaKnjiga("Kat", "Astrofa", 31, new String[]{"ajidejd", "joeowd"}, "ilewj");
        Roman a2 = new Roman("a", "b", 3, new String[]{"c", "d", "e", "f"}, "g");
        k.dodaj(a1);
        k.dodaj(a2);
        k.dodaj(b1);
        for(Knjiga s : k.getMojaLista()){
            System.out.println(s.prikaziInformacije());
        }
        System.out.println(k.ispisiKomentare(1));
        System.out.println(k.ispisiKomentare(7));
    }
}