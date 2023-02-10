package JY.p1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    public static void solve(int testcase) throws IOException {

    }

    public static void solve() throws IOException {


        Stack<String> leftstack = new Stack<String>();
        Stack<String> rightstack = new Stack<String>();

        String first = Reader.nextLine();
        int count = Reader.nextInt();

        Printer.println();
        for (int i = 0; i < first.length(); i++){
            leftstack.add(first.substring(i, i+1));
        }

        // 커맨드 받기.
        for (int i = 0; i < count; i++){
            String command = Reader.next();
            if (command.equals("L")){
                if (leftstack.empty()){
                    continue;
                }
                else{
                    rightstack.add(leftstack.pop());
                }
            }
            else if (command.equals("D")){
                if (rightstack.empty()){
                    continue;
                }
                else{
                    leftstack.add(rightstack.pop());
                }
            }
            else if (command.equals("B")){
                if (leftstack.empty()){
                    continue;
                }
                else{
                    leftstack.pop();
                }
            }
            else if (command.equals("P")){
                String add = Reader.next();
                leftstack.add(add);
            }
        }
        for (int i = 0; i < leftstack.size(); i++){
            System.out.print(leftstack.get(i));
        }
        for (int i = rightstack.size()-1; i >= 0; i--){
            System.out.print(rightstack.get(i));
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
