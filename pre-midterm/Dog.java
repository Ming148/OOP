/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
// package pre.midterm;

/**
 *
 * @author m.i.n.g_lee
 */
public class Dog extends Animal{
    public Dog(String name, int age){
        super(name, 200, age);
    }
    
    public void eat(Food f){
        super.setPower(super.getPower() + f.getPower());
    }
    public void kick (Animal a){
        a.setPower(a.getPower() - 10);
    }
}
