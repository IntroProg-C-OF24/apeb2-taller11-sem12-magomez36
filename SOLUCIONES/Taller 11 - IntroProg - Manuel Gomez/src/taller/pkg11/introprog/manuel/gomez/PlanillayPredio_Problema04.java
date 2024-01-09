package taller.pkg11.introprog.manuel.gomez;
import java.util.Scanner;
public class PlanillayPredio_Problema04 {
    public static void main(String[] args) {
        int num;
        String nomCliente, cedula;
        double valorkW, numkW, valorInmueble, valor;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresar el nombre del cliente");
        nomCliente = teclado.next();
        System.out.println("Ingresar la cedula del cliente");
        cedula = teclado.next();
        System.out.println("Que necesita calcular?");
        System.out.println("1 ---> valor de la planilla de luz");
        System.out.println("2 ---> valor el valor del predio de un bien Inmueble");
        num = teclado.nextInt();
        if (num == 1){
            System.out.println("Ingresar el numero de Kilovatios del mes");
            numkW = teclado.nextDouble();
            System.out.println("Ingresar el valor del Kilovatio");
            valorkW = teclado.nextDouble();
            valor = calcularValorLuz(valorkW, numkW);
            System.out.printf("%s con cedula %s debe cancelar el valor de $%.2f. \n",nomCliente,cedula,valor);
        }
        else if (num == 2){
            System.out.println("Ingresar el valor del Inmueble");
            valorInmueble = teclado.nextInt();
            valor = calcularPredio(valorInmueble);
            System.out.printf("%s con cedula %s tiene un bien inmueble valorado en $%.0f y tiene que pagar de predio $%.2f. \n",nomCliente,cedula,valorInmueble,valor);
        }
    }
    public static double calcularValorLuz(double valorkW,double numkW){
        double valorPlanilla;
        valorPlanilla = valorkW * numkW;
        return valorPlanilla;
    }
    public static double calcularPredio(double valorInmueble){
        double predio;
        predio = (valorInmueble*2) / 100;
        return predio;
    }
}
//Desarrollado por Manuel Gomez

/*

Ingresar el nombre del cliente
Juan
Ingresar la cedula del cliente
1104928447
Que necesita calcular?
1 ---> valor de la planilla de luz
2 ---> valor el valor del predio de un bien Inmueble
2
Ingresar el valor del Inmueble
50000
Juan con cedula 1104928447 tiene un bien inmueble valorado en $50000 y tiene que pagar de predio $1000.00. 

*/