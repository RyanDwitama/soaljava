import java.util.*;
public class Main {

	public static void main(String[] args) {
		String S = "John";
		class Solution {
		    public int solution(String S) {
		        Stack<Character> stack = new Stack<Character>();
		        for (int i = 0; i < S.length(); i++) {
		            switch (S.charAt(i)) {
		                case '(':
		                    stack.push(S.charAt(i));
		                    break;
		                case ')':
		                    if (stack.isEmpty() || stack.peek() != '(') return 0;
		                    else stack.pop();
		                    break;
		            }
		        }
		        return stack.isEmpty() ? 1 : 0;
		    }
		}

	}

}
