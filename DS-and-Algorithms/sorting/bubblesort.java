package sorting;

public class bubblesort {



    //pkg2.bubblesort loops and compares values, the greater value gets put at j+1 position then we continue comparing that (j+1) element and the next element not compared yet, the array gets smaller each time we find the ith greatest element from the right. Sorts from the end of the array.

    public bubblesort(int[] array) {

        for(int i = 0; i < array.length -1;i++) {
        for(int j = 0; j < array.length -1 -i;j++) {

            if(array[j] > array[j+1]) {
             int temp = array[j+1];
             array[j+1] = array[j];
             array[j] = temp;



            }

        }

        }






    }




}