import java.util.Scanner;

public class DiamondWithName {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of n:");
    int n = sc.nextInt();
    for (int i = 0; i < n-1; i++) {
      for (int j = n - 1; j > i; j--) {
        System.out.print(" ");
      }
      for (int j = 0; j < i * 2 + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    System.out.println("Priyam");
    for (int i = n-2; i >= 0; i--) {
      for (int j = n - 1; j > i; j--) {
        System.out.print(" ");
      }
      for (int j = 0; j < i * 2 + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
