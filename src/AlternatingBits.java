public class AlternatingBits {
    
    /**
     * Check if a number has alternating bits.
     * For example: 5 (101 in binary) has alternating bits,
     * but 7 (111 in binary) does not.
     */
    public static boolean hasAlternatingBits(int n) {
        int xor = n ^ (n >> 1);
        return (xor & (xor + 1)) == 0;
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] testNumbers = {5, 7, 10, 15, 1, 2, 3, 21, 85};
        
        for (int num : testNumbers) {
            boolean result = hasAlternatingBits(num);
            System.out.println("Number: " + num + " (" + Integer.toBinaryString(num) + 
                             ") - Alternating bits: " + result);
        }
    }
}
