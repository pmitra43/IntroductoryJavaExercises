import java.util.Scanner;

public class VerticalLine {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter value of n:");
    int n = sc.nextInt();
    for (int i = 0; i < n; i++) {
      System.out.println("*");
    }
  }
}
