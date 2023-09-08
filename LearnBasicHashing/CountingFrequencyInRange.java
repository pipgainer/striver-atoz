package LearnBasicHashing;

public class CountingFrequencyInRange {

    public static int[] countFrequency(int n, int x, int []nums){

        // Write your code here.
        int[] hash = new int[x+1];

        for (int i : nums) {
            hash[i]++;
        }

        for (int i : hash) {
            System.out.println(i);
        }

        return hash;
        
    }
    
    public static void main(String[] args) {
        
        int[] array = {11, 14, 8, 3, 12, 14, 1, 7 , 4,3 };
        
        countFrequency(10, 14, array);
    }
}
