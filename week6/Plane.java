public class Plane extends Vehicle implements Flyable {
    private String airline;
    private String boeing;
    private int MAX_FLYER = 2;

    public Plane(double fuel, String airline, String boeing) {
        super(fuel);
        this.airline = airline;
        this.boeing = boeing;
    }

    public Plane() {
        super(0.0);
        this.airline = "";
        this.boeing = "";
    }

    public void startEngine() {
        if (this.getFuel() >= 20) {
            System.out.println("Plane’s Engine starts");
            this.setFuel(this.getFuel() - 20);
        } else {
            System.out.println("Fuel is not enough.");
        }
    }

    public void stopEngine() {
        System.out.println("Plane’s Engine stops");
    }

    public void honk() {
        System.out.println("Weeeeeee");
    }

    public void fly() {
        if (this.getFuel() >= 20) {
            System.out.println("Plane Fly");
            this.setFuel(this.getFuel() - 20);
        } else {
            System.out.println("Fuel is nearly empty.");
        }
    }

    public void takeOff() {
        if (this.getFuel() >= 10) {
            System.out.println("Plane Already to Take Off");
            this.setFuel(this.getFuel() - 10);
        } else {
            System.out.println("Fuel is nearly empty.");
        }
    }

    public void landing() {
        if (this.getFuel() >= 10) {
            System.out.println("Plane Already to Landing");
            this.setFuel(this.getFuel() - 10);
        } else {
            System.out.println("Fuel is nearly empty.");
        }
    }

    public String getAirline(){
        return this.airline;
    }

    public void setAirline(String airline){
        this.airline = airline;
    }

    public String getBoeing(){
        return this.boeing;
    }
    public void setBoeing(String boeing){
        this.boeing = boeing;
    }
}
