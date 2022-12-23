
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


public class Primes {
    
    public static boolean esPrimo(int numero){
            boolean primo=true;
    int cantDivisores=0;
    for(int i=2;i<numero;i++){
        if(numero%i==0){
            cantDivisores++;
        }
    }
    if(cantDivisores>0){
        primo =false;
    }else{
        primo =true;
    }
    return primo;
    }
    public static void main(String args[]){
         //instanciamos la clase scanner
    Scanner teclado = new Scanner(System.in);
    //pedimos el número hasta el que deseamos conocer los primero
    System.out.print("Hasta que número desea saber los números primos: ");
    //recogemos el número en la variable entera
    int max = teclado.nextInt();
    int acumulador = 0;
    Stack<Integer> bucket = new Stack<Integer>();
    //imrpimimos el texto
    System.out.println("Son números primos: ");
    //creamos un bucle for con el límite del número introducido
    for(int i = 2; i <=100; i++){
        //recogemos en una variable booleana el return del método esPrimo y enviamos el número
        //correpondiente a la iteración del bucle
        //boolean primo = esPrimo(i);
        //si el return es primo, lo sacamos por pantalla
        if(max!=bucket.size()){
             if (esPrimo(i)){
            //System.out.println(i);
            bucket.push(i);
            acumulador++;
        }
        }

    }
    //System.out.println("");
      System.out.println(bucket);
       // System.out.println(bucket.size());
    }
}
