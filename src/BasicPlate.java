
public class BasicPlate implements Plate{

    protected String starchType;

    @Override
    public void setStarch(String starch) {
        this.starchType = starch;
    }

    @Override
    public String getStarch() {
        return this.starchType;
    }

    @Override
    public String getExtras() {
        return "Gravy (Onion, Tomatoes) ";
    }
}
