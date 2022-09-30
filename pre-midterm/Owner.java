/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
// package pre.midterm;

/**
 *
 * @author m.i.n.g_lee
 */
public class Owner {

    protected final String name;
    protected Animal animal;

    public Owner() {
        this.name = "";
        this.animal = null;
    }

    public Owner(String name) {
        this.name = name;
        this.animal = null;
    }

    public Owner(Animal animal) {
        this.name = "";
        this.animal = animal;
    }

    public Owner(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }

    public String getName() {
        return this.name;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return this.animal;
    }

    public void feedFood(Food f) {
        animal.setPower(f.getPower() + animal.getPower());
    }

    public String toString() {
        return "Owner : name = " + this.name + ", Animal : name = " + this.animal.getName() + ", power = "
                + this.animal.getPower() + ", age = " + this.animal.getAge();
    }

    public void protectOwnerFrom(Animal a) {
        if (animal instanceof Pigeous) {
            ((Pigeous) animal).wingAttack(a);;
        } else if (animal instanceof Dog) {
            ((Dog) animal).kick(a);
        }
    }
}
