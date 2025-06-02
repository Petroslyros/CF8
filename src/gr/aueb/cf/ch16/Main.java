package gr.aueb.cf.ch16;

public class Main {
    public static void main(String[] args) {
        ISpeakable alice = new Cat("Alice");
        ISpeakable bob = new Dog("Bob", 2);

        alice.speak();
        bob.speak();
    }

    public static void doSpeak(ISpeakable iSpeakable){
        iSpeakable.speak();
    }
}
