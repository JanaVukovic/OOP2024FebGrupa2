public abstract class Knjiga{
    private String naslov, autor;
    private int brNaStanju;
    private String[] komentari;

    public Knjiga(String naslov, String autor, int brNaStanju, String[] komentari) {
        this.naslov = naslov;
        this.autor = autor;
        this.brNaStanju = brNaStanju;
        this.komentari = komentari;
    }

    public String getNaslov() {
        return naslov;
    }

    public String getAutor() {
        return autor;
    }

    public int getBrNaStanju() {
        return brNaStanju;
    }

    public String[] getKomentari() {
        return komentari;
    }

    public abstract String prikaziInformacije();

    public String vratiKomentare() {
        StringBuilder sb = new StringBuilder();
        String[] reci = this.getKomentari();
        for(String rec : reci){
            sb.append(rec).append(" ");
        }
        return (String.valueOf(sb));
    }
}
