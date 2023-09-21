package DSPractice.Array.Insertion;

public class ArrayElementInsert {
    public static void main(String[] args) {
        int[] oldArray = {2, 4, 3, 67, 45, 23};
        int insertElement = 9;
        int insertIndex = 4;
        int[] newArray = new int[oldArray.length + 1];
        for (int i = 0, j = 0; i < oldArray.length; i++, j++) {
            if (i == insertIndex) {
                newArray[j] = insertElement;
                j++;
            }
            newArray[j] = oldArray[i];
        }
        for (int i : newArray)
            System.out.println(i);
    }
}
