package nl.novi.javaprogrammeren.overerving;

public class WildAnimals extends Animal {
    String cageName;
    String dayLastFed;
    String countryOfOrigin;


    public WildAnimals(String name, String gender, String cageName, String dayLastFed, String countryOfOrigin, boolean animalMoved, boolean hasEaten) {
        super(name, gender, animalMoved, hasEaten);
        this.cageName = cageName;
        this.dayLastFed = dayLastFed;
        this.countryOfOrigin = countryOfOrigin;
    }

    public void printWildAnimalInfo() {
        System.out.println("This is " + name + "." + name + " is from " + countryOfOrigin + "." + name + " is " + gender + " and lives in " + cageName + "." + name + " has been last fed on " + dayLastFed + "." + name + ate + ".");
    }
}



