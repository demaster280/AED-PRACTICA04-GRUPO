package recorridoarray;
public class RecorridoArray {
int binarySearch(String[] arr, int lo, int hi, String x) {
    // Verifica si los límites son válidos
    if (hi >= lo && lo < arr.length - 1) {
        // Calcula la posición media
        int mid = lo + (hi - lo) / 2;
        // Compara el valor en la posición media con el valor buscado
        int comparisonResult = x.compareTo(arr[mid]);
        // Si son iguales, retorna la posición media
        if (comparisonResult == 0)
            return mid;
        // Si el valor buscado es menor que el valor en la posición media,
        // se realiza la búsqueda en la mitad izquierda del arreglo
        if (comparisonResult < 0)
            return binarySearch(arr, lo, mid - 1, x);
        // Si el valor buscado es mayor que el valor en la posición media,
        // se realiza la búsqueda en la mitad derecha del arreglo
        return binarySearch(arr, mid + 1, hi, x);
    }
    // Si no se encuentra el valor, retorna -1
    return -1;
}
public static void main(String[] args) {
    // Crea una instancia de la clase RecorridoArray
    RecorridoArray ob = new RecorridoArray();
    // Crea un arreglo de Strings
    String[] arr = {"Prueba1", "Prueba2", "Prueba3", "Prueba4", "Prueba5"};
    // Obtiene la longitud del arreglo
    int n = arr.length;
    // Define el valor a buscar
    String x = "Prueba2";
    // Realiza la búsqueda y obtiene la posición del valor buscado en el arreglo
    int position = ob.binarySearch(arr, 0, n - 1, x);
    // Verifica si se encontró el valor buscado
    if (position == -1)
        System.out.println("Element not found!!!");
    else
        System.out.println("Element found at index: " + position);
}
}


