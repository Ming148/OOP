public abstract class Animal {
    protected String name;
    private int power;
    private int age;

    public Animal(String name, int power, int age) {
        this.name = name;
        this.power = power;
        this.age = age;
    }

    public Animal() {
        this.name = "";
        this.power = 0;
        this.age = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat(Food f);

    public String toString() {
        return "Animal : name = " + this.name + ", power = " + this.power + ", age = " + this.age;
    }

    public boolean equals(Animal a) {
        if (this.name.equals(this.age)) {
            return true;
        } else {
            return false;
        }
    }
}
