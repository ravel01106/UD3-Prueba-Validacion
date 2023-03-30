import net.examenestaticos.ejerciciosmatematicos.EjerciciosMatematicos;

import java.util.Scanner;

public class MainEjerciciosMatematicos {
    public static void main(String[] args) {
        final Scanner TECLADO = new Scanner(System.in);
        String msg = "Escribe un numero:";
        int num;
        final int NUMERO_POR_DEFECTO = 7;
        System.out.println(msg);
        try{
            num = Integer.parseInt(TECLADO.nextLine());
        }catch (NumberFormatException e){
            msg = "Como eres especialito y no me pones el número bien, vamos a ponerte por defecto el número 7.";
            System.out.println(msg);
            num = NUMERO_POR_DEFECTO;
        }
        msg = "El numero es " + num + ".\n";
        msg += "El resultado de la factorización es:  " + EjerciciosMatematicos.factorialDeN(num) + "\n";
        msg += "---------------------------------------------------\n";
        msg += "El resultado de la media es:  " + EjerciciosMatematicos.mediaHastaN(num) + "\n";
        msg += "---------------------------------------------------\n";
        msg += "El resultado de los pasos de Fibonacci es: " + EjerciciosMatematicos.obtenerPasosFibonacci(num);
        System.out.println(msg);
    }
}
