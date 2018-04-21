
import java.util.function.DoubleUnaryOperator;

public class functionCalculator implements DoubleUnaryOperator {
    public double applyAsDouble(double operand){
        return Math.sin(operand) / operand ;
    }
}
