package LearnBasicHashing;

import java.util.ArrayList;
import java.util.List;

public class CountingFrequencyInRange {

    public static List<Integer> frequencyCount(int[] arr) {
        ArrayList<Integer> hash = new ArrayList<Integer>();

        for (int i = 0; i < arr.length; i++) {
            hash.add(0); // Fill with 0 initially
        }

        // Increment the frequency for each element in the input array
        for (int i = 0; i < arr.length; i++) {
            int index = arr[i] - 1; // Use the value in arr as the index
            hash.set(index, hash.get(index) + 1); // Increment the count
        }

        return hash;
    }

    public static void main(String[] args) {

        int[] array = { 2, 3, 2, 3, 5 };

        frequencyCount(array);
    }
}
