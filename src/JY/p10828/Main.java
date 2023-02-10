package JY.p10828;

import java.util.*;
import java.io.*;

class Main {
    public static void solve(int testcase) throws IOException {

    }

    public static void solve() throws IOException {
        ArrayList<String> stack = new ArrayList<String>();
        int T = Reader.nextInt(); // testcase
        for (int i=0 ; i<T; i++){

            String input = Reader.nextLine();
            String[] arr = input.split(" ");
            //Printer.println(Arrays.toString(arr));



            switch (arr[0]){
                case "push" :
                    stack.add(arr[1]);
                    break;
                case "pop" :
                    if (stack.size() == 0){
                        Printer.println(-1);
                    }
                    else {
                        Printer.println(stack.get(stack.size()-1));
                        stack.remove(stack.size()-1);
                    }
                    break;
                case "top" :
                    if (stack.size() == 0){
                        Printer.println(-1);
                    }
                    else {
                        Printer.println(stack.get(stack.size()-1));
                    }
                    break;
                case "size" :
                    Printer.println(stack.size());
                    break;
                case "empty":
                    if (stack.size() == 0) {
                        Printer.println(1);
                    }
                    else {
                        Printer.println(0);
                    }
                    break;


            }

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
