package Question2b;

public class GenericCalculator {

    public static <T extends Number & Comparable<T>> T calculateMaximum(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        T max = array[0];
        
        for (T ob : array) {
            if (ob.compareTo(max) > 0) {
                max = ob;
            }
        }
        return max;
    }

    
    public static <T extends Number> Double calculateProduct(T[] array) {
        if (array == null || array.length == 0) {
            return null;
        }

        double product = 1.0;
        for (T ob : array) {
            product *= ob.doubleValue();
        }
        return product;
    }
}
