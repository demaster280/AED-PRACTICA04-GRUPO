package factorialnumero;
public class FactorialNumero {
     //Metodo factorial: recursiva
    public int factorialRecursivo(int n) {
        //Validando
        if (n < 0) {
            return 0; 
        } else {
            //Caso cero
            if ( n == 0 ) {
                return 1;
            } else {
                //Dominio (problema -1)
                return n * factorialRecursivo(n - 1);
            }
        }
    }
    //Metodo factorial: ciclos o iterativo 
    public int factorialCiclo(int n ){
        int factor = 1;
        if (n < 0) {
            return 0;
        } else {
            while (0 != n) {
                factor = n * factor;
                n--;
            }
            return factor;
        }
    } 
}
