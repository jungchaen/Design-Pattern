import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static boolean isNumber(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("구문을 입력하세요: ");
        String syntax = sc.next();
        sc.close();

        String postfix = PostfixParser.transform(syntax); // postfix로 전처리
        System.out.println("postfix: " + postfix.replaceAll(" ", ""));

        Calculator expression = new Calculator(postfix);
        Map<String, Expression> variables = new HashMap<>();

        String[] splitPostfix = postfix.split(" "); // 공백 단위로 쪼개서 String형 배열을 만듦

        for (int i = 0; i < splitPostfix.length - 1; i++) { // 숫자를 HashMap에 put
            if (isNumber(splitPostfix[i])) {
                variables.put(splitPostfix[i], new Number(Integer.parseInt(splitPostfix[i])));
            }
        }

        int result = expression.interpret(variables);
        System.out.println("결과: " + result);
    }
}
