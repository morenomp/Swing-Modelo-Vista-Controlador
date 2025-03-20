package MiLibreria;

import Model.*;
import java.util.Scanner;

//Con MyAPI nos referimos a nuestra propia libreria

public class MyAPI {
    
/**
     * 
     * @param min introducimos el número mínimo
     * @param max introducimos el número máximo
     * @param msg introducimos un mensaje
     * @return retornará el numero del usuario
     */
    
    public static int askForIntBetween(int min, int max, String msg) {
        
        Scanner consola = new Scanner(System.in);
        //inicializamos lo que será el numero introducido por el usuario
        int numb;

        do {
            
            System.out.println(msg);
            
            try {
                
                numb = consola.nextInt();
                
                //SI el numero está entre los delimitados
                if (numb >= min && numb <= max) {
                    
                    //nos devolverá el numero (que llamará al caso correspondiente)
                    return numb;
                    
                } else {
                    
                    //SI NO nos devolverá el siguiente mensaje
                    System.out.println("[X] Introduzca un numero entre " + min + " y " + max);
                    
                }
            } catch (Exception e) {
                
                e.printStackTrace(); // para que nos imprima directamente el error
                System.out.println("[catch] Valor incorrecto. Introduzca un numero entre " + min + " y " + max);
                consola.nextLine(); // para romper el bucle
                
            }
        } while (true);
    }

//-------------------------
    
    /**
     * todos los casos siguientes tienen los mismos parámetros
     * @param msg introducimos un mensaje
     * @param error introducimos un mensaje de error
     * @return retornará el valor introducido por el usuario, una vez pasado por los "filtros"
     */
    
    //creamos notString para verificar que el contenido introducido es un string
    //PROBLEMA: Si el usuario pone cualquier cosa incluyendo cosas como numeros, 
    //simbolos o espacios las aceptará
    public static String notString(String msg, String error) {
        
        Scanner consola = new Scanner(System.in);
        String s;
        
        do {
            
            System.out.println(msg); //llamará al mensaje inicial
            s = consola.nextLine();
            
            if (s.isEmpty()) { //pero antes verificará
                
                System.out.println(error); //SI NO es igual llamará al mensaje de error
            }          
            
        } while (s.isEmpty());
        
        return s;
    }
    
    //creamos notInt para verificar que el contenido introducido es un entero
    public static Integer notInt(String msg, String error) {
        
        Scanner consola = new Scanner(System.in);
        int s = 0;
        int num = 0;
        boolean exit = false;

        do {
            try {
                System.out.println(msg); //llamará al mensaje inicial
                s = consola.nextInt();

                if (s >= num) { //SI piloto es mayor o igual a 0, será correcto

                    exit = true;

                } else{

                    System.out.println(error); //SI NO es igual llamará al mensaje de error

                }   
            } catch (Exception e) {
                
                System.out.println("[X] Introduce un numero entero ");
                consola.nextLine();
            }
        } while (!exit);
        
        return s;
    }
    
    //creamos notDouble para verificar que el contenido introducido es un numero
    public static Double notDouble(String msg, String error) {
        
        Scanner consola = new Scanner(System.in);
        double s = 0.0;
        double num = 0;
        boolean exit = false;

        do {
            try {
                System.out.println(msg); //llamará al mensaje inicial
                s = consola.nextDouble();

                if (s >= num) { //SI piloto es mayor o igual a 0, será correcto

                    exit = true;

                } else{

                    System.out.println(error); //SI NO es igual llamará al mensaje de error

                }
            } catch (Exception e) {
                
                System.out.println("[X] Introduce un numero correcto ");
                consola.nextLine();
            }
        } while (!exit);
        
        return s;
    }
    
    //creamos notBoolean para verificar que el contenido introducido es true o false
    public static Boolean notBoolean(String msg, String error) {
        
        Scanner consola = new Scanner(System.in);
        boolean s = false;
        boolean exit = false;

        do {
            System.out.println(msg); //llamará al mensaje inicial
            String userText = consola.nextLine();
            
            if (userText.equalsIgnoreCase("true")) { //SI piloto está activo(true) seguirá el programa
                
                s = true;
                exit = true;
                
            } else if (userText.equalsIgnoreCase("false")) { //SI piloto NO está activo(false) seguirá el programa
                
                s = false;
                exit = true;
                
            } else{ //SI NO es niguna de la anteriores, es que el usuario puso algo diferente a lo pedido
                    //y el programa dará error
                
                System.out.println(error); //llamará al mensaje de error
                //exit = false; //volverá a pedir un parametro, ya que interpretará que el usuario se 
                              //equivocó al escribir
                
            }           
        } while (!exit);
        
        return s;
    }
    
//-------------------------
    
