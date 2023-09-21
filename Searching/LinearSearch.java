package DSPractice.Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] a = {4, 7, 1, 3, 5, 6, 8};
        System.out.println(search(a, 5));
        System.out.println(search(a, 50));
    }

    private static int search(int[] a, int i) {
        for (int arr=0;arr<a.length;arr++)
            if (i == a[arr])
                return arr;
        return -1;
    }
}
