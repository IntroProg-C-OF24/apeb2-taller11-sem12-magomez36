package taller.pkg11.introprog.manuel.gomez;
import java.util.Scanner;
public class PromedioCualitativo_Problema03 {
    public static void main(String[] args) {
        String nombreEst;
        double praC, sdaC, traC, ctaC;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el nombre del Estudiante");
        nombreEst = teclado.next();
        System.out.println("Ingresar Primera Calificacion del Estudiante");
        praC = teclado.nextDouble();
        System.out.println("Ingresar Segunda Calificacion del Estudiante");
        sdaC = teclado.nextDouble();
        System.out.println("Ingresar Tercera Calificacion del Estudiante");
        traC = teclado.nextDouble();
        System.out.println("Ingresar Cuarta Calificacion del Estudiante");
        ctaC = teclado.nextDouble();
        System.out.println("El estudiante "+nombreEst+" tiene un promedio "+rangoCalificaciones(praC, sdaC, traC, ctaC));
    }
    public static String rangoCalificaciones(double praC, double sdaC, double traC, double ctaC) {
        String rango = "";
        double promedio;
        promedio = (praC*0.25)+(sdaC*0.25)+(traC*0.25)+(ctaC*0.25);
        if (promedio >= 0 && promedio <= 5)
            rango = "Regular";
        else if (promedio >= 5.1 && promedio <= 8)
            rango = "Bueno";
        else if (promedio >= 8.1 && promedio <= 9)
            rango = "Muy Bueno";
        else if (promedio >= 9.1 && promedio <= 10)
            rango = "Sobresaliente";
        return rango;
    }
}
//Desarrollado por Manuel Gomez

/*

Ingresar el nombre del Estudiante
Juan
Ingresar Primera Calificacion del Estudiante
10
Ingresar Segunda Calificacion del Estudiante
9
Ingresar Tercera Calificacion del Estudiante
8
Ingresar Cuarta Calificacion del Estudiante
9.5
El estudiante Juan tiene un promedio Sobresaliente

*/