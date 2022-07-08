import java.io.*;

public class D {

    static char[] data;
    static PrintWriter writer;

    static void calc(int pos, int n, int balance) {
        if (pos == n) {
            if (balance == 0) {
                for (int i = 0; i < n; i++) {
                    writer.print(data[i]);
                }
                writer.println();
            }
            return;
        }

        if (balance <= n - pos) {
            data[pos] = '(';
            calc(pos + 1, n, balance + 1);
        }
        if (balance > 0) {
            data[pos] = ')';
            calc(pos + 1, n, balance - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(cin.readLine());
        cin.close();
        data = new char[2 * n];
        writer = new PrintWriter(System.out);
        calc(0, 2 * n, 0);
        writer.close();

    }
}
