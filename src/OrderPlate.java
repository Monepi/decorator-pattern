
abstract public class OrderPlate implements Plate {

    protected Plate plateHolder;
    protected String starchType;

    public OrderPlate(Plate newPlate) {
        plateHolder = newPlate;
    }

    public void setStarch(String starch) {
        starchType = starch;
    }

    public String getStarch() {
        return starchType;
    }

    public String getExtras() {
        return plateHolder.getExtras();
    }

}
