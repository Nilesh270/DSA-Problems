import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {

        int t = 1;

        // Uncomment this if the problem has multiple test cases
         t = fs.nextInt();
         int count = 0;
        while (t-- > 0) {
            count += solve();
        }
        out.println(count);
        out.flush();
    }

    static int solve() throws Exception {

        // Write solution here
        int agreed = 0;
        for(int i=0;i<3;i++){
            if(fs.nextInt()==1) agreed++;
        }

        if(agreed>=2) return 1;
        return 0;
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