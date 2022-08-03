import java.util.Map;

public class Variable implements Expression { // 문자
    private String variable;

    public Variable(String variable) {
        this.variable = variable;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        if (variables.get(variable) == null)
            return 0;
        return variables.get(variable).interpret(variables);
    }
}
