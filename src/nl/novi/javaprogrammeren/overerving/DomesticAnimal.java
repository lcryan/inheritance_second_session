package nl.novi.javaprogrammeren.overerving;

public abstract class DomesticAnimal extends Animal {
    final String nameOfOwner;
    private String favouriteFoodBrand;
    private final String breed;

    public DomesticAnimal(String name, String gender, boolean animalMoved, boolean hasEaten, int sleepHours, String nameOfOwner, String favouriteFoodBrand, String breed) {
        super(name, gender, animalMoved, hasEaten, sleepHours);
        this.nameOfOwner = nameOfOwner;
        this.favouriteFoodBrand = favouriteFoodBrand;
        this.breed = breed;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public String getFavouriteFoodBrand() {
        return favouriteFoodBrand;
    }

    public void setFavouriteFoodBrand(String newFavouriteFoodBrand) {
        this.favouriteFoodBrand = newFavouriteFoodBrand;
    }

    public String getBreed() {
        return breed;
    }


    public void printDomesticAnimalInfo() {
        System.out.println("The name of " + name + "'s owner is " + nameOfOwner + "." + name + " is " + gender + " and a " + breed + ". " + name + " loves to eat " + favouriteFoodBrand + ".");
    }
}
