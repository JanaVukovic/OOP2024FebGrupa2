public class NaucnaKnjiga extends Knjiga implements PrikazKomentara{
    private String naucnaOblast;

    public NaucnaKnjiga(String naslov, String autor, int brNaStanju, String[] komentari, String naucnaOblast) {
        super(naslov, autor, brNaStanju, komentari);
        this.naucnaOblast = naucnaOblast;
    }

    @Override
    public String prikaziInformacije() {
        return this.getNaslov() + " - " + this.getAutor() + "( " + this.naucnaOblast + " ) " + this.getBrNaStanju();
    }
}
