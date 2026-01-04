public class RightmostDifferentBit {
  /**
   * Finds the position of the rightmost different bit between two numbers.
   * Position is counted from the right starting at 1.
   * Returns -1 if both numbers are equal.
   */
  public static int findRightmostDifferentBit(int num1, int num2) {
    // XOR will have 1s where bits differ
    int xor = num1 ^ num2;
    
    // If XOR is 0, numbers are equal
    if (xor == 0) {
      return -1;
    }
    
    // Find position of rightmost set bit
    // Using formula: position = log2(xor & -xor) + 1
    int position = Integer.numberOfTrailingZeros(xor) + 1;
    return position;
  }
  
  public static void main(String[] args) {
    System.out.println(findRightmostDifferentBit(5, 3));    // Output: 1 (101 vs 011)
    System.out.println(findRightmostDifferentBit(8, 4));    // Output: 3 (1000 vs 0100)
    System.out.println(findRightmostDifferentBit(7, 7));    // Output: -1 (same numbers)
    System.out.println(findRightmostDifferentBit(1, 2));    // Output: 2 (01 vs 10)
  }
}