/*===================================================================*
 * Encuentra el error: Función impares                               *
 *                                                                   *
 * Descripción: El método 'esImpar' tiene por objetivo regresar true *
 * si recive un entero impar y false en caso contrario.              *
 * Dicho método, sin embargo, falla en reconocer                     *
 * correctamente a practicamente la mitad de los                     *
 * enteros posibles en una variable de 32 bits.                      *
 * Indique el error.                                                 *
 *                                                                   *
 * Fuente: Java Puzzlers, Ejercicio 1                                *
 *===================================================================*/

class Impares {
    public static boolean esImpar(int x) {
        return x % 2 == 1;
    }
}
