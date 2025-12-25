public class TwoNonRepeating {
  public static void findTwoNonRepeating(int[] arr) {
    // XOR all elements to get XOR of two non-repeating numbers
    int xorAll = 0;
    for (int num : arr) {
      xorAll ^= num;
    }
    
    // Find the rightmost set bit in xorAll
    int rightmostBit = xorAll & -xorAll;
    
    // Divide elements into two groups based on the rightmost set bit
    int num1 = 0, num2 = 0;
    for (int num : arr) {
      if ((num & rightmostBit) != 0) {
        num1 ^= num;
      } else {
        num2 ^= num;
      }
    }
    
    System.out.println("Two non-repeating elements are: " + num1 + " and " + num2);
  }
  
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 2, 1, 4};
    findTwoNonRepeating(arr);
  }
}