public class BitsToFlip {
  
  /**
   * Counts the number of bits that need to be flipped to convert one number to another.
   * 
   * @param a first number
   * @param b second number
   * @return number of bits that differ between a and b
   */
  public static int countBitsToFlip(int a, int b) {
    // XOR will give 1 where bits differ
    int xor = a ^ b;
    
    // Count the number of 1s in the XOR result
    int count = 0;
    while (xor > 0) {
      count += xor & 1;  // Check if last bit is 1
      xor >>= 1;         // Right shift by 1
    }
    
    return count;
  }
  
  /**
   * Alternative approach using Brian Kernighan's algorithm (more efficient).
   */
  public static int countBitsToFlipOptimized(int a, int b) {
    int xor = a ^ b;
    int count = 0;
    
    while (xor > 0) {
      xor &= (xor - 1);  // Remove the rightmost 1 bit
      count++;
    }
    
    return count;
  }
  
  public static void main(String[] args) {
    int num1 = 1;
    int num2 = 4;
    
    System.out.println("Number 1: " + num1 + " (Binary: " + Integer.toBinaryString(num1) + ")");
    System.out.println("Number 2: " + num2 + " (Binary: " + Integer.toBinaryString(num2) + ")");
    System.out.println("Bits to flip: " + countBitsToFlip(num1, num2));
  }
}