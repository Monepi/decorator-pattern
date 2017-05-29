
public class Main {

    public static void main(String[] args) {

        Plate plate = new SteakPlate(new BasicPlate());
        Plate plate1 = new Chicken(new BasicPlate());

        System.out.println("Ordering Pap and steak meat.");
        plate.setStarch("Pap");

        System.out.println("My plate is : " + plate.getStarch() + " with " + plate.getExtras());

        System.out.println("############################### NEW ORDER ###########################");

        System.out.println("Ordering rice and chicken stew.");
        plate1.setStarch("Rice");

        System.out.println("My plate is : " + plate1.getStarch() + " with " + plate1.getExtras());

    }

}
