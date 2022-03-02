package baumaschinen;

interface Fahrbar {
    public abstract double getMaxGeschwindigkeit();
}

public abstract class Bagger extends Baumaschine {

    private int anzahlGrabwerkzeuge;

    // Konstruktor
    public Bagger(int motorleistung, int anzahlGrabwerkzeuge) {
        super(motorleistung);
        this.anzahlGrabwerkzeuge = anzahlGrabwerkzeuge;
    }

    // Getter/Setter
    public int getAnzahlGrabwerkzeuge() {
        return anzahlGrabwerkzeuge;
    }

    public void setAnzahlGrabwerkzeuge(int anzahlGrabwerkzeuge) {
        this.anzahlGrabwerkzeuge = anzahlGrabwerkzeuge;
    }



}