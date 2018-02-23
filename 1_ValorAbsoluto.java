/*============================================================*
 * Indique la respuesta: Valor absoluto                       *
 *                                                            *
 * Objetivo:  Encontrar un valor entero que cause un error de *
 * aserción en el programa.                                   *
 *============================================================*/

class ValorAbsoluto {
    public static void main(String args[]) {
        int x = new java.util.Scanner(System.in).nextInt();

        assert valorAbsoluto(x) > 0 : "La aserción ha fallado";
    }

    public static int valorAbsoluto(int n) {
        return (n > 0) ? n : -n;
    }
}
