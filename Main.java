public class Main {
    public static void main(String[] args) {
        solution(11011101);
        solution(-100);
        solution(521455130);
        solution(7451000);
    }

    static void solution(int N) {
        int enablePrint = 0;
        int zero = 0; //inisialisasi angka 0
        while (N > 0) {
        	enablePrint = N % 10; //untuk print angka terbalik
        	if (enablePrint == 0 && N % 10 != 1 && zero == 1) { //jika sudah ada angka selain 0 maka bisa print 0
                System.out.print("0"); //print angka 0
            }
            if (enablePrint > 0) {
                System.out.print(enablePrint);
                zero = 1; //memberitahu jika sudah ada angka selain 0
            }
            N /= 10;
        }
        System.out.println();
    }
}
