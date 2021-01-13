package hr.dominik.footballleagueapp;

public class RecyclerViewDataModel {

    private String country;

    public RecyclerViewDataModel(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
