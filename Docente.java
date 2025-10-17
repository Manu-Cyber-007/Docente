package Lab7;

public class Docente extends Persona {
    private String subject;
    private double salary;

    public Docente(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    public double calcularBono() {
        return salary * 0.10;
    }

    public double calcularSueldoAnual() {
        return (salary * 12) + calcularBono();
    }

    @Override
    public void presentar() {
        System.out.println("=== Docente ===");
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Materia: " + subject);
        System.out.println("Sueldo mensual: " + salary);
        System.out.println("Bono (10%): " + calcularBono());
        System.out.println("Sueldo anual con bono: " + calcularSueldoAnual());
    }
}
