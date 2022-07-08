import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B {
    public static void main(String[] args) {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        int n;
        try {
            n = Integer.parseInt(cin.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int answer = 0;
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            try {
                int c = Integer.parseInt(cin.readLine());
                if (c == 0) {
                    cnt = 0;
                } else {
                    cnt++;
                    answer = Math.max(answer, cnt);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            cin.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(answer);
    }
}
