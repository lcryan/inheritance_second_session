package nl.novi.javaprogrammeren.overerving;

public class Animal {
    final String name;
    final String gender;

    boolean animalMoved;

    private DomesticAnimal domesticAnimal;

    public DomesticAnimal getDomesticAnimal() {
        return domesticAnimal;
    }

    public void setDomesticAnimals(DomesticAnimal domesticAnimal) {
        this.domesticAnimal = domesticAnimal;
    }

    public Animal(String name, String gender, boolean animalMoved) {
        this.name = name;
        this.gender = gender;
        this.animalMoved = animalMoved;
    }

    public void printName() {
        System.out.println(name);
    }

    public void animalMoved() {

        if (animalMoved) {
            System.out.println(name + " has moved by 0.25 meters");
        } else {
            System.out.println(name + " has not moved today. It's time for a walk.");
        }
    }

    public void animalSound() {
        System.out.println(name + "makes "); //TODO: here add the sound of the animal - how to do this ???
    }

    public void eat() {
        System.out.println(name + " loves to eat "); //TODO : add favourite food variable here!
    }

    public void sleep() {
        System.out.println(name + " slept for 8 hours "); //TODO : make an if/else statement here in case: animal didn't sleep, slept less than 8 hours or animal slept for 8 hours or more.
    }

}


// here you add the methods etc. p.p. that ALL animals have in common!!!

//  TODO : variables: gender, name. Methods : move, sound, eat, sleep - set getters and setters for all! Decide what to make private and what to make public!