import counter.Counter;
import customException.InvalidParameterException;

public class App {
    public static void main(String[] args) throws Exception {
        int firstParameter = Integer.parseInt(args[0]);
        int secondParameter = Integer.parseInt(args[1]);
        try {
            Counter.count(firstParameter, secondParameter);
        } catch (InvalidParameterException exceptionMessage ){
            System.out.println(exceptionMessage);
        }
    }
}
