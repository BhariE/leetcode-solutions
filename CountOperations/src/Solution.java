public class Solution {
    public int countOperations(int num1,int num2) {

        int counter = 0;
        while (num1 != 0 && num2 != 0 ) {

            if (num1 >= num2) {
                 num1 = num1 - num2;
            } else {
                num2 = num2 - num1;
            }

            counter ++;
        }
        return counter;
    }
    public static void main(String[] args) {
        Solution a = new Solution();

        //int num1 = 2;
        //int num2 = 3;

        int counter = a.countOperations(2,3);
        System.out.println(counter); // returns 3
    }

}

