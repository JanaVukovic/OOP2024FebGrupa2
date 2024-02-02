public class Main2 {
    public static void main(String[] args) {
        GenericList<Vektor> l = new GenericList<>();
        Vektor v1 = new Vektor(3.4, 2.6, 9.8);
        Vektor v2 = new Vektor(8.4, 12.2, 9.9);
        Vektor v3 = new Vektor(8.4, 12.2, 9.9);
        Vektor v4 = new Vektor(45.4, 32.9, 76.9);
        Vektor v5 = new Vektor(5.4, 7.2, 34.9);
        l.dodaj(new Cvor<>(v1));
        l.dodaj(new Cvor<>(v2));
        l.dodaj(new Cvor<>(v3));
        l.dodaj(new Cvor<>(v4));
        l.dodaj(new Cvor<>(v5));
        System.out.println(l);
        System.out.println(l.length());
        System.out.println(l.cout(new Vektor(8.4, 12.2, 9.9)));
        l.ukloni();
        l.dodaj(new Cvor<>(new Vektor(11.2, 12.4, 1.4)));
        l.ukloni();
        l.ukloni();
        l.ukloni();
        l.ukloni();
        l.ukloni();
        l.ukloni();
        System.out.println(l);
    }


}
