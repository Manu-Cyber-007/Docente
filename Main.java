package Lab7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir cantidad de estudiantes y docentes
        System.out.print("¿Cuántos estudiantes desea agregar? ");
        int cantEstudiantes = sc.nextInt(); sc.nextLine();
        System.out.print("¿Cuántos docentes desea agregar? ");
        int cantDocentes = sc.nextInt(); sc.nextLine();

        Persona[] personas = new Persona[cantEstudiantes + cantDocentes];

        // Ingreso de estudiantes
        for (int i = 0; i < cantEstudiantes; i++) {
            System.out.println("\n--- Ingreso del estudiante " + (i + 1) + " ---");
            personas[i] = Estudiante.crearEstudiante(sc);
        }

        // Ingreso de docentes
        for (int i = 0; i < cantDocentes; i++) {
            System.out.println("\n--- Ingreso del docente " + (i + 1) + " ---");
            personas[cantEstudiantes + i] = Docente.crearDocente(sc);
        }

        // Presentación automática
        System.out.println("\n=== Presentaciones Automáticas ===");
        for (Persona p : personas) p.presentar();

        // Modificación de datos
        String modificar;
        do {
            System.out.print("\n¿Desea modificar algún dato? (si/no): ");
            modificar = sc.nextLine().trim().toLowerCase();
            if (modificar.equals("si")) {
                System.out.print("Ingrese número de estudiante o nombre del docente: ");
                String id = sc.nextLine();
                boolean encontrado = false;
                for (Persona p : personas) {
                    if ((p instanceof Estudiante && ((Estudiante)p).getNumberId().equals(id)) ||
                        (p instanceof Docente && ((Docente)p).getName().equalsIgnoreCase(id))) {
                        p.modificar(sc);
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("No se encontró ningún estudiante o docente con ese identificador.");
                }
            }
        } while (modificar.equals("si"));

        System.out.println("\nFin del programa.");
        sc.close();
    }
}
