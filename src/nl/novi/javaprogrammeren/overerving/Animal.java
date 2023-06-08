package nl.novi.javaprogrammeren.overerving;

public abstract class Animal {
    String animal;
    String cageName;
    String lastFed;
    String weekday;
    String gender;

    public Animal(String animal, String cageName, String lastFed, String weekday, String getLastFed, String gender) {
        this.animal = animal;
        this.cageName = cageName;
        this.lastFed = lastFed;

    }

}
