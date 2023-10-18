package contador;

import contador.exceptions.InvalidRangeException;

public class Contador {
  public void printInterval(int n1, int n2) throws InvalidRangeException {
    if (n1 > n2) throw new InvalidRangeException();
    int count = n2 - n1;
    for (int i = 0; i < count; i++)
      System.out.println(i + 1);
  }
}
