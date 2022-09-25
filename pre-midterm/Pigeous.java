/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author m.i.n.g_lee
 */
public class Pigeous extends Bird {
    private Animal ani;
    public Pigeous(String name, int age) {
        super(name, age);
    }

    public Pigeous() {
        super("", 0);
    }

    public void eat(Food f) {
        ani.setPower(ani.getAge() + (f.getPower() * 2));
    }

    public void fly(){
        System.out.println(super.name + " fly fly ....");
    }

    public void wingAttack(Animal a, int times) {
        for (int i = 0; i < times; i++) {
            a.setPower(a.getPower() - 5);
        }
    }

    public void wingAttack(Animal a) {
        a.setPower(a.getPower() - 5);
    }
}
