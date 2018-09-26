package basic;

public class Selection {
        public static void selectionSort(int[] arr){
            for (int i = 0; i < arr.length - 1; i++)
            {
                int index = i;
                for (int j = i + 1; j < arr.length; j++){
                    if (arr[j] < arr[index]){
                        index = j;//searching for lowest index
                    }
                }
                int smallerNumber = arr[index];
                arr[index] = arr[i];
                arr[i] = smallerNumber;
            }
        }

        public static void main(String a[]){
            int[] arr1 = {9,14,3};
            System.out.println("Before basic.Selection Sort");
            for(int i:arr1){
                System.out.print(i+" ");
            }
            System.out.println();

            selectionSort(arr1);//sorting array using selection sort

            System.out.println("After basic.Selection Sort");
            for(int i:arr1){
                System.out.print(i+" ");
            }
        }
    }

