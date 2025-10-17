package Lab7;

import java.util.Scanner;

public class Estudiante extends Persona {
    private String career;
    private int grade;
    private String numberId;
    private double[] grades;

    public Estudiante(String name, int age, String career, int grade, String numberId) {
        super(name, age);
        this.career = career;
        this.grade = grade;
        this.numberId = numberId;
        this.grades = new double[grade * 2]; // 2 notas por grado
    }

    // Métodos getter/setter//
    public String getCareer() { 
        return career; }
    
    public void setCareer(String career) { 
        this.career = career; }
    
    public int getGrade() { 
        return grade; }
    
    public void setGrade(int grade) { 
        this.grade = grade; }
    
    public String getNumberId() { 
        return numberId; }

    public void setNota(int i, double value) { grades[i] = value; }
    public int getCantidadNotas() { return grades.length; }
    public double calcularPromedio() {
        double sum = 0;
        for (double g : grades) sum += g;
        return sum / grades.length;
    }
     //presentarse estudiante//
    @Override
    public void presentar() {
        System.out.println("=== Estudiante ===");
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Carrera: " + career);
        System.out.println("Grado: " + grade);
        System.out.println("Número de estudiante: " + numberId);
    }
   //modificar dato erroneo//
    @Override
    public void modificar(Scanner sc) {
        System.out.println("¿Qué desea modificar?");
        System.out.println("1. Nombre\n2. Edad\n3. Carrera\n4. Grado");
        int opcion = sc.nextInt(); sc.nextLine();
        switch (opcion) {
    case 1:
        setName(sc.nextLine());
        break;
    case 2:
        setAge(sc.nextInt());
        sc.nextLine();
        break;
    case 3:
        setCareer(sc.nextLine());
        break;
    case 4:
        setGrade(sc.nextInt());
        sc.nextLine();
        break;
    default:
        System.out.println("Opción no válida");
}
        presentar();
    }

    // Ingresar Estudiante//
    public static Estudiante crearEstudiante(Scanner sc) {
        System.out.print("Nombre: ");
        String name = sc.nextLine();
        System.out.print("Edad: ");
        int age = sc.nextInt(); sc.nextLine();
        System.out.print("Carrera: ");
        String career = sc.nextLine();
        System.out.print("Grado (1 a 5): ");
        int grade = sc.nextInt(); sc.nextLine();
        System.out.print("Número de estudiante (ID): ");
        String numberId = sc.nextLine();
        return new Estudiante(name, age, career, grade, numberId);
    }
}

