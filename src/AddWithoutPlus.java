
public class AddWithoutPlus {
  
  public static int add(int a, int b) {
    while (b != 0) {
      // Calculate sum without carry
      int sum = a ^ b;
      
      // Calculate carry
      int carry = (a & b) << 1;
      
      // Update a and b for next iteration
      a = sum;
      b = carry;
    }
    return a;
  }
  
  public static void main(String[] args) {
    System.out.println(add(5, 3));      // Output: 8
    System.out.println(add(10, 20));    // Output: 30
    System.out.println(add(-5, 3));     // Output: -2
  }
}