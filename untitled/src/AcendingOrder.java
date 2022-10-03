//Program to sort the elements of an array in ascending order
public class AcendingOrder {
        public static void main(String[] args) {
            int[] arr = {5, 2, 6, 3, 4, 1};
            int num = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        num = arr[i];
                        arr[i] = arr[j];
                        arr[j] = num;
                    }
                }
                System.out.print(arr[i] + " ");
            }
        }
    }


