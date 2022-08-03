import java.util.Map;

public class Minus implements Expression {
    Expression left;
    Expression right;

    public Minus(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return right.interpret(variables) - left.interpret(variables);
    }
}
