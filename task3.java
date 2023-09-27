import java.util.HashSet;
import java.util.Set;
 class ArrayUtils {
    public static int notContains(int[] array) {
       
        Set<Integer> set = new HashSet<>();

        for (int num : array) {
            if (num > 0) {
                set.add(num);
            }
        }

        int min = 1;
        while (set.contains(min)) {
            min++;
        }

        return min;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 6, 4, 1, 2}; 
        int result = notContains(array);
        System.out.println("Minimum positive integer not present in the array: " + result);
    }
}
