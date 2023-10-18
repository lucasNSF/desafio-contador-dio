package contador.exceptions;

public class InvalidRangeException extends RuntimeException {
  public InvalidRangeException() {
    super("O segundo parâmetro deve ser maior que o primeiro!");
  }
}
