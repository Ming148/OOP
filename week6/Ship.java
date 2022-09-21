public class Ship extends Vehicle implements Floatable{
    public Ship(double fuel) {
        super(fuel);
    }

    public Ship() {
        super(0.0);
    }

    public void fl0at() {
        if (this.getFuel() >= 50) {
            System.out.println("Ship moves");
            this.setFuel(this.getFuel() - 50);
        } else {
            System.out.println("Fuel is not enough.");
        }
    }

    public void startEngine() {
        if (this.getFuel() >= 10) {
            System.out.println("Engine starts");
            this.setFuel(this.getFuel() - 10);
        } else {
            System.out.println("Fuel is not enough.");
        }
    }

    public void stopEngine() {
        System.out.println("Engine stops");
    }

    public void honk() {
        System.out.println("Shhhhh");
    }

    public void move(){
        fl0at();
    }

    public void move(int distance){
        for (int i = 0; i < distance; i++) {
            fl0at();
        }
    }
}
