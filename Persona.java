package Lab7;

public abstract class Persona {
    protected String name;
    protected int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Método abstracto: cada subclase imprimirá sus datos
    public abstract void presentar();
}
