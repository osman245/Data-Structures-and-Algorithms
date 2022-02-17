package pkg2;

public class SelectionSort {

    // Selection sort, compares values but sorts values starting from the beginning, the last value
    // to be sorted in the last value in the array. opposed to bubble sort.
    // we loop and keep the minindex i at all times... if minindex value is greater then the current value then we make the minindex value the smaller current value.
   int[] SelectionSort(int [] a) {
        int minindex;
        for (int i = 0; i < a.length - 1; i++) {
            minindex = i;
            for(int j = i+1; j < a.length ; j++) {
                if(a[minindex] > a[j]) {
                    minindex = j;

                    int temp = a[minindex];
                    a[minindex] = a[i];
                    a[i] = temp;

                }


            }


        }
        return a;
    }

}
