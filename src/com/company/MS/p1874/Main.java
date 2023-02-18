package com.company.MS.p1874;

import java.io.*;
import java.util.*;

class Main {
    public static void solve() throws IOException {
        StringBuilder sb = new StringBuilder();

        int n = Reader.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0, front = 1; i < n; ++i) {
            int cur = Reader.nextInt();
            if (stack.size() > 0 && stack.peek() > cur) {
                Printer.println("NO");
                return;
            }
            while (front <= cur) {
                sb.append("+\n");
                stack.push(front++);
            }
            sb.append("-\n");
            stack.pop();
        }

        Printer.print(sb);
    }

    public static void main(String[] args) throws IOException {
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
