public class BinarySearch {
    public static void main(String[] args) {
        int[]A = new int[]{-1, 0, 1, 2, 3, 4, 7, 9, 10, 20};
        int x = 10; 
        System.out.println(binarySearch(A, 0, 9, x));
    }

    public static int binarySearch(int[] A, int left, int right, int x){
        if(left > right){
            return -1;
        }        
        int midPoint = (left+right)/2;
        if(x == A[midPoint]){
            return midPoint;
        }
        if(x < A[midPoint]){
            return binarySearch(A, left, midPoint-1, x);
        }
        return binarySearch(A, midPoint+1, right, x);
    }
}
