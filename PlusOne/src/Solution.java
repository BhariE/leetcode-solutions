import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {

        // start from the last element and work backwards
        for (int i = digits.length -1; i >= 0; i--) {
            // if the value of the index is not 9, increment it amd return it
            if(digits[i] != 9) {
                digits[i]++;
                return digits;
                // other wise set the 9 to 0 and keep working backwards
            } else {
                digits[i] = 0;
            }

        }
        // edge case for all 9's. make a new array with one extra space
        int[] newDigitsArray = new int[digits.length + 1];
        // set the first element to 0
        newDigitsArray[0] = 1;

       return newDigitsArray;
    }

    public static void main(String[] args) {

        Solution s = new Solution();

        int[] digits = {9};
        int[] ans = s.plusOne(digits);

        System.out.println(Arrays.toString(ans));

    }
}


