public class Triangolo {
    private float base;
    private float altezza;

    //costruttore
    public Triangolo(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public float getBase() {
        return base;
    }

    public float getAltezza() {
        return altezza;
    }

    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangolo{" +
                "base=" + base +
                ", altezza=" + altezza +
                '}';
    }
}
