import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class F {

    static Point[] cities;
    static int[] used;

    static int n;

    static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean allowed(Point other, int k) {
            long d = Math.abs(this.x - other.x);
            d += Math.abs(this.y - other.y);
            return d <= k;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(cin.readLine());
        cities = new Point[n];
        used = new int[n];
        for (int i = 0; i < n; i++) {
            String[] s = cin.readLine().trim().split(" ");
            cities[i] = new Point(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
        }
        Arrays.fill(used, -1);
        int k = Integer.parseInt(cin.readLine());
        String[] s = cin.readLine().trim().split(" ");
        System.out.println(bfs(Integer.parseInt(s[0]) - 1, Integer.parseInt(s[1]) - 1, k));

    }

    private static int bfs(int v, int w, int k) {
        used[v] = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(v);
        while (!q.isEmpty()) {
            int f = q.poll();
            for (int i = 0; i < n; i++) {
                if (cities[f].allowed(cities[i], k) && used[i] == -1) {
                    q.add(i);
                    used[i] = used[f] + 1;
                }
            }
        }
        return used[w];
    }
}
