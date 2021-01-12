package hr.dominik.footballleagueapp;

public class ModelNovosti {

    private Integer slika;
    private String datum;
    private String naslov;
    private String tekst;

    public ModelNovosti(Integer slika, String datum, String naslov, String tekst) {
        this.slika = slika;
        this.datum = datum;
        this.naslov = naslov;
        this.tekst = tekst;
    }

    public Integer getSlika() {
        return slika;
    }

    public void setSlika(Integer slika) {
        this.slika = slika;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getNaslov() {
        return naslov;
    }

    public void setNaslov(String naslov) {
        this.naslov = naslov;
    }

    public String getTekst() {
        return tekst;
    }

    public void setTekst(String tekst) {
        this.tekst = tekst;
    }
}
