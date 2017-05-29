
public class SteakPlate extends OrderPlate {

    public SteakPlate(Plate newPlate) {
        super(newPlate);
    }

    public void setStarch(String starch) {
        this.starchType = starch;
    }

    public String getStarch() {
        return this.starchType;
    }

    public String getExtras() {
        return plateHolder.getExtras() + ", steak meat";
    }

}
