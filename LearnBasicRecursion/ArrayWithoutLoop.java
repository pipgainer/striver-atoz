package LearnBasicRecursion;

import java.util.Scanner;

public class ArrayWithoutLoop {
    public static void addElementToArray(int index, int[] array) {
        if (index == 0) {
            array[index] = index + 1;
            return;
        } else {
            array[index] = index + 1;
            addElementToArray(index - 1, array);
        }
    }

    public static void main(String[] args) {
        // Write Your Code Here
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        int[] arr = new int[x];
        addElementToArray(x - 1, arr);
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
