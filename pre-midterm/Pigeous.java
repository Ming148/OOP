/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
// package pre.midterm;

/**
 *
 * @author m.i.n.g_lee
 */
public class Pigeous extends Bird {

    public Pigeous(String name, int age) {
        super(name, age);
    }

    public Pigeous() {
        this("", 0);
    }

    public void eat(Food f) {
        this.setPower(this.getPower() + (2 * f.getPower()));
    }

    public void fly() {
        System.out.println(getName() + " fly fly ...");
    }

    public void wingAttack(Animal a) {
        a.setPower(a.getPower() - 5);
    }

    public void wingAttack(Animal a, int times) {
        for (int i = 0; i < times; i++) {
            a.setPower(a.getPower() - 5);
        }
    }
}
