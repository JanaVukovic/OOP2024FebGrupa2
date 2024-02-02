public class Roman extends Knjiga implements PrikazKomentara{
    private String zanr;

    public Roman(String naslov, String autor, int brNaStanju, String[] komentari, String zanr) {
        super(naslov, autor, brNaStanju, komentari);
        this.zanr = zanr;
    }

    @Override
    public String prikaziInformacije() {
        return this.getNaslov() + " - " + this.getAutor() + "( " + this.zanr + " ) " + this.getBrNaStanju();
    }
}
