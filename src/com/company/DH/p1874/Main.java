package com.company.DH.p1874;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    public static void solve(int testcase) throws IOException {
        StringBuilder str = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        int temp = 1;

        for (int i = 0; i < testcase; i++) {
            int inputNum = Reader.nextInt();
            for (; temp <= inputNum; temp++) {
                str.append("+").append("\n");
                stack.add(temp);
            }
            if(stack.peek() == inputNum){
                stack.pop();
                str.append("-").append("\n");
            }
            else {
                str = new StringBuilder("NO");
                break;
            }
        }

        Printer.print(str);
    }

    public static void solve() throws IOException {

    }

    public static void main(String[] args) throws IOException {
        int T = Reader.nextInt();
        solve(T);

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
