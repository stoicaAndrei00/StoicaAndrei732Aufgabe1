import java.time.LocalDate;

public class Evenimente {
    private int id;
    private String held;

    private String antagonist;
    private enum konfrontationsTyp{Individuell, Team, Galaktisch, Multiversal};
    private String ort;
    private LocalDate datum;

    private double globalerEinfluss;

    public Evenimente(int id, String held, String antagonist, String ort, LocalDate datum, double globalerEinfluss) {
        this.id = id;
        this.held = held;
        this.antagonist = antagonist;
        this.ort = ort;
        this.datum = datum;
        this.globalerEinfluss = globalerEinfluss;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setHeld(String held) {
        this.held = held;
    }

    public void setAntagonist(String antagonist) {
        this.antagonist = antagonist;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }

    public void setGlobalerEinfluss(double globalerEinfluss) {
        this.globalerEinfluss = globalerEinfluss;
    }


}
