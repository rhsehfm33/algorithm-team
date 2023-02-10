package JY.p1874;

import java.util.*;
import java.io.*;

class Main {
    public static void solve(int testcase) throws IOException {

    }

    public static void solve() throws IOException {
        ArrayList<String> answer = new ArrayList<String>();
        int T = Reader.nextInt();
        int[] stack = new int[T];
        int start = 0;
        int index = 0;
        for (int i=0; i<T; i++){
            int input = Reader.nextInt();   // 4

            if (input > start){
                for (int j=start+1; j<=input; j++){
                    stack[index] = j;
                    answer.add("+");
                    index++;
                }
                start = input;
            } else if (stack[index-1] != input) {
                Printer.println("NO");
                return;
            }

            index--;
            answer.add("-");

        }
        for (int i =0; i<answer.size(); i++){
            Printer.println(answer.get(i));
        }

    }

    public static void main (String[] args) throws IOException {
        solve();
        Printer.close();
    }


    static class Reader {
        public static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        public static StringTokenizer st = new StringTokenizer("");

        public static boolean hasNextLine() throws IOException {
            return in.ready();
        }

        public static String nextLine() throws IOException {
            st = new StringTokenizer("");
            return in.readLine();
        }

        public static String next() throws IOException {
            while (!st.hasMoreTokens()) {
                st = new StringTokenizer(in.readLine());
            }
            return st.nextToken();
        }

        public static int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public static long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public static double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
    }

    static class Printer {
        public static PrintWriter out = new PrintWriter(System.out);

        public static void println() {
            out.println();
        }

        public static void println(Object object) {
            out.println(object);
        }

        public static void print(Object object) {
            out.print(object);
        }

        public static void close() throws IOException {
            out.close();
        }
    }
}
