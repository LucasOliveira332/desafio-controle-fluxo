package customException;

public class InvalidParameterException extends Exception {
  public InvalidParameterException(){
    super("O segundo parâmetro deve ser maior que o primeiro.");
  }
}
