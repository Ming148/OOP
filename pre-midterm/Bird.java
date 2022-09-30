/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
// package pre.midterm;

/**
 *
 * @author m.i.n.g_lee
 */
public abstract class Bird extends Animal implements Flyable{
    public Bird(String name, int age){
        super(name, 150, age);
    }
    public abstract void wingAttack(Animal a);
}
