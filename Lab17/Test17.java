public class Test17 {
    public static void main(String [] args){
        final double scorePerTest = 25;
        double score = 0;

        // Testing Library.avgOfNumbersAboveAndEqualAvg
        int [] nums1 = {12, 9, 34, 22, 6, 45, 76, 2, 34, 19};
        double result1 = Library.avgOfNumbersAboveAndEqualAvg(nums1);
        double expected1 = 47.25;
        double epsilon = 0.01;
        if (Math.abs(result1-expected1) <= epsilon) score += scorePerTest;

        // Testing Library.moveZeros
        int [] nums2 = {4, 0, 0, 3, 2, 1, 0, 0, 0, 7};
        int [] expected2 = {4, 3, 2, 1, 7, 0, 0, 0, 0, 0};
        Library.moveZeros(nums2);
        boolean ok = true;
        for (int i=0; i<nums2.length; i++){
            if (nums2[i] != expected2[i]){
                ok = false;
                break;
            } // end-if
        } // end-if
        if (ok) score += scorePerTest;

        // Testing Library.maxRowValues
        int [][] matrix = {{4, 2, 6, 2}, {8, 3, 1}, {3, 3, 9, 5, 6}};
        int [] result3 = Library.maxRowValues(matrix);
        int [] expected3 = {6, 8, 9};
        ok = true;
        for (int i=0; i<result3.length; i++){
            if (result3[i] != expected3[i]){
                ok = false;
                break;
            } // end-if
        } // end-if
        if (ok) score += scorePerTest;

        System.out.printf("Your Lab score so far %.2f\n", score);

        // Testing Library.printVerticalChart
        int [] nums4 = {3, 1, 7, 4, 2, 6, 3, 9};
        Library.printVerticalChart(nums4);     
    }
} //end-Test