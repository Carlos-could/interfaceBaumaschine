package baumaschinen;

public class Kipplaster extends Transportgeraet implements Fahrbar{

    private float winkel;


    public Kipplaster(int motorleistung, float winkel) {
        super(motorleistung);
        this.winkel = winkel;
    }

    public float getWinkel() {
        return winkel;
    }

    public void setWinkel(float winkel) {
        this.winkel = winkel;
    }

    @Override
    public double getMaxGeschwindigkeit() {
        return 50.0;
    }

}
