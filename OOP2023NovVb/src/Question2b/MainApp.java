package Question2b;

public class MainApp {
    public static void main(String[] args) {
    	
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};

        Integer intMax = GenericCalculator.calculateMaximum(intArray);
        Double intProduct = GenericCalculator.calculateProduct(intArray);

        System.out.println("Integer Array:");
        System.out.println("Maximum: " + intMax);
        System.out.println("Product: " + intProduct);

        Double doubleMax = GenericCalculator.calculateMaximum(doubleArray);
        Double doubleProduct = GenericCalculator.calculateProduct(doubleArray);

        System.out.println("Double Array:");
        System.out.println("Maximum: " + doubleMax);
        System.out.println("Product: " + doubleProduct);
    }
}
