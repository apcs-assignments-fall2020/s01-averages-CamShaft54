import java.util.ArrayList;
import java.util.HashMap;

public class MyMain {
    public static Object[] to1DArray(double[][] mat) {
        ArrayList<Double> newMat = new ArrayList<>();
        for (double[] i : mat) {
            for (double j : i) {
                newMat.add(j);
            }
        }
        return newMat.toArray();
    }

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) {
        Object[] niceMat = to1DArray(mat);
        double sum = 0;
        for (Object i : niceMat) {
            sum += (double) i;
        }
        return sum/niceMat.length;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) {
        Object[] niceMat = to1DArray(mat);
        if (Math.floor((double) niceMat.length/2) == (double) niceMat.length/2) {
            return ((double) niceMat[niceMat.length/2 - 1] + (double) niceMat[niceMat.length/2])/2;
        }
        return (double) niceMat[niceMat.length/2];
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) {
        Object[] niceMat = to1DArray(mat);
        HashMap<Integer, Integer> occurrences = new HashMap<>();
        for (Object i : niceMat) {
            int val = (int) ((double) i);
            if (occurrences.containsKey(val)) {
                occurrences.put(val, occurrences.get(val) + 1);
            } else {
                occurrences.put(val, 1);
            }
        }
        Object[] amounts = occurrences.values().stream().sorted().toArray();
        int maxAmount = (int) amounts[amounts.length-1];
        for (int i : occurrences.keySet()) {
            if (occurrences.get(i) == maxAmount) {
                return i;
            }
        }
        return 1.0;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
        double[][] m1 = {
                {1,  2,  4,  6},
                {7,  9,  10, 12},
                {14, 15, 17, 18},
                {22, 23, 27, 30}
        };
        System.out.println(mean(m1));
        System.out.println(median(m1));
    }
}
