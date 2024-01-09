package taller.pkg11.introprog.manuel.gomez;
import java.util.Scanner;
public class AreaFiguraGeometrica_Problema02 {
    public static void main(String[] args) {
        int num;
        double baseT, alturaT, ladoC, baseR, alturaR, areaF = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cual es la Figura que desea calcular?");
        System.out.println("1 ---> Cuadrado");
        System.out.println("2 ---> Triangulo");
        System.out.println("3 ---> Rectangulo");
        num = teclado.nextInt();
        if (num == 1) {
            System.out.println("Ingrese la medida de uno de los lados del Cuadrado");
            ladoC = teclado.nextDouble();
            areaF = obtenerAreaCuadadrado(ladoC);
        }
        else if (num == 2) {
            System.out.println("Ingrese la medida de la base del Triangulo");
            baseT = teclado.nextDouble();
            System.out.println("Ingrese la medida de la altura del Triangulo");
            alturaT = teclado.nextDouble();
            areaF = obtenerAreaTriangulo(baseT, alturaT);
        }else if (num == 3) {
            System.out.println("Ingrese la medida de la base del Rectangulo");
            baseR = teclado.nextDouble();
            System.out.println("Ingrese la medida de la altura del Rectangulo");
            alturaR = teclado.nextDouble();
            areaF = obtenerAreaCuadadrado(baseR, alturaR);
        }      
        System.out.println("El Area de la Figura es "+areaF);
    }
    public static double obtenerAreaCuadadrado(double ladoC){
        double areaF;
        areaF = ladoC * ladoC;
        return areaF;
    }
    public static double obtenerAreaCuadadrado(double baseR, double alturaR){
        double areaF;
        areaF = baseR * alturaR;
        return areaF;
    }
    public static double obtenerAreaTriangulo(double baseT, double alturaT){
        double areaF;
        areaF = (baseT*alturaT) / 2;
        return areaF;
    }
}
//Desarrollado por Manuel Gomez

/*

Cual es la Figura que desea calcular?
1 ---> Cuadrado
2 ---> Triangulo
3 ---> Rectangulo
2
Ingrese la medida de la base del Triangulo
10
Ingrese la medida de la altura del Triangulo
8
El Area de la Figura es 40.0

*/