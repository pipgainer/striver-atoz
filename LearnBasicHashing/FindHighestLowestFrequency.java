package LearnBasicHashing;

class FindHighestLowestFrequency {

    public static void main(String args[]) {

        int arr[] = { 10, 10, 10, 3, 3, 3 };
        int n = arr.length;
        countFreq(arr, n);
    }

    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;
        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            if (count > maxFreq) {
                maxEle = arr[i];
                maxFreq = count;
            } else if (count == maxFreq && arr[i] < maxEle) {
                maxEle = arr[i];
                maxFreq = count;
            }

            if (count < minFreq) {
                minEle = arr[i];
                minFreq = count;
            } else if (count == minFreq && arr[i] < minEle) {
                minEle = arr[i];
                minFreq = count;
            }
        }
        System.out.println("The highest frequency element is: " + maxEle);
        System.out.println("The lowest frequency element is: " + minEle);

    }
}