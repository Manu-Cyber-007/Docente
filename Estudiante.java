package Lab7;

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

    public String getNumberId() {
        return numberId;
    }

    public int getGrade() {
        return grade;
    }

    public int getCantidadNotas() {
        return grades.length;
    }

    public void setGrade(int i, double value) {
        grades[i] = value;
    }

    public double calcularPromedio() {
        double sum = 0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.length;
    }

    @Override
    public void presentar() {
        System.out.println("=== Estudiante ===");
        System.out.println("Nombre: " + name);
        System.out.println("Edad: " + age);
        System.out.println("Carrera: " + career);
        System.out.println("Grado: " + grade);
        System.out.println("Número de estudiante: " + numberId);
    }
}
