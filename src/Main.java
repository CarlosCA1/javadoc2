import java.util.Scanner;

/**
 * Prueba y documentación de funciones.
 * @version 1.0
 * @author Carlos Costas
 */
public class Main {
    /**
     * Método principal, entrada de la aplicación
     * @param args no usados
     */

    public static void main(String[] args) {
        cuenta_letras("hola", "mundo");
        //pide el primer número
        int primerNum = obtenerNumero("Dame el primer número");
        //pide el segundo número
        int segundoNum = obtenerNumero("Dame el segundo número");
    }

    /**
     * Cuenta la totalidad de las letras de <strong>dos</strong> palabras
     * @since v1.0
     * @param palabra1 palabra a contar caracteres
     * @param palabra2 palabra a contar caracteres
     * @return número de caracteres totales
     */
    static int cuenta_letras(String palabra1, String palabra2) {
        int totales = palabra1.length() + palabra2.length();
        return 0;
    }

    /**
     * Pide un número introducido por teclado
     * @param msg
     * @return Número introducido por teclado
     */
    static int obtenerNumero(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un número");
        int numero = sc.nextInt();
        return numero;
    }
}