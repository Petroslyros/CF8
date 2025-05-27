package gr.aueb.cf.ch15;

public class Dog extends Animal{
    public Dog() {

    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void speak() {
        System.out.println("Woof");
    }

    @Override
    public String toString() {
        return "Animal's name " + getName() + " Animals age : " + getAge();
    }
}
