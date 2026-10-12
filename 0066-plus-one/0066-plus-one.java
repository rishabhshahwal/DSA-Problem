class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        // Traverse the array from the least significant digit (right to left)
        for (int i = n - 1; i >= 0; i--) {
            // If the current digit is less than 9, increment and return immediately
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            // If the digit is 9, it becomes 0 and the carry propagates to the next left digit
            digits[i] = 0;
        }
        
        // If the loop finishes, it means all digits were 9 (e.g., [9, 9, 9])
        // We need an array of size n + 1 with the first digit as 1 and the rest as 0
        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}