public class RecorridoArray {
    public static void main(String[] args) {
        //se crea un array de números enteros con valores del 1 al 5.
        int[] arr = {1, 2, 3, 4, 5};
        //se llama al método recorrerArray y se le pasa el array y el índice inicial (0)
        recorrerArray(arr, 0);
    }
    //Define el método recorrerArray, que recibe como parámetros el array y el índice actual
    public static void recorrerArray(int[] arr, int indice) {
        // Caso base: si el índice es igual al tamaño del array, se detiene la recursión
        if (indice == arr.length) {
            //se imprime el elemento en el índice actual del array.
            return;
        }
        // Se imprime el elemento en el índice actual del array
        System.out.println(arr[indice]);
        // Se llama recursivamente al método para imprimir el siguiente elemento del array
        recorrerArray(arr, indice + 1);
    }
}