public class SecondLargest {
   public static void main(String[] args) {
        //initilizing an array
        int[] arr = {12, 14, 16, 20, 13, 11, 18};
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { //comparing both i & j value
                    num = arr[i];
                    arr[i] = arr[j];
                    arr[j] = num;
                }
            }
        }
        System.out.println("Second largest number is =" + arr[arr.length - 2]);
    }
}

