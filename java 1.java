//1. Create an array wth the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.


public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        // Shuffle the array
        for (int i = 0; i < array.length; i++) {
            int j = (int) (Math.random()*(array.length - i));
            int temp = array[i];
            array[i] = array[i+j];
            array[i+j] = temp;
        }

        // Print the shuffled array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
