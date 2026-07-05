import java.io.*;
import java.util.*;

public class Main {

    static FastScanner fs = new FastScanner();
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws Exception {

        int t = 1;

        // Uncomment this if the problem has multiple test cases
         t = fs.nextInt();

        while (t-- > 0) {
            solve();
        }

        out.flush();
    }

    static void solve() throws Exception {

        // Write solution here
        String word = fs.next();
        int n = word.length();

        if(n>10){
            out.println("" + word.charAt(0) + (n-2) + word.charAt(n-1));
        }else{
            out.println(word);
        }

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