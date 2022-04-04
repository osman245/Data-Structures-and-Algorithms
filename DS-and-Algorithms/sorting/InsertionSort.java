package sorting;

public class InsertionSort {

    //for and while loop combination, we iterate through the loop with the current array element, swap backwards to whatever element is greater then it.
    //The amount of values ordered increase from the front.
    InsertionSort(int [] a) {
        int current;
        for (int i = 0; i < a.length;i++) {
         current = a[i];
         int j = 0;
         j = i - 1;
         while(j >=0 && (a[j] > current)) {
             a[j+1] = a[j];
             j = j - 1;
             a[j + 1] = current;

         }


        }
    }

}
