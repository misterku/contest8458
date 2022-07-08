import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class C {
    public static void main(String[] args) throws IOException {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        int n;
        try {
            n = Integer.parseInt(cin.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        if (n == 0) {
            return;
        }
        int first = Integer.parseInt(cin.readLine());
        System.out.println(first);
        for (int i = 1; i < n; i++) {
            int c = Integer.parseInt(cin.readLine());
            if (c != first) {
                System.out.println(c);
                first = c;
            }
        }
        try {
            cin.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
