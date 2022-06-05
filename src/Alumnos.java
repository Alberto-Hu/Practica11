import java.io.Serializable;
import java.util.Scanner;

public class Alumnos implements Serializable {
    private String nom;
    private String matr;
    float Promedio;
    float[] calificaciones = new float[7];

    public Alumnos() {
        setNom(CapturaEntrada.CapturarString("Introduce alumno"));
        setMatr(CapturaEntrada.CapturarString("Introduce matricula"));
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public void Calcularprom() {
        Promedio = 0;
        for (float calificacione : calificaciones) {
            Promedio += calificacione;
        }
        Promedio /= calificaciones.length;
    }

    public void ImpAlumno() {
        System.out.println("Nombre de alumno " + nom);
        System.out.println("Matricula " + matr);
        System.out.println("Calificaciones ");
        for (float calificacione : calificaciones) {
            System.out.println(calificacione);
        }
        System.out.println("Promedio final: " + Promedio);

    }

    public class CapturaEntrada {

        public static int capturarEntero(String msg) {
            Scanner sc = new Scanner(System.in);
            System.out.println("" + msg + ":");
            return (sc.nextInt());
        }

        public static float CapturarFloat(String msg) {
            Scanner sc = new Scanner(System.in);
            System.out.println("" + msg + ":");
            return (sc.nextFloat());
        }

        public static double capturaDoble(String msg) {
            Scanner sc = new Scanner(System.in);
            System.out.print("" + msg + ": ");
            return (sc.nextDouble());
        }

        public static String CapturarString(String msg) {
            Scanner sc = new Scanner(System.in);
            System.out.println("" + msg + ":");
            return (sc.nextLine());
        }
    }
}