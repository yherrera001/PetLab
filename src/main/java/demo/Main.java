package demo;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Pets> petList = new ArrayList<Pets>();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.println("Hi");
        int numberOfPets = countPets();
        ArrayList<Pets> userPets = listOfPets(numberOfPets);
        for (Pets x : userPets) {
            System.out.println(x.getName() + " says " + x.speak());
        }
    }
    //Method for how many pets they have.
    public static int countPets(){
        System.out.println("How many pets do you have?");
        return scanner.nextInt();
    }
    //    //Method for the type of pet.
//    public static String getPetName(){
//        System.out.println("How many pets do you own?");
//        return scanner.nextLine();
//    }
    //Method for each pets name.
    public static String getPetTypeInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }
    public static String getPetNameInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }
    //Method that returns the list of pets
    public static ArrayList<Pets> listOfPets(int numberOfPets){
        for(int index = 0; index < numberOfPets; index++){
            String petType = getPetTypeInput("What type of pet do you have?");
            String petName = getPetNameInput("What is your " + petType + "'s name?");
            if(petType.equalsIgnoreCase("Dog")){
                Dog dog = new Dog(petName);
                petList.add(dog);
            }
            else if(petType.equalsIgnoreCase("Cat")){
                Cat cat = new Cat(petName);
                petList.add(cat);
            }
            else {
                Goat goat = new Goat(petName);
                petList.add(goat);
            }
        }
        return petList;
    }
    //Method that returns ArrayList that takes pets as a parameter
    //Loop through and store the information
    //Check if() the type of pet they have matches and add it in arraylist
    //Return the list.
    //Use the list inside of main and
    //listofSongs.add(new Song(title "Who runs the world"))
//    Part 1:
//    Create a program that asks the user how many pets they have. Once you know
//    how many pets they have, ask them what kind of pet each one is, along with
//    each pet's name. For now your program should just hold onto the user input
//    and print out the list at the end; we'll modify this in part 3.
    //Method for how many pets they have.
    //Method for the type of pet.
    //Method for each pets name.
    //Store each of them inside of an ArrayList.
    //Print out the ArrayList.
}