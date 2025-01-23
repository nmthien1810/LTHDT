public class Exceptions {
    static void checkAge(int age) {
        if (age < 18) {
          throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        }
        else {
          System.out.println("Access granted - You are old enough!");
        }
      }
    public static void main(String[] args) {
        try {
            int[] nums = {1, 2, 3};
            System.out.println(nums[10]);
        } catch (Exception e) {
            System.out.println("Wrong");
        } finally {
            System.out.println("Final");
        }

        checkAge(15);
    }
}
