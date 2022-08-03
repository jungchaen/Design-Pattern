import java.util.Stack;

public class PostfixParser {
    private static int priority(char c) {
        if (c == '*' || c == '/')
            return 2;
        else if (c == '+' || c == '-')
            return 1;
        else
            return 0;
    }

    public static String transform(String syntax) {
        char[] charArray = syntax.toCharArray();
        Stack<Character> stack = new Stack<>();
        String postFix = "";

        for (char c : charArray) {
            if (c == '(')
                stack.push(c);

            else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(')
                    postFix += (char) stack.pop() + " ";

                stack.pop();

            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!stack.isEmpty() && priority((char) stack.peek()) >= priority(c))
                    postFix += (char) stack.pop() + " ";

                stack.push(c);

            } else if (c >= '0' && c <= '9')
                postFix += c + " ";
        }

        while (!stack.isEmpty())
            postFix += (char) stack.pop() + " ";

        return postFix = postFix.trim();
    }
}
