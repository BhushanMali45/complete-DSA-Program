public class mege {

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergesort(int arr[], int si, int ei) {
        if (si >= ei) { 
            return;// Fix condition here
        }
            int mid = (si + ei) / 2;
            mergesort(arr, si, mid);
            mergesort(arr, mid + 1, ei);
            merge(arr, si, mid, ei);
        
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1]; // Fix array size here
        int i = si;
        int j = mid + 1; // Fix initialization
        int k = 0;

        while (i <= mid && j <= ei) { // Compare i and j to mid and ei
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];

                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }
            
        }

        while (i <= mid) {
            // temp[k++]=arr[i++];
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= ei) {
            temp[k] = arr[j];
            j++;
            k++;
        }
//copy
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String args[]) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        mergesort(arr, 0, arr.length - 1);
        printarr(arr);
    }
}
