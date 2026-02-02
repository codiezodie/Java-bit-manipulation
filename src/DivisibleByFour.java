public class DivisibleByFour {

    public static boolean isDivisibleByFour(int num) {
        return num > 0 && (num & 3) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isDivisibleByFour(8));   // true
        System.out.println(isDivisibleByFour(12));  // true
        System.out.println(isDivisibleByFour(7));   // false
        System.out.println(isDivisibleByFour(16));  // true
    }
}
