public class Library {

    public static double avgOfNumbersAboveAndEqualAvg(int[] nums) {
        double avg = 0;
        for (int num : nums) {
            avg += num;
        }
        avg /= nums.length;

        double sum = 0;
        int count = 0;
        for (int num : nums) {
            if (num >= avg) {
                sum += num;
                count++;
            }
        }

        return sum / count;
    }

    public static void moveZeros(int[] nums) {
        int nonZeroIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[nonZeroIndex];
                nums[nonZeroIndex] = nums[i];
                nums[i] = temp;
                nonZeroIndex++;
            }
        }
    }

    public static int[] maxRowValues(int[][] matrix) {
        int[] maxValues = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            int maxValue = Integer.MIN_VALUE;
            for (int j = 0; j < matrix[i].length; j++) {
                maxValue = Math.max(maxValue, matrix[i][j]);
            }
            maxValues[i] = maxValue;
        }
        return maxValues;
    }

    public static void printVerticalChart(int[] nums) {
        int maxVal = 0;
    
        for (int n : nums) {
            if (n > maxVal) {
                maxVal = n;
            }
        }
    
        for (int i = maxVal; i > 0; i--) {
            for (int n : nums) {
                System.out.print(n >= i ? "* " : "  ");
            }
            System.out.println();
        }
    
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
    
}
