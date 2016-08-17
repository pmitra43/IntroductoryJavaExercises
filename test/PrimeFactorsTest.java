import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class PrimeFactorsTest {

  @Test
  public void getListOfPrimeFactorsWhenGivenNumberIsOne(){
    PrimeFactors primeFactors = new PrimeFactors();
    List<Integer> expectedPrimeFactors = new ArrayList<>();
    Assert.assertEquals(expectedPrimeFactors, primeFactors.generate(1));
  }

  @Test
  public void getListOfPrimeFactorsWhenGivenNumberIsThirty(){
    PrimeFactors primeFactors = new PrimeFactors();
    List<Integer> expectedPrimeFactors = new ArrayList<>();
    expectedPrimeFactors.add(2);
    expectedPrimeFactors.add(3);
    expectedPrimeFactors.add(5);
    Assert.assertEquals(expectedPrimeFactors, primeFactors.generate(30));
  }
}