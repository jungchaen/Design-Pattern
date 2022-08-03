import java.util.Map;

public class Divide implements Expression {
    Expression left;
    Expression right;

    public Divide(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return right.interpret(variables) / left.interpret(variables);
    }
}
