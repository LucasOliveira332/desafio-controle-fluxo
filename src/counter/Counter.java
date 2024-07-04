package counter;

import customException.InvalidParameterException;

public class Counter {
  public static void count(int firstParameter, int secondParameter) throws InvalidParameterException{
    boolean FromValueGreaterTo = firstParameter > secondParameter;
    if(FromValueGreaterTo){
      throw new InvalidParameterException();
    }

    int countAt = secondParameter - firstParameter;

    for(int initialValue = 1; initialValue <= countAt; initialValue++){
      System.out.println(initialValue);
    }
  }
}
