import java.util.*;

class Solution {
    public int solution(String S) {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < S.length(); i++) {
            switch (S.charAt(i)) {
                case '(':
                    stack.push(S.charAt(i)); //untuk memasukan character pada string kedalam stack
                    break; //break case
                case ')':
                    if (stack.isEmpty() || stack.peek() != '(') return 0; //mengecheck stack dengan character. Jika stack tidak nested, maka return 0
                    else stack.pop(); //jika stack nested, maka melanjutkan looping
                    break; //break case
            }
        }
        return stack.isEmpty() ? 1 : 0; //jika stack kosong (properly nested), maka return 1. Jika tidak maka return 0 
    }
}
