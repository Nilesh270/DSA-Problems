import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {

        int t = 1;

//        t = fs.nextInt();

        while (t-- > 0) {
            solve();
        }

        out.flush();
    }

    static void solve() throws Exception {
        int n = fs.nextInt();
        double ans = 0.0;

        for(int i=0;i<n;i++){
            ans += (double) fs.nextInt()/n ;
        }

        out.printf("%.12f%n", ans);
    }



    // ===================== Fast Scanner =====================

    static class FastScanner {

        private final BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        private StringTokenizer st;

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        String nextLine() throws IOException {
            return br.readLine();
        }
    }

}