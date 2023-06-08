package nl.novi.javaprogrammeren.overerving;

public class WildAnimals extends Animal {
    String cageName;
    String dayLastFed;
    String countryOfOrigin;


    public WildAnimals(String name, String gender, String cageName, String dayLastFed, String countryOfOrigin) {
        super(name, gender);
        this.cageName = cageName;
        this.dayLastFed = dayLastFed;
        this.countryOfOrigin = countryOfOrigin;
    }
}


