package Lab7;

import java.util.Scanner;

public abstract class Persona {
    protected String name;
    protected int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void presentar();
    public abstract void modificar(Scanner sc);

    // Getters y Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
