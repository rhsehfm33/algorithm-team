package com.company.DH.p9093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

class Main {
    public static void solve(int testcase) throws IOException {
        String words = Reader.nextLine();
        String reverseWord = "";
        for (String str : words.split(" ")) {
            reverseWord += new StringBuilder(str).reverse() + " ";
        }
        Printer.print(reverseWord);
    }

    public static void solve() throws IOException {

    }

    public static void main (String[] args) throws IOException {
        int T = Reader.nextInt();
        for (int testcase = 1; testcase <= T; ++testcase) {
            solve(testcase);
        }
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
