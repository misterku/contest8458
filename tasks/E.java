import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E {


    public static void main(String[] args) throws IOException {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        int[][] arr = new int[2][26];
        for (int i = 0; i < 2; i++) {
            String s = cin.readLine().trim();
            for (char ch : s.toCharArray()) {
                arr[i][ch - 'a']++;
            }
        }
        boolean ok = true;
        for (int i = 0; i < 26; i++) {
            if (arr[0][i] != arr[1][i]) {
                ok = false;
                break;
            }
        }
        System.out.println(ok ? 1 : 0);
    }
}
