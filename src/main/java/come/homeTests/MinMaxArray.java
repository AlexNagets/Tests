package come.homeTests;

public class MinMaxArray {
        public static int[] array = {12, 6, 3, 0, -8, 19, 4};
        public static int min = array[0];
        public static int max = array[0];

        public static int Min(int min, int[] array) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }

        public static int Max(int max, int[] array) {
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }
        public static void main(String[] args) {
            System.out.println("Your maximal element:\t" + Min(min, array) + "\nYour minimal element:\t" + Max(max, array));
        }
}