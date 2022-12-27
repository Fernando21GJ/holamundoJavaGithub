/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ferna
 */
import java.io.*;

public class ReverseCase {

    public static void main(String[] args) {

        String message = "este es un string de prueba";
        String convertMessage = message.toUpperCase();

        char[] charArray = convertMessage.toCharArray();
        boolean foundSpace = true;

        for (int i = 0; i < charArray.length; i++) {
            System.out.print(charArray[i]);
            if (Character.isLetter(charArray[i])) {
                if (foundSpace) {
                    charArray[i] = Character.toLowerCase(charArray[i]);
                    foundSpace = false;
                }
            } else {
                foundSpace = true;
            }
        }
        message = String.valueOf(charArray);
        System.out.println("\n");
        System.out.println(message);
    }
}
