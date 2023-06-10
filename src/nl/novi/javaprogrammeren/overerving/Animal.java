package nl.novi.javaprogrammeren.overerving;

public class Animal {
    final String name;
    final String gender;
    boolean animalMoved;
    boolean ate;
    int sleepHours;

    private DomesticAnimal domesticAnimal;


    public DomesticAnimal getDomesticAnimal() {
        return domesticAnimal;
    }

    public void setDomesticAnimals(DomesticAnimal domesticAnimal) {
        this.domesticAnimal = domesticAnimal;
    }

    public Animal(String name, String gender, boolean animalMoved, boolean ate, int sleepHours) {
        this.name = name;
        this.gender = gender;
        this.animalMoved = animalMoved;
        this.ate = ate;
        this.sleepHours = sleepHours;
    }
    public int getSleepHours() {
        return sleepHours;
    }

    public void setSleepHours(int sleepHours) {
        this.sleepHours = sleepHours;
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
        System.out.println();
    }

    public void hasEaten() {
        if (ate) {
            System.out.println(name + " had a nice dinner! Time for a nice sleep! Nighty night!");
        } else {
            System.out.println("You forgot to feed " + name + " !" + "Please make some dinner for " + name + ".");
        }
    }

    public void sleep() {
        if (sleepHours < 8) {
            System.out.println("Oh dear!" + name + " hasn't slept enough! Time for a nap!");
        } else {
            System.out.println(name + " slept enough. Time for a nice walk in the park!");
        }
    }
}


// here you add the methods etc. p.p. that ALL animals have in common!!!

//  TODO : variables: gender, name. Methods : move, sound, eat, sleep - set getters and setters for all! Decide what to make private and what to make public!