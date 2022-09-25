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
        return name;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Animal getAnimal() {
        return this.animal;
    }

    public void feedFood(Food f) {
        this.animal.setPower(animal.getPower() + f.getPower());
    }

    public String toString() {
        return "Owner : name = " + this.name + ", Animal : name = " + this.animal.getName() + ", power = "
                + this.animal.getPower() + ", age = " + this.animal.getAge();
    }

    // protectOwnerFrom ยังผิดนะครับ
    public void protectOwnerFrom(Animal a) {
        if (a instanceof Pigeous) {
            Pigeous p = (Pigeous) a;
            p.wingAttack(this.animal);
        } else if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.kick(this.animal);
        }
    }
}