    /**
     * 
     * Verifica y solicita al usuario un tipo de clima (frío, cálido o templado)
     * Es un verificador basicamente (al igual que el resto)
     * 
     * @param msg
     * @param error
     * @return 
     */
    
    //creamos verifyClimeString para verificar los datos  del CLIMA 
    public static String verifyClimeString(String msg, String error) {
        
        Scanner consola = new Scanner(System.in);
        String text;
        boolean exit = false;
        
        do{
            //preguntaremos al usuario
            System.out.println(msg);

            text = consola.nextLine();

            //SI pone "frio" 
            if (text.equalsIgnoreCase("frio")) {

                exit = true;
                
            //SI pone "calido" 
            } else if(text.equalsIgnoreCase("calido")){
                
                exit = true;
            
            //SI pone "templado" 
            } else if (text.equalsIgnoreCase("templado")) {
                
                exit = true;
                
            //SI NO es nada de lo anterior 
            } else{
                
                
                //algo a resaltar es el hecho de que no hace falta poner notString
                //ya que si detecta que nlo introducido no es ninguna de las 
                //opciones de arriba, dará error directamente
                System.out.println(error);
            }
        } while(!exit);
        
        return text;
    }

    /**
     * 
     * Verifica y solicita al usuario un género (masculino o femenino)
     * 
     * @param msg
     * @param error
     * @return 
     */
    
    //creamos verifyGeneroString para verificar los datos del GENERO 
    public static String verifyGeneroString(String msg, String error) {
        
        Scanner consola = new Scanner(System.in);
        String text;
        boolean exit = false;
        
        do{
            //preguntaremos al usuario
            System.out.println(msg);

            text = consola.nextLine();

            //SI pone "masculino" 
            if (text.equalsIgnoreCase("masculino")) {

                exit = true;
                
            //SI pone "femenino" 
            } else if(text.equalsIgnoreCase("femenino")){
                
                exit = true;
            
            //SI NO es nada de lo anterior 
            } else{
                
                
                //algo a resaltar es el hecho de que no hace falta poner notString
                //ya que si detecta que nlo introducido no es ninguna de las 
                //opciones de arriba, dará error directamente
                System.out.println(error);
            }
        } while(!exit);
        
        return text;
    }

    /**
     * 
     * Verifica y solicita al usuario un rango (entrenador, defensor, luchador o caballero)
     * 
     * @param msg
     * @param error
     * @return 
     */
    
    //creamos verifyRangeString para verificar los datos del RANGO 
    public static String verifyRangeString(String msg, String error) {
        
        Scanner consola = new Scanner(System.in);
        String text;
        boolean exit = false;
        
        do{
            //preguntaremos al usuario
            System.out.println(msg);

            text = consola.nextLine();

            //SI pone "entrenador" 
            if (text.equalsIgnoreCase("entrenador")) {

                exit = true;
                
            //SI pone "defensor" 
            } else if(text.equalsIgnoreCase("defensor")){
                
                exit = true;
            
            //SI pone "luchador" 
            } else if (text.equalsIgnoreCase("luchador")) {

                exit = true;
                
            //SI pone "caballero" 
            } else if (text.equalsIgnoreCase("caballero")) {

                exit = true;
                
            //SI NO es nada de lo anterior 
            } else{
                
                
                //algo a resaltar es el hecho de que no hace falta poner notString
                //ya que si detecta que nlo introducido no es ninguna de las 
                //opciones de arriba, dará error directamente
                System.out.println(error);
            }
        } while(!exit);
        
        return text;
    }

    /**
     * 
     * Verifica y solicita al usuario que ingrese un valor entre (flora o peces)
     * 
     * @param msg
     * @param error
     * @return 
     */
    
    //creamos verifyFloraOrFishString para verificar los datos del ALIMENTO 
    public static String verifyFloraOrFishString(String msg, String error) {
        
        Scanner consola = new Scanner(System.in);
        String text;
        boolean exit = false;
        
        do{
            //preguntaremos al usuario
            System.out.println(msg);

            text = consola.nextLine();

            //SI pone "flora" 
            if (text.equalsIgnoreCase("flora")) {

                exit = true;
                
            //SI pone "peces" 
            } else if(text.equalsIgnoreCase("peces")){
                
                exit = true;
            
            //SI NO es nada de lo anterior 
            } else{
                
                
                //algo a resaltar es el hecho de que no hace falta poner notString
                //ya que si detecta que nlo introducido no es ninguna de las 
                //opciones de arriba, dará error directamente
                System.out.println(error);
            }
        } while(!exit);
        
        return text;
    }

//-------------------------
    
}
