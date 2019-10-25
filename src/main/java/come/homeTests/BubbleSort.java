package come.homeTests;

public class BubbleSort {

    public static int[] array = {12, 6, 3, 0, -8, 19, 4};

    public static void bubbleSort(int[] arr) {
        for(int i = 0 ; i < array.length; i++) {
            for(int j = 0 ; j < array.length-1 ; j++) {
                if( arr[j] > arr[j+1] ) {
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }

    public static void main(String[] args) {
        bubbleSort(array);
        System.out.println("Your sorted array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
