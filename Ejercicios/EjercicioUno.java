package hanoi;
// Declaración de la clase Hanoi
public class Hanoi {
// Método principal de la clase
public static void main(String[] args) {
    // Se crea una instancia de la clase Hanoi
    Hanoi objHanoi = new Hanoi();
    // Se llama al método "numeroMovimientos" y se almacena su valor de retorno en la variable "movimientos"
    int movimientos = objHanoi.numeroMovimientos(3, 1, 3);
    // Se imprime el resultado por consola
    System.out.println("El número de movimientos necesarios es: " + movimientos);
}
// Método recursivo que calcula el número de movimientos necesarios para resolver el problema de las torres de Hanoi
public int numeroMovimientos(int discos, int torreOrigen, int torreDestino) {
    // Caso base: si solo hay un disco, se mueve directamente a la torre destino
    if (discos == 1) {
        return 1;
    } else {
        // Se calcula la torre auxiliar en función de la torre origen y la torre destino
        int torreAuxiliar = 6 - torreOrigen - torreDestino;
        // Se llama recursivamente al método "numeroMovimientos" para mover los discos del origen a la torre auxiliar
        int movimientos1 = numeroMovimientos(discos - 1, torreOrigen, torreAuxiliar);
        // Se llama al método "numeroMovimientos" para mover el disco restante desde el origen hasta la torre destino
        int movimientos2 = numeroMovimientos(1, torreOrigen, torreDestino);
        // Se llama recursivamente al método "numeroMovimientos" para mover los discos de la torre auxiliar a la torre destino
        int movimientos3 = numeroMovimientos(discos - 1, torreAuxiliar, torreDestino);
        // Se suman los movimientos necesarios en cada una de las llamadas recursivas
        return movimientos1 + movimientos2 + movimientos3;
    }
  }
}
