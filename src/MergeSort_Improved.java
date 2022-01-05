public class MergeSort_Improved {
    public static void main(String[] args) {
        int[]data = new int[]{0, 3, 2, -5, 20, 10};
        mergeSort(data);
        System.out.println("Done");
    }   

    public static void mergeSort(int[] data){
        int n = data.length;
        if(n<2) return;
        int mid = n/2;
        int[] left = new int[mid];
        int[] right = new int[n-mid];
        for(int i = 0; i <= mid-1; i++){
            left[i]=data[i];
        }
        for(int i = mid; i<= n-1; i ++){
            right[i-mid]=data[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left, right, data);
    }

    public static void merge(int[]left, int[]right, int[]data){
        int nL = left.length;
        int nR = right.length;
        int i = 0, j = 0, k = 0;

        while(i<nL && j<nR){
            if(left[i]<=right[j]){
                data[k]=left[i];
                i++;
                k++;
            }else{
                data[k]=right[j];
                j++;
                k++;
            }
        }

        while(i<nL){
            data[k]=left[i];
            i++;
            k++;
        }

        while(j<nR){
            data[k]=right[j];
            j++;
            k++;
        }
    }
}
