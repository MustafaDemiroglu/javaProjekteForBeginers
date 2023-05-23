package Day07;

public class C03_JavaPolymorphism_Main {

    public static void main(String[] args) {

        C03_JavaPolymorphism_Animal myAnimal = new C03_JavaPolymorphism_Animal();
        C03_JavaPolymorphism_Animal myPig = new C03_JavaPolymorphism_Pig();
        C03_JavaPolymorphism_Animal myDog = new C03_JavaPolymorphism_Dog();

        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
