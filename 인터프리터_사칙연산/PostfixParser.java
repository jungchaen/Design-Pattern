import java.util.Stack;

public class PostfixParser {
    private static int priority(String str) {
        if (str.equals(new String("*")) || str.equals(new String("/")))
            return 2;
        if (str.equals("+") || str.equals(new String("-")))
            return 1;
        return 0;
    }

    public static String reversePolish(String syntax) {
        char[] charArray = syntax.toCharArray();
        Stack<String> stack = new Stack<>();
        String postFix = "";
        String temp = "";

        for (char c : charArray) {
            if (c == '(') {
                stack.push(String.valueOf(c));

                if (temp != "") {
                    postFix += temp + " ";
                    temp = "";
                }
            } else if (c == ')') {
                if (temp != "") {
                    postFix += temp + " ";
                    temp = "";
                }
                while (!stack.isEmpty() && !stack.peek().equals(new String("("))) {
                    postFix += stack.pop() + " ";
                }

                if (!stack.empty()) {
                    stack.pop();
                }
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                if (temp != null) {
                    postFix += temp + " ";
                    temp = "";
                }
                while (!stack.isEmpty() && priority(stack.peek()) >= priority(String.valueOf(c))) {
                    postFix += stack.pop() + " ";
                }
                stack.push(String.valueOf(c));
            } else if (c >= '0' && c <= '9') {
                temp += c;
            }
        }
        if (temp != "") {
            postFix += temp + " ";
        }

        while (!stack.isEmpty())
            postFix += stack.pop() + " ";

        return postFix = postFix.trim();
    }
}
