//Program to find the frequency of each element in the array

    public class Frequency {
        public static void main(String[] args) {
            int[] arr = {1, 3, 4, 5, 3, 1, 2, 7, 5};
            int[] frequency = new int[arr.length];
            int visited = -1;
            for (int i = 0; i < arr.length; i++) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        //To avoid counting same element again
                        frequency[j] = visited;
                    }
                }
                if (frequency[i] != visited)
                    frequency[i] = count;
            }
            System.out.println("Element|Frequency");
            for (int i = 0; i < frequency.length; i++) {
                if (frequency[i] != visited)
                    System.out.println("    " + arr[i] + "  |   " + frequency[i]);
            }

        }
    }

