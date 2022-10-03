//Program to print the smallest element in an array

    public class SmallestElement {
        public static void main(String[] args) {
            //initilizing an array
            int[] array = {12,11,47,85, 9,67,89,71};
            int small=array[0];
            for(int i=0;i< array.length;i++) {
                //Comparing both arrays to get Smallest array
                if(array[i]<small)
                    small=array[i];
            }
            System.out.println("Smallest element of array is= " + small);
        }
    }


