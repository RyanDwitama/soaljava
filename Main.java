public class Main {
    public static void main(String[] args) {
        solution(11011101);
        solution(-100);
        solution(521455130);
        solution(7451000);
    }

    static void solution(int N) {
        int enablePrint = 0;
        int zero = 0;
        while (N > 0) {
        	enablePrint = N % 10;
        	if (enablePrint == 0 && N % 10 != 1 && zero == 1) {
                System.out.print("0");
            }
            if (enablePrint > 0) {
                System.out.print(enablePrint);
                zero = 1;
            }
            N /= 10;
        }
        System.out.println();
    }
}
