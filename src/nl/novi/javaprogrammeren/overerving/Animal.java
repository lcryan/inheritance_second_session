package nl.novi.javaprogrammeren.overerving;

public class Animal {
    final String name;
    final String gender;

    public Animal(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public void animalMoved() {
        boolean animalMoved = false;
        if (animalMoved) {
            System.out.println("The" + name + "animal has moved by 0.25 meters");
        }
    }

    public void animalSound() {
        System.out.println(name + "makes..."); //TODO: here add the sound of the animal - how to do this ???
    }

    public void eat() {
        System.out.println(name + "ate..."); //TODO : add favourite food variable here! 
    }

    public void sleep() {
        System.out.println(name + "slept....hours"); //TODO : try to add different amount of hours here!
    }
}


// here you add the methods etc. p.p. that ALL animals have in common!!!

//  TODO : variables: gender, name. Methods : move, sound, eat, sleep - set getters and setters for all! Decide what to make private and what to make public!