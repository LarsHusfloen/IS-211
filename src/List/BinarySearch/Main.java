package List.BinarySearch;

public class Main {

    public static void main(String[] args) {
        int[] searchable = {1, 2, 7, 8, 22, 28, 41, 58, 67, 71, 94};
        int target = 7;

        System.out.println(BinarySearch.search(searchable, target));
    }
}
