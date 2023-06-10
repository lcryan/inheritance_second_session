package nl.novi.javaprogrammeren.overerving;

public class Animal {
    final String name;
    final String gender;
    boolean animalMoved;
    boolean hasEaten;

    private DomesticAnimal domesticAnimal;

    public DomesticAnimal getDomesticAnimal() {
        return domesticAnimal;
    }

    public void setDomesticAnimals(DomesticAnimal domesticAnimal) {
        this.domesticAnimal = domesticAnimal;
    }

    public Animal(String name, String gender, boolean animalMoved, int timeSlept, boolean hasEaten) {
        this.name = name;
        this.gender = gender;
        this.animalMoved = animalMoved;
        this.hasEaten = hasEaten;
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
        System.out.println(); //TODO: here add the sound of the animal - how to do this ???
    }

    public void hasEaten() {
        if (hasEaten) {
            System.out.println(name + "has had a nice dinner! Time for a nice sleep! Nighty night!");
        } else {
            System.out.println("You forgot to feed " + name + " !" + "Please make some dinner for " + name + ".");
        }
    }

    public void sleep() {
    } // TODO : enter method-control-flow here!
}


// here you add the methods etc. p.p. that ALL animals have in common!!!

//  TODO : variables: gender, name. Methods : move, sound, eat, sleep - set getters and setters for all! Decide what to make private and what to make public!