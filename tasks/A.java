import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class A {
    public static void main(String[] args) {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        String jewels = null;
        try {
            jewels = cin.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Set<Character> j  = new HashSet<>();
        for (char ch : jewels.toCharArray()) {
            j.add(ch);
        }
        String stones = null;
        try {
            stones = cin.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            cin.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        int answer = 0;
        for (char ch : stones.toCharArray()) {
            if (j.contains(ch)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
