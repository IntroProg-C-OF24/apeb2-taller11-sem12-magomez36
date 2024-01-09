package taller.pkg11.introprog.manuel.gomez;
public class CalculadoraMatrices_Problema05 {
    public static void main(String[] args) {
        int limF = 3, limC = 3;
        int matriz1[][] = new int [limF][limC];
        int matriz2[][] = new int [limF][limC];
        int matriz3[][] = new int [limF][limC];
        int matriz4[][] = new int [limF][limC];
        int matriz5[][] = new int [limF][limC];
        generarMatriz(matriz1, limF, limC);
        generarMatriz(matriz2, limF, limC);
        System.out.println("LA MATRIZ 1 GENERADA ES : \n"+devolverMatriz(matriz1, limF, limC));
        System.out.println("LA MATRIZ 2 GENERADA ES : \n"+devolverMatriz(matriz2, limF, limC));
        sumaMatriz(matriz1, matriz2, matriz3, limF, limC);
        System.out.println("LA SUMA DE MATRICES ES: \n"+devolverMatriz(matriz3, limF, limC));
        restaMatriz(matriz1, matriz2, matriz4, limF, limC);
        System.out.println("LA RESTA DE MATRICES ES: \n"+devolverMatriz(matriz4, limF, limC));
        multiplicacionMatriz(matriz1, matriz2, matriz5, limF, limC);
        System.out.println("LA MULTIPLICACION DE MATRICES ES: \n"+devolverMatriz(matriz5, limF, limC));
    }
    public static void generarMatriz(int matriz[][], int limF, int limC){
        for (int i = 0; i < limF; i++) 
            for (int j = 0; j < limC; j++) 
                matriz[i][j] = (int)(Math.random()*(9-0+1)+0);
    }
    public static String devolverMatriz(int matriz[][], int limF, int limC){
        String cadena = "";
        for (int i = 0; i < limF; i++) {
            for (int j = 0; j < limC; j++) 
                cadena += String.format("%d\t", matriz[i][j]);
            cadena += "\n";
        }
        return cadena;
    }
    public static void sumaMatriz(int matrizA[][], int matrizB[][], int matrizC[][], int limF, int limC){
        for (int i = 0; i < limF; i++) 
            for (int j = 0; j < limC; j++) 
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
    }
    public static void restaMatriz(int matrizA[][], int matrizB[][], int matrizD[][], int limF, int limC){
        for (int i = 0; i < limF; i++) 
            for (int j = 0; j < limC; j++) 
                matrizD[i][j] = (matrizA[i][j]) - (matrizB[i][j]);
    }
    public static void multiplicacionMatriz(int matrizA[][], int matrizB[][], int matrizE[][], int limF, int limC){
        for (int i = 0; i < limF; i++) 
            for (int j = 0; j < limC; j++) 
                matrizE[i][j] = (matrizA[i][j]) * (matrizB[i][j]);
    }
}
//Desarrollado por Manuel Gomez

/*

LA MATRIZ 1 GENERADA ES : 
1	7	7	
5	6	6	
5	4	4	

LA MATRIZ 2 GENERADA ES : 
7	0	5	
5	9	3	
4	0	9	

LA SUMA DE MATRICES ES: 
8	7	12	
10	15	9	
9	4	13	

LA RESTA DE MATRICES ES: 
-6	7	2	
0	-3	3	
1	4	-5	

LA MULTIPLICACION DE MATRICES ES: 
7	0	35	
25	54	18	
20	0	36	

*/