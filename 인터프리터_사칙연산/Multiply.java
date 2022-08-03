import java.util.Map;

public class Multiply implements Expression {
    Expression left;
    Expression right;

    public Multiply(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return right.interpret(variables) * left.interpret(variables);
    }
}
