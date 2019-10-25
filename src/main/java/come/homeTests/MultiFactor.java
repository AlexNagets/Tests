package come.homeTests;

public class MultiFactor {
    public static int[] array = {45, 72, -13, 0, 8, 4, 16};
    public static int multiFactor = 4;

    public static int[] multiFactor(int[] array, int multiFactor) {
        int j = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % multiFactor == 0) {
                counter++;
            }
        }
        int[] arrayMulti = new int[counter];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % multiFactor == 0) {
                    arrayMulti[j] = array[i];
                    j++;
            }
        }
        return arrayMulti;
    }

    public static void main(String[] args) {

        int[] multiFactorArray = multiFactor(array, multiFactor);
        for(int i=0; i < multiFactorArray.length; i++){
            System.out.print(multiFactorArray[i] + " ");
        }
    }
}
