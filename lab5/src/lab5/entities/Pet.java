package lab5.entities;

public class Pet {
    private String id;
    private String name;
    private String species;
    private int age;
    private String sex;
    private String description;
    private Type type;
    private String images;

    public Pet(String id, String name, String species, int age, String sex, String description, Type type, String images) {
        this.id = id;
        this.name = name;
        this.species = species;
        this.age = age;
        this.sex = sex;
        this.description = description;
        this.type = type;
        this.images = images;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecies() {
        return species;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getDescription() {
        return description;
    }

    public Type getType() {
        return type;
    }

    public String getImages() {
        return images;
    }
}

