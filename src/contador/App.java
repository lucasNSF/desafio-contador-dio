package contador;

import contador.exceptions.InvalidRangeException;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Contador contador = new Contador();
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Digite o primeiro número: ");
    int n1 = Integer.parseInt(scanner.nextLine());
    System.out.print("Digite o segundo número: ");
    int n2 = Integer.parseInt(scanner.nextLine());
    scanner.close();
    
    try {
      contador.printInterval(n1, n2);
    } catch (InvalidRangeException e) {
      System.out.println(e.getMessage());
    }
  }
}
