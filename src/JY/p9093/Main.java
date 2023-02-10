package JY.p9093;

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

        int T = Reader.nextInt(); // testcase

        //String str = Reader.next();
        //String[] strarr = str.split(" ");
        //Printer.println(strarr[1]);
        while (T>0){
            String input = Reader.nextLine(); //input sentence
            String[] str = input.split(" ");
            //Printer.print(Arrays.toString(str));
            String answer = "";
            for (int i=0; i< str.length; i++){
                String reverse = "";
                for (int j=str[i].length()-1; j>=0; j--){
                    reverse += str[i].charAt(j);
                }
                answer += reverse+" ";
            }
            Printer.println(answer);
            T -= 1;
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