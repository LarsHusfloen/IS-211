package List.BinarySearch;

public class BinarySearch {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while(right > left) {
            int mid = Math.floorDiv(left + right, 2);
            int midValue = arr[mid];

            if (midValue == target) {
                return mid;
            } else if(target > midValue){
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return -1;
    }
}
