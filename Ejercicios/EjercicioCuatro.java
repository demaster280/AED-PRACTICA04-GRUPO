package problema;
public class Problema {
    public static int binarySearch(int[] array, int target, int low, int high) {
        // caso base: cuando ya no hay más elementos en el subarreglo
        if (low > high) {
            return -1; // elemento no encontrado
        }
        // determinar el índice del elemento central en el subarreglo
        int mid = (low + high) / 2;
        if (array[mid] >= target) {
            // el elemento central es mayor o igual al objetivo, buscar en la mitad izquierda
            int leftIndex = binarySearch(array, target, low, mid - 1);
            if (leftIndex != -1) {
                // se encontró el objetivo en la mitad izquierda, retornar el índice
                return leftIndex;
            } else {
                // el objetivo no se encontró en la mitad izquierda, retornar el índice actual
                return mid;
            }
        } else {
            // el elemento central es menor que el objetivo, buscar en la mitad derecha
            return binarySearch(array, target, mid + 1, high);
        }
    }
    public static void main(String[] args) {
        // arreglo de números enteros ordenados de manera ascendente
        int[] array = {1, 2, 4, 5, 7, 8, 10};
        // encontrar el índice del primer elemento mayor o igual a 6
        int index = binarySearch(array, 6, 0, array.length - 1);
        // mostrar el resultado de la búsqueda
        if (index != -1) {
            System.out.println("El primer elemento mayor o igual a 6 se encuentra en el indice " + index);
        } else {
            System.out.println("No se encontro ningun elemento mayor o igual a 6 en el arreglo.");
        }
    }
}