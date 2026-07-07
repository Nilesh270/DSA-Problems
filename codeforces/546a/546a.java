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

        // Write solution here
        int k = fs.nextInt();
        int n = fs.nextInt();
        int w = fs.nextInt();

        int moneyReq = 0;
        int i = 1;
        while(i<=w){
            moneyReq += (i*k);
            i++;
        }

        if(moneyReq>n){
            out.println(moneyReq-n);
        }else {
            out.println(0);
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