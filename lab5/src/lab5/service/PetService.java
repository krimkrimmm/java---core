package lab5.service;
import lab5.entities.Pet;
import lab5.entities.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import java.util.Scanner;

public class PetService {
    private List<Pet> pets;

    public PetService() {
        pets = new ArrayList<>();
        initializePets();
    }

    private void initializePets() {
        pets.add(new Pet("P001", "Buddy", "Golden Retriever", 3, "Male", "Friendly and playful", Type.DOG, "buddy.jpg"));
        pets.add(new Pet("P002", "Lucy", "Persian Cat", 2, "Female", "Calm and affectionate", Type.CAT, "lucy.jpg"));
        pets.add(new Pet("P003", "Max", "Bulldog", 4, "Male", "Strong and loyal", Type.DOG, "max.jpg"));
        pets.add(new Pet("P004", "Bella", "Siamese Cat", 1, "Female", "Curious and active", Type.CAT, "bella.jpg"));
    }

    public void match() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your pet's ID:");
        String id = scanner.nextLine();
        System.out.println("Enter your pet's name:");
        String name = scanner.nextLine();
        System.out.println("Enter your pet's species:");
        String species = scanner.nextLine();
        System.out.println("Enter your pet's age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter your pet's sex (Male/Female):");
        String sex = scanner.nextLine();
        System.out.println("Enter your pet's description:");
        String description = scanner.nextLine();
        System.out.println("Enter your pet's type (DOG/CAT):");
        Type type = Type.valueOf(scanner.nextLine().toUpperCase());
        System.out.println("Enter your pet's image filename:");
        String images = scanner.nextLine();

        Pet userPet = new Pet(id, name, species, age, sex, description, type, images);

        Random random = new Random();
        boolean foundMatch = false;

        while (!foundMatch) {
            Pet randomPet = pets.get(random.nextInt(pets.size()));
            if (randomPet.getType() == userPet.getType() && !randomPet.getSex().equalsIgnoreCase(userPet.getSex())) {
                System.out.println("Match found!");
                System.out.println("ID: " + randomPet.getId());
                System.out.println("Name: " + randomPet.getName());
                System.out.println("Species: " + randomPet.getSpecies());
                System.out.println("Age: " + randomPet.getAge());
                System.out.println("Sex: " + randomPet.getSex());
                System.out.println("Description: " + randomPet.getDescription());
                System.out.println("Image: " + randomPet.getImages());

                System.out.println("Do you want to find another match? (Y/N)");
                String response = scanner.nextLine();
                if (response.equalsIgnoreCase("N")) {
                    foundMatch = true;
                }
            }
        }
    }
}
