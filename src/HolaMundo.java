//Mi clase en Java
public class HolaMundo {
    public static void main(String args[]){
        //System.out.println("Hola Mundo desde java ");
        int myVariable = 10;
        System.out.println(myVariable);
        //Modificar el valor de la variable
        myVariable = 5;
        System.out.println(myVariable);
        
        String myVariableString = "adsdfd";
        System.out.println(myVariableString);
        
        myVariableString = "Adios";
        System.out.println(myVariableString);
        
        //var - inferencia de tipos en java
        var mYsecondVariable = 15;
        System.out.println(mYsecondVariable);
        
        var myVariableString2 = "jajaxD";
        System.out.println("miVariable" + myVariableString2);
        System.out.println("myVariableString2 = " + myVariableString2);
        
        //Valores permitidos en el nombre de variables
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        //var áVariable = 10; No se recomiendo utilizar
        //var #Variable = 2; no se permite utilizar caracteres especiales
    }
}
