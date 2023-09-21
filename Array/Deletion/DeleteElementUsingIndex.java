package DSPractice.Array.Deletion;

public class DeleteElementUsingIndex {
    public static void main(String[] args) {
        int[] oldArray = {1, 2, 3, 4, 5};
        int deleteIndex = 2;
        int[] newArray = new int[oldArray.length - 1];
        for (int i = 0, j = 0; i < oldArray.length; i++) {
            if (i != deleteIndex) {
                newArray[j] = oldArray[i];
                j++;
            }
        }
        for (int i : newArray)
            System.out.println(i);
    }
}
