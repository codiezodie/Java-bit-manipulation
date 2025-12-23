public class MissingNumberXOR {
  /**
   * Finds the missing number in an array containing numbers from 1 to n.
   * Uses XOR operation to find the missing number efficiently.
   * 
   * @param arr array of integers from 1 to n with one missing
   * @return the missing number
   */
  public static int findMissingNumber(int[] arr) {
    int n = arr.length + 1;
    int xorAll = 0;
    int xorArray = 0;
    
    // XOR all numbers from 1 to n
    for (int i = 1; i <= n; i++) {
      xorAll ^= i;
    }
    
    // XOR all numbers in the array
    for (int num : arr) {
      xorArray ^= num;
    }
    
    // XOR of xorAll and xorArray gives the missing number
    return xorAll ^ xorArray;
  }
  
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 5, 6}; // Missing number is 4
    System.out.println("Missing number: " + findMissingNumber(arr));
    
    int[] arr2 = {1, 3, 4, 5}; // Missing number is 2
    System.out.println("Missing number: " + findMissingNumber(arr2));
  }
}