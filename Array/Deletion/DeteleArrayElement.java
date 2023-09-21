package DSPractice.Array.Deletion;

public class DeteleArrayElement {
    public static void main(String[] args) {
        int[] oldArray = {1, 2, 3, 4, 5, 100};
        int elementToDelete = 100;
        int[] newArray = new int[oldArray.length - 1];
        int newIndex = 0;
        for (int i = 0; i < oldArray.length; i++) {
            if (oldArray[i] != elementToDelete) {
                newArray[newIndex] = oldArray[i];
                newIndex++;
            }
        }
        for (int i : newArray)
            System.out.println(i);
    }
}
