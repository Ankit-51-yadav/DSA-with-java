import java.util.*;



class Changezerosorder {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,};

        int[] result = changeZero(arr);
        System.out.println(Arrays.toString(result));


    }

    public static int[] changeZero(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i] == 0 && arr[j] !=0) {
                  int temp= arr[i];
                  arr[i] = arr[j];
                  arr[j] = temp;
                  break;

                }
            }

        }
    return arr;

    }
}