package es.unileon.prg.tema5;

/**
 * Clase con los ejercicios correspondientes a cadenas de caracteres.
 * La clase "String"
 *
 * @author PRG
 * @version 1.0
 */
    public class Apartado030201 extends Apartado {
   
       protected String obtenerPractica(){
         return "P-VAR";
      }
   
       protected String obtenerBloque() {
         return "Cadenas de caracteres - Clase <<String>>";
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio1.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Obtener el numero de caracteres de la cadena.
    *	Calcular la posicion intermedia de la cadena.
    *	Extraer el caracter que ocupa dicha posicion.
    *	Mostrar por pantalla dicho caracter y el codigo que lo representa.
    */
       public void ejercicio01() {
         cabecera("01","");
         String cadena = "En un lugar de la Mancha";
        // Inicio modificacion
        int numeroCaracteres=cadena.length();
        int posicionIntermedia=cadena.length()/2;
        int caracterIntermedio=cadena.charAt(posicionIntermedia);
        System.out.println("Caracter intermedio: "+(char)caracterIntermedio);
        System.out.println("Codigo que representa el caracter: "+caracterIntermedio);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio2.
    *
    * </br>
    *
    *	Comparar las dos cadenas para ver si son iguales y mostrar por pantalla el resultado de la comparacion.
    * Volver a compararlas pero ahora sin tener en cuenta si estan en mayusculas o minusculas y mostrar por pantalla el resultado de la comparacion.
    *	Convertir las dos cadenas a minusculas, volver a compararlas y mostrar por pantalla el resultado de la comparacion.
    *
    */
       public void ejercicio02() {
         cabecera("02", "");
         String cadena = "Viaje al Parnaso";
         String otraCadena = "ViAje al pArnaso";
      // Inicio modificacion
         boolean comparacion1=cadena.equals(otraCadena);
         System.out.println("Resultado de la comparacion1: "+comparacion1);
         boolean comoparacion2=cadena.equalsIgnoreCase(otraCadena);
         System.out.println("Resultado de la comparacion2: "+comparacion2);
         cadena=cadena.toLowerCase();
         otraCadena=otraCadena.toLowerCase();
         boolean comparacion3=cadena.equals(otraCadena);
         System.out.println("Resultado de la comparacion3: "+comparacion3);
      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio3.
    *
    * </br>
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Concatenar las dos cadenas formando una tercera usando el operador +
    * Concatenar las dos cadenas formando una tercera usando el metodo concat
    * Mostrar los resultados por pantalla.
    */
       public void ejercicio03() {
         cabecera("03", "");
      
         String cadena = "Viaje al Parnaso";
         String otraCadena = "Persiles y Segismunda";
      // Inicio modificacion
         String concatenacion1=cadena+otraCadena;
         System.out.println("Concatenación usando +: "+concatenacion1);
         String concatenacion2=cadena.concat(otraCadena);
         System.out.println("Concatenación usando concat: "+concatenacion2);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio4.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Comprobar si la cadena termina con la palabra Parnaso utilizando endsWith.
    * Comprobar si la cadena empieza con la palabra Viaje utilizando startsWith.
    * Mostrar los resultados por pantalla.
    */
       public void ejercicio04() {
         cabecera("04", "");
         String cadena = "Viaje al Parnaso";
        // Inicio modificacion
        boolean termina=cadena.endsWith("Parnaso");
        System.out.println("Terminación de la cadena: "+termina);
        boolean empieza=cadena.startsWith("Viaje");
        System.out.println("Principio de la cadena: "+empieza);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio5.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes busquedas en cadena utilizando indexOf:
    * Buscar si el caracter p esta en la cadena y mostrar el resultado por pantalla.
    * Buscar si la cadena Par esta en la cadena y mostrar el resultado por pantalla.
    * Buscar la ultima ocurrencia de la letra a en la cadena y mostrar el resultado por pantalla.
    * Buscar la letra a empezando por la posicion 3 y mostrar el resultado por pantalla.
    */
       public void ejercicio05() {
         cabecera("05","");
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
         int posicion_p=cadena.indexOf('p');
         System.out.println("Posición de la letra p: "+posicion_p);
         int posicion_Par=cadena.indexOf("Par");
         System.out.println("Posición de la cadena Par: "+posicion_Par);
         int ultima_a=cadena.lastIndexOf('a');
         System.out.println("Última posicion de la letra a: "+ultima_a);
         int posicion_a=cadena.indexOf('a', 3);
         System.out.println("Posición de la letra a empezando desde la posición 3: "+posicion_a);
        // Fin modificacion  
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio6.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    *	Reemplazar las ocurrencias de la letra a por * y mostrar el resultado por pantalla.
    * Reemplazar las ocurrencias de la palabra Parnaso por Olimpo y mostrar en resultado por pantalla
    */
       public void ejercicio06() {
         cabecera("06", "");
      
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
         String reemplazo_a=cadena.replace('a', '*');
         System.out.println("Reemplazo de la letra a por *: "+reemplazo_a);
         String reemplazo_string=cadena.replace("Parnaso", "Olimpo");
         System.out.println("Reemplazo de la palabra Parnaso por Olimpo: "+reemplazo_string);
      // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio7.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario para realizar las siguientes tareas:
    * Obtener la subcadena que va desde la mitad al final.
    * Obtener la subcadena que empieza en la primera j y termina antes de la primera s
    */
       public void ejercicio07() {
         cabecera("07", "");
         String cadena = "Viaje al Parnaso";
      // Inicio modificacion
         String subcadena_mitad=cadena.substring(cadena.length()/2);
         System.out.println("Subcadena desde la mitad: "+subcadena_mitad);   
         String subcadena_js=cadena.substring(cadena.indexOf('j'), cadena.indexOf('s'));
         System.out.println("Subcadena desde la primera j hasta la primera s: "+subcadena_js);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio8.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario quitar los espacios sobrantes al principio y al final.
    */
       public void ejercicio08() {
         cabecera("08", "");
         String cadena = " La Galatea   ";
      // Inicio modificacion
         String cadenaSinEspacios=cadena.trim();
         System.out.println("Cadena sin espacios: "+cadenaSinEspacios);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio9.
    *
    * </br>
    *
    * Se pide anyadir el codigo necesario convertir las variables a String utilizando el metodo valueOf. Mostrar el resultado por pantalla.
    */
       public void ejercicio09() {
         cabecera("09", "");
         double numero = 1.12e12;
         boolean expresion = true;
         long enteroGrande = 1231231L;
      // Inicio modificacion
         String numeroS=String.valueOf(numero);
         String expresionS=String.valueOf(expresion);
         String enteroGrandeS=String.valueOf(enteroGrande);
         System.out.println("Numero como String: "+numeroS);
         System.out.println("Expresion como String: "+expresionS);
         System.out.println("Entero grande como String: "+enteroGrandeS);
        // Fin modificacion
      }
   
   /**
    * Cadenas de caracteres - Clase <<String>> - Ejercicio10.
    *
    * </br>
    *
    * Se pide compara las dos cadenas lexicograficamente y mostrar el resultado por pantalla.
    */
       public void ejercicio10() {
         cabecera("10", "");
         String cadena = "Viaje al Parnaso";
         String otraCadena = "Viaje al Olimpo";
      // Inicio modificacion
         int comparacion=cadena.compareTo(otraCadena);
         System.out.println("Comparación lexicográfica: "+comparacion);
        // Fin modificacion
      }
   }
