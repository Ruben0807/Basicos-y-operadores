package es.unileon.prg.tema5;

import java.io.BufferedInputStream;
import java.util.Scanner;


public class Teclado{

    private static Scanner stdin = new Scanner(new BufferedInputStream(System.in));
    
    /**
     * Lee una linea por consola.
     *
     *
     * @return String Una linea con el comando.
     */
    public static String leerLinea() {
        String linea = "";

        if (stdin.hasNext()) {
            linea = stdin.nextLine();
        }
        
        System.out.println(linea);
        
        return linea;
    }
    
}
