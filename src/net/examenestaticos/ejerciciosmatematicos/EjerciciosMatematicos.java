package net.examenestaticos.ejerciciosmatematicos;

public class EjerciciosMatematicos {
    private static final int PRIMERA_POSICION = 0;
    private static final int SEGUNDA_POSICION = 1;
    private static final int PRIMER_NUM_FIBONACCI = 0;
    private static final int SEGUNGO_NUM_FIBONACCI = 1;
    public static int factorialDeN(int num){
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
    public static int mediaHastaN(int num){
        String msg = "El numero que ha introducido no es positivo...";
        if(num > 0){
            int total = 1;
            for (int i = 0; i <= num ; i++) {
                total += i;
            }
            return total / num;
        }else{
            System.out.println(msg);
        }
        return 0;

    }
    public static String obtenerPasosFibonacci(int num){
        String msg = "";
        int suma;
        if (num > 0){
            int[] arrayNum = new int[num];
            if(num == 1){
                arrayNum[PRIMERA_POSICION] = PRIMER_NUM_FIBONACCI;
            }else if (num == 2){
                arrayNum[PRIMERA_POSICION] = PRIMER_NUM_FIBONACCI;
                arrayNum[SEGUNDA_POSICION] = SEGUNGO_NUM_FIBONACCI;
            }else{
                arrayNum[PRIMERA_POSICION] = PRIMER_NUM_FIBONACCI;
                arrayNum[SEGUNDA_POSICION] = SEGUNGO_NUM_FIBONACCI;
                for (int i = 2; i < num; i++) {
                    suma = arrayNum[i-2] + arrayNum[i-1];
                    arrayNum[i] = suma;
                }
            }
            for (int numero : arrayNum) {
                msg += numero + ",";
            }
            msg += "\b.";
        }else{
            msg = "El numero que ha introducido no es positivo...";
        }
        return msg;
    }
}
