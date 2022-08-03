import java.util.Map;
import java.util.Stack;

public class Calculator implements Expression {
    private Expression syntaxTree;

    public Calculator(String expression) {
        Stack<Expression> expressionStack = new Stack<Expression>();

        for (String token : expression.split(" ")) {
            switch (token) {
                case "+":
                    Expression expressionPlus = new Plus(expressionStack.pop(), expressionStack.pop());
                    expressionStack.push(expressionPlus);
                    break;
                case "-":
                    Expression expressionMinus = new Minus(expressionStack.pop(), expressionStack.pop());
                    expressionStack.push(expressionMinus);
                    break;
                case "*":
                    Expression expressionMultiply = new Multiply(expressionStack.pop(),
                            expressionStack.pop());
                    expressionStack.push(expressionMultiply);
                    break;
                case "/":
                    Expression expressionDivide = new Divide(expressionStack.pop(), expressionStack.pop());
                    expressionStack.push(expressionDivide);
                    break;
                default:
                    expressionStack.push(new Variable(token));
                    break;
            }
        }
        syntaxTree = expressionStack.pop();

    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return syntaxTree.interpret(variables);
    }
}
