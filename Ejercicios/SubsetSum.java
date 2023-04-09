package subsetsum;
public class SubsetSum {
public static boolean canFormSubset(int[] nums, int target) {
        // Llamamos a la función auxiliar para resolver el problema recursivamente
        return canFormSubsetAux(nums, 0, target, false);
    }    
    // Función auxiliar que resuelve el problema recursivamente
    private static boolean canFormSubsetAux(int[] nums, int idx, int target, boolean prevOne) {
        // Si hemos llegado al final del arreglo y la suma objetivo es cero, hemos encontrado el subconjunto
        if (idx == nums.length && target == 0) {
            return true;
        }        
        // Si hemos llegado al final del arreglo y la suma objetivo no es cero, no hemos encontrado el subconjunto
        if (idx == nums.length) {
            return false;
        }        
        // Si el elemento actual es múltiplo de 7, lo incluimos obligatoriamente en el subconjunto
        if (nums[idx] % 7 == 0) {
            return canFormSubsetAux(nums, idx + 1, target - nums[idx], false);
        }        
        // Si el elemento anterior no fue 1 y el elemento actual no es 1, podemos considerarlo en el subconjunto o no
        if (!prevOne && nums[idx] != 1) {
            return canFormSubsetAux(nums, idx + 1, target - nums[idx], false) || 
                   canFormSubsetAux(nums, idx + 1, target, false);
        }        
        // Si el elemento anterior fue 1 o el elemento actual es 1, no lo podemos considerar en el subconjunto
        return canFormSubsetAux(nums, idx + 1, target, nums[idx] == 1);
    }   
    // Función para probar el algoritmo
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 10, 4};
        int target1 = 17;
        System.out.println(canFormSubset(nums1, target1)); // true       
        int[] nums2 = {2, 7, 10, 4};
        int target2 = 16;
        System.out.println(canFormSubset(nums2, target2)); // false        
        int[] nums3 = {2, 7, 1, 4};
        int target3 = 6;
        System.out.println(canFormSubset(nums3, target3)); // true        
        int[] nums4 = {2, 7, 1, 4};
        int target4 = 7;
        System.out.println(canFormSubset(nums4, target4)); // true        
        int[] nums5 = {2, 7, 1, 4};
        int target5 = 8;
        System.out.println(canFormSubset(nums5, target5)); // false
    }
}