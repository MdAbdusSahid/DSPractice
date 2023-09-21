package DSPractice.Array.Insertion;

import org.apache.commons.lang3.ArrayUtils;

public class ArrayElementInsertArrayUtils {
    public static void main(String[] args) {
        int[] oldArray = {2, 4, 3, 67, 45, 23};
        int insertElement = 9;
        int insertIndex = 4;
        int[] newArray = ArrayUtils.insert(insertIndex, oldArray, insertElement);
        for (int arr : newArray)
            System.out.println(arr);
    }
}
