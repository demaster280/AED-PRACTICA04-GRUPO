package mediana;
public class Mediana {
    public static int encontrarMediana(int[] arr) {
        int n = arr.length;
        // Caso base: si el arreglo tiene tamaño impar, devolvemos el elemento central
        if (n % 2 != 0) {
            return encontrarMedianaRecursivo(arr, 0, n-1, n/2);
        }
        // Caso base: si el arreglo tiene tamaño par, promediamos los elementos centrales
        int mediana1 = encontrarMedianaRecursivo(arr, 0, n-1, n/2);
        int mediana2 = encontrarMedianaRecursivo(arr, 0, n-1, n/2-1);
        return (mediana1 + mediana2) / 2;
    }
    private static int encontrarMedianaRecursivo(int[] arr, int izquierda, int derecha, int k) {
        if (izquierda == derecha) {
            return arr[izquierda];
        }
        int pivote = particion(arr, izquierda, derecha);
        int tamañoIzquierda = pivote - izquierda + 1;
        if (k == tamañoIzquierda-1) {
            return arr[pivote];
        } else if (k < tamañoIzquierda) {
            return encontrarMedianaRecursivo(arr, izquierda, pivote-1, k);
        } else {
            return encontrarMedianaRecursivo(arr, pivote+1, derecha, k-tamañoIzquierda);
        }
    } 
    private static int particion(int[] arr, int izquierda, int derecha) {
        int pivote = arr[derecha];
        int i = izquierda;
        for (int j = izquierda; j < derecha; j++) {
            if (arr[j] <= pivote) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[derecha];
        arr[derecha] = temp;
        return i;
    }  
    public static void main(String[] args) {
        int[] arr1 = {4, 2, 7, 10, 4, 17};
        int[] arr2 = {4, 2, 7, 10, 4, 1, 6};
        int[] arr3 = {4, 2, 7, 1, 4, 6};
        int[] arr4 = {9, 2, 7, 1, 7};
        System.out.println(encontrarMediana(arr1)); // 5
        System.out.println(encontrarMediana(arr2)); // 4
        System.out.println(encontrarMediana(arr3)); // 4
        System.out.println(encontrarMediana(arr4)); // 7
    }
}