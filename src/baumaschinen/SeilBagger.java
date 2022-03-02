package baumaschinen;

public class SeilBagger extends Bagger implements Fahrbar{

    private float seillaenge;


    public SeilBagger(int motorleistung, int anzahlGrabwerkzeuge, float seillaenge) {
        super(motorleistung, anzahlGrabwerkzeuge);
        this.seillaenge = seillaenge;
    }

    public float getSeillaenge() {
        System.out.println(motorleistung);
        return seillaenge;
    }

    public void setSeillaenge(float seillaenge) {
        this.seillaenge = seillaenge;
    }

    @Override
    public double getMaxGeschwindigkeit() {
        return 20.0;
    }

}
