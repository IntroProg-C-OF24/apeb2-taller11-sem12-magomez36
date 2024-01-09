package taller.pkg11.introprog.manuel.gomez;
public class ValoresMatriz_Problema01 {
    public static void main(String[] args) {
        int numF = 4, numC = 4;
        int matriz[][] = new int [numF][numC];
        generarMatriz(matriz, numF, numC);
        System.out.println("LA MATRIZ GENERADA ES : \n"+devolverMatriz(matriz, numF, numC));
        System.out.println("LOS NUMEROS PARES DE LA MATRIZ SON: \n"+numerosPares(matriz, numF, numC));
        System.out.println("LOS NUMEROS IMPARES DE LA MAGTRZ SON: \n"+numerosImpares(matriz, numF, numC));
        System.out.println("EL PROMEDIO DE LA MATRIZ ES: \n"+promedioMatriz(matriz, numF, numC));
    }
    public static void generarMatriz(int matriz[][], int numF, int numC){
        for (int i = 0; i < numF; i++) 
            for (int j = 0; j < numC; j++) 
                matriz[i][j] = (int)(Math.random()*99+1);
    }
    public static String devolverMatriz(int matriz[][], int numF, int numC){
        String cadena = "";
        for (int i = 0; i < numF; i++) {
            for (int j = 0; j < numC; j++) 
                cadena += String.format("%d\t", matriz[i][j]);
            cadena += "\n";
        }
        return cadena;
    }
    public static String numerosPares(int matriz[][], int numF, int numC){
        String cadena = "";
        for (int i = 0; i < numF; i++) {
            for (int j = 0; j < numC; j++) 
                if ((matriz[i][j] % 2) == 0)
                    cadena += String.format("%d\t", matriz[i][j]);
        }
        return cadena;
    }
    public static String numerosImpares(int matriz[][], int numF, int numC){
        String cadena = "";
        for (int i = 0; i < numF; i++) {
            for (int j = 0; j < numC; j++) 
                if ((matriz[i][j] % 2) != 0)
                    cadena += String.format("%d\t", matriz[i][j]);
        }
        return cadena;
    }
    public static double promedioMatriz(int matriz[][], int numF, int numC){
        double promedio, suma = 0;
        for (int i = 0; i < numF; i++) 
            for (int j = 0; j < numC; j++)
                suma = (suma + matriz[i][j]);
        promedio = suma / (numF*numC);
        return promedio;
    }
}
//Desarrollado por Manuel Gomez

/* EJEMPLO:

LA MATRIZ GENERADA ES : 
69	83	66	6	
94	74	68	46	
91	51	51	82	
73	87	73	70	

LOS NUMEROS PARES DE LA MATRIZ SON: 
66	6	94	74	68	46	82	70

LOS NUMEROS IMPARES DE LA MAGTRZ SON: 
69	83	91	51	51	73	87	73	

EL PROMEDIO DE LA MATRIZ ES: 
67.75

*/