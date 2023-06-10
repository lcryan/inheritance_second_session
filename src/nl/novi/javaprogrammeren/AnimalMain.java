package nl.novi.javaprogrammeren;

import nl.novi.javaprogrammeren.overerving.*;

public class AnimalMain {

    public static void main(String[] args) {
        Cat cat = new Cat("Kitty", "female", false, true, "Willow", "Whiskas", "Siamese", Cat.CatType.HOUSECAT);
        Dog dog = new Dog("Fifi", "male", true, false, "Kiera", "DoggyFood", "Golden Retriever");
        Tiger tigger = new Tiger("Tigger", "male", "Tiger's Den", "Wednesday", "South Africa", false, true, 200);
        cat.printDomesticAnimalInfo();
        dog.printDomesticAnimalInfo();
        tigger.printWildAnimalInfo();
        tigger.hasEaten();

    }

}




    /*
    Opdracht
    Bekijk de beschrijving van onderstaande dieren. Bedenk wat je in de superklasse kan zetten. De subklassen hoef
    je nog niet te maken.

    First :

    1. Make 2 super classes : one for DomesticAnimals(dog, cat) and one for WildAnimals (lion, tiger, wolf)
    2. There are in total  5 animals - lion, tiger, wolf, dog and cat
    2. All WILD animals have the following in common: name, cageName, sex-gender, dayLastFed, countryOfOrigin
    3. All WILD animals also have one unique feature: lion - numberOfKids; tiger: numberOfStripes; wolf: packName.
    4. All DOMESTIC animals have the following in common: name, nameOfOwner, favouriteFoodBrand, type, gender.
    5. ALL GENERAL animals have the following in common : gender, name.
    5. The cat has ONE special feature: houseCat or outsideCat.

    ALL animals have to be able to do the following :
    1. method one: be able to move : if they move then print in the console: 0.25 meters moved.
    2. method two: they have  to make sounds: print out the sort of sound in the console.
    3. method three : ALL animals eat - print out WHAT they eat
    4.method four: ALL animals have to sleep  8 hours a day (boolean and include additional condition)
  --> all the methods have to be added to ANIMAL.JAVA!

  Plan of steps:
  1. Make all 3 super-classes - Animal, Wild Animals, Domestic Animals - DONE
  2. Make all animals classes - DONE
  3. Start to add variables and methods for ALL animals to Animal.java DONE

  4.  Add variables for all DOMESTIC animals : nameOfOwner, favouriteFoodBrand, type. DONE -
  5. Add variables to all WILD animals: cageName, sex-gender, dayLastFed, countryOfOrigin.DONE
  6. Go alphabetically from CAT and finalize each animal accordingly including methods as well.
  7. Print all methods and the animal info in the main to see, if it works.
      */