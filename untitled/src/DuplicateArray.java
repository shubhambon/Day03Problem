//Program to print the duplicate elements of an array

    public class DuplicateArray {
        public static void main(String[] args) {
            //initilizing an array
            int[] array = {5, 8, 9, 3, 16, 7, 5, 3, 6};
            System.out.println("Duplicate elements of an array:");
            //checking for duplicate number
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j])
                        System.out.println(array[j]);
                }
            }
        }
    }


