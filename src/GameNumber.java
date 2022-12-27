
import java.util.Scanner;
import java.util.Stack;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ferna
 */
public class GameNumber {

    public static boolean isPrime(int numberPrime) {
        boolean prime = true;
        int dividedCount = 0;
        for (int i = 2; i < numberPrime; i++) {
            if (numberPrime % i == 0) {
                dividedCount++;
            }
        }
        if (dividedCount > 0) {
            prime = false;
        } else {
            prime = true;
        }
        return prime;
    }

    public static boolean isPair(int numberPair) {
        return numberPair % 2 == 0;
    }

    public static boolean isNotPair(int numberNotPair) {
        return numberNotPair % 2 != 0;
    }

    public static void main(String args[]) {
        //instanciamos la clase scanner
        Scanner teclado = new Scanner(System.in);
        //pedimos el número hasta el que deseamos conocer los primero
        System.out.print("Hasta que número desea saber los números primos: ");
        //recogemos el número en la variable entera
        int max = teclado.nextInt();
        int saving = 0;
        Stack<Integer> bucket = new Stack<>();
        Stack<Integer> bucket2 = new Stack<>();
        Stack<Integer> bucket3 = new Stack<>();
        //imrpimimos el texto
        //creamos un bucle for con el límite del número introducido
        for (int i = 2; i <= 100; i++) {
            //recogemos en una variable booleana el return del método esPrimo y enviamos el número
            //correpondiente a la iteración del bucle
            //boolean primo = esPrimo(i);
            //si el return es primo, lo sacamos por pantalla
            if (max != bucket.size()) {
                if (isPrime(i)) {
                    //System.out.println(i);
                    bucket.push(i);
                    saving++;
                }
            }
        }
        for (int j = 1; j <= 100; j++) {
            if (max != bucket2.size()) {
                if (isPair(j)) {
                    bucket2.push(j);
                    saving++;
                }
            }
        }
        for (int k = 1; k <= 100; k++) {
            if (max != bucket3.size()) {
                if (isNotPair(k)) {
                    bucket3.push(k);
                    saving++;
                }
            }
        }
        //System.out.println("");
        System.out.println("Son numeros Primos :" + "  " + bucket);
        System.out.println("Son numeros Pares :" + "  " + bucket2);
        System.out.println("Son numeros Impares :" + "  " + bucket3);
        // System.out.println(bucket.size());
    }
}
