public class FizzBuzz {
  public static void main(String[] args) {
    for (int i = 1; i <= 100; i++) {
      int flag = 0;
      if(i%3 == 0){
        flag = 1;
        System.out.print("Fizz");
      }
      if(i%5 == 0){
        flag = 1;
        System.out.print("Buzz");
      }
      if(flag == 0){
        System.out.print(i);
      }
      System.out.println();
    }
  }
}
