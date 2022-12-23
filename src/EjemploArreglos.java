
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ferna
 */
public class EjemploArreglos {
    public static void main(String[] args) {
        
        String[] productos = new String[7];
        productos[0] = "Kingston Pendrive Usb";
        productos[1] = "Samsung Galaxy";
        productos[2] = "Disco duro SSD Samsung";
        productos[3] = "Asus Notebook";
        productos[4] = "Macbook Air";
        productos[5] = "Chromecast 4ta generacion";
        productos[6] = "Bicicleta oxford";
        
        Arrays.sort(productos);
        
        
        System.out.println("productos[0] = " + productos[0] );
        System.out.println("productos[1] = " + productos[1] );
        System.out.println("productos[2] = " + productos[2] );
        System.out.println("productos[3] = " + productos[3] );
        System.out.println("productos[4] = " + productos[4] );
        System.out.println("productos[5] = " + productos[5] );
        System.out.println("productos[6] = " + productos[6] ); 
        int[] numeros = new int[4];
        
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = (int) 3L;
        numeros[3] = 4;
       // numeros[4] = 5;
       Arrays.sort(numeros);
        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[numeros.length -1];
        
        
        System.out.println("I = " + i);
        System.out.println("J  = " + j);
        System.out.println("K  = " + k);
        System.out.println("L  = " + l);
    }
    
}
