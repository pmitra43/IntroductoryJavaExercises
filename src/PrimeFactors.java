import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
  public List<Integer> generate(int n) {
    List<Integer> primeFactors = new ArrayList<>();
    int number = 2;
    while (n != 1) {
      if (n % number == 0) {
        primeFactors.add(number);
        n /= number;
      }
      number++;
    }
    return primeFactors;
  }
}
