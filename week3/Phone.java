/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author m.i.n.g_lee
 */
public class Phone {
    private String brandName;
    private boolean hasFM;
    private boolean hasCamera;
    private double price;
    private int space;
    public void turnOn(){
        System.out.println("On");
    }
    public void call(String n){
        System.out.println("Calling to " + n);
    }
    public void showBrand(){
        System.out.println("Brand > " + brandName);
    }
    public void turnOff(){
        System.out.println("Off");
    }
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.turnOn();
        p1.call("Peter");
        p1.showBrand();
        p1.turnOff();
    }
}
