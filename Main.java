package Lab7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Preguntar cantidad de estudiantes y docentes
        System.out.print("¿Cuántos estudiantes desea agregar? ");
        int cantEstudiantes = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        System.out.print("¿Cuántos docentes desea agregar? ");
        int cantDocentes = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        // Arreglo dinámico según total de personas
        Persona[] personas = new Persona[cantEstudiantes + cantDocentes];

        // Registro de estudiantes
        System.out.println("\n=== Registro de Estudiantes ===");
        for (int i = 0; i < cantEstudiantes; i++) {
            System.out.println("\n--- Ingreso de estudiante " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            String name = sc.nextLine();

            System.out.print("Edad: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Carrera: ");
            String career = sc.nextLine();

            System.out.print("Grado (1 a 5): ");
            int grade = sc.nextInt();
            sc.nextLine();

            System.out.print("Número de estudiante (ID): ");
            String numberId = sc.nextLine();

            personas[i] = new Estudiante(name, age, career, grade, numberId);
        }

        // Registro de docentes
        System.out.println("\n=== Registro de Docentes ===");
        for (int i = 0; i < cantDocentes; i++) {
            System.out.println("\n--- Ingreso de docente " + (i + 1) + " ---");
            System.out.print("Nombre: ");
            String name = sc.nextLine();

            System.out.print("Edad: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.print("Materia: ");
            String subject = sc.nextLine();

            System.out.print("Sueldo mensual: ");
            double salary = sc.nextDouble();
            sc.nextLine();

            personas[cantEstudiantes + i] = new Docente(name, age, subject, salary);
        }

        // Presentación automática de todas las personas
        System.out.println("\n=== Presentaciones Automáticas ===");
        for (Persona p : personas) {
            p.presentar();       // cada persona se presenta con su método
            System.out.println(); // espacio entre cada presentación
        }

        // Consultar promedio de estudiante
        System.out.print("¿Desea consultar el promedio de un estudiante? (si/no): ");
        String respuesta = sc.nextLine().trim().toLowerCase();

        if (respuesta.equals("si")) {
            System.out.print("Ingrese el número de estudiante: ");
            String idBuscado = sc.nextLine();
            boolean encontrado = false;

            for (Persona p : personas) {
                if (p instanceof Estudiante) {
                    Estudiante e = (Estudiante) p;
                    if (e.getNumberId().equals(idBuscado)) {
                        encontrado = true;
                        int cantidadNotas = e.getCantidadNotas();
                        System.out.println("El estudiante de grado " + e.getGrade() +
                                           " debe ingresar " + cantidadNotas + " notas.");

                        for (int j = 0; j < cantidadNotas; j++) {
                            System.out.print("Ingrese la nota " + (j + 1) + ": ");
                            double nota = sc.nextDouble();
                            e.setGrade(j, nota);
                        }

                        System.out.println("\nEl promedio del estudiante " + idBuscado + " es: " +
                                           e.calcularPromedio());
                        break;
                    }
                }
            }

            if (!encontrado) {
                System.out.println("No se encontró un estudiante con ese número.");
            }
        } else {
            System.out.println("Gracias. Fin del programa.");
        }

        sc.close();
    }
}
