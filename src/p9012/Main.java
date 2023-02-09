package p9012;

import java.util.*;
import java.io.*;

class Main {
    public static void solve(int testcase) throws IOException {

    }

    public static void solve() throws IOException {
//        int N = Reader.nextInt();
//        String str = Reader.next();
//        double f = Reader.nextDouble();
//
//        Printer.print(N + " " + str + " " + f);

        int T = Reader.nextInt(); // testcase 6
        while (T > 0){
            String str = Reader.nextLine(); // (())(()
            String[] arr = str.split(""); // [ ( ( ) ) ( ( ) ]
            String answer = "";
            int num = 0;
            for (int i =0; i< arr.length; i++){
                if (arr[i].equals("(")){
                    num++;
                }
                else {
                    num--;
                    if (num<0) { answer = "NO"; break; }
                }
            }
            answer = (num == 0) ? "YES" : "NO";
            Printer.println(answer);
            T--;
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