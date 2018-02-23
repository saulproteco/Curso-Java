/*============================================================*
 * Indique la respuesta: Adivinador                           *
 *                                                            *
 * Objetivo: La interfaz 'NumerosSorpresa' contiene un total  *
 * de 5 dobles nombrados SECRETO1 hasta SECRETO5. Hay que     *
 * encontrar sus valores a base de preguntas hechas con los   *
 * operadores relacionales.                                   *
 *============================================================*/

class Adivinador implements NumerosSorpresa {
    public static void main(String args[]) {
        if ( condicion ) {
            System.out.println("Has adivinado");
        } else {
            System.out.println("Lo siento prueba otra vez");
        }
    }
}
