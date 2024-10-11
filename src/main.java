// Kelas induk pertama
public class Animal {
    private String name;
    private int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter dan setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Method untuk mengeluarkan suara
    public void makeSound() {
        System.out.println("Suara binatang");
    }

    // Method overloading
    public void makeSound(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Suara binatang");
        }
    }
}

// Kelas induk kedua
public class Vehicle {
    private String brand;
    private int year;

    // Constructor
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Getter dan setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Method untuk menjalankan kendaraan
    public void drive() {
        System.out.println("Kendaraan sedang dikendarai");
    }

    // Method overloading
    public void drive(int speed) {
        System.out.println("Kendaraan sedang dikendarai dengan kecepatan " + speed);
    }
}

// Kelas anak yang mewarisi Animal dan Vehicle
public class Dog extends Animal implements Vehicle {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Method overriding dari Animal
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }

    // Method overriding dari Vehicle
    @Override
    public void drive() {
        System.out.println("Anjing sedang berlari");
    }

    // Method overloading
    public void drive(int speed) {
        System.out.println("Anjing sedang berlari dengan kecepatan " + speed);
    }

    // Getter dan setter
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}