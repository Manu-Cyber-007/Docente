package Lab7;

import java.util.Scanner;

public class Docente extends Persona {
    private String subject;
    private double salary;

    public Docente(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    // Getters/Setters
    public String getSubject() { 
        return subject; }
    
    public void setSubject(String subject) { 
        this.subject = subject; }
    
    public double getSalary() { 
        return salary; }
    
    public void setSalary(double salary) { 
        this.salary = salary; }

    public double calcularBono() { return salary * 0.10; }
    public double calcularSueldoAnual() { return salary * 12 + calcularBono(); }
     //presentar docente//
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
     //modificar docente//
    @Override
    public void modificar(Scanner sc) {
        System.out.println("¿Qué desea modificar?");
        System.out.println("1. Nombre\n2. Edad\n3. Materia\n4. Sueldo mensual");
        int opcion = sc.nextInt(); sc.nextLine();
        switch (opcion) {
        case 1:
            System.out.print("Ingrese nuevo nombre: ");
            setName(sc.nextLine());
            break;
        case 2:
            System.out.print("Ingrese nueva edad: ");
            setAge(sc.nextInt());
            sc.nextLine(); // limpiar buffer
            break;
        case 3:
            System.out.print("Ingrese nueva materia: ");
            setSubject(sc.nextLine());
            break;
        case 4:
            System.out.print("Ingrese nuevo sueldo mensual: ");
            setSalary(sc.nextDouble());
            sc.nextLine(); // limpiar buffer
            break;
        default:
            System.out.println("Opción no válida");
    }
        presentar();
    }

    // ingresar docente//
    public static Docente crearDocente(Scanner sc) {
        System.out.print("Nombre: ");
        String name = sc.nextLine();
        System.out.print("Edad: ");
        int age = sc.nextInt(); sc.nextLine();
        System.out.print("Materia: ");
        String subject = sc.nextLine();
        System.out.print("Sueldo mensual: ");
        double salary = sc.nextDouble(); sc.nextLine();
        return new Docente(name, age, subject, salary);
    }
}


