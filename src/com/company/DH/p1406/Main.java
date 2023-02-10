package com.company.DH.p1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    public static void solve(int testcase) throws IOException {

    }

    public static void solve() throws IOException {
        String inputStr = Reader.nextLine();
        StringBuilder str = new StringBuilder();
        int inputNum = Reader.nextInt();
        Stack<String> stack = new Stack<>();
        Stack<String> stack2 = new Stack<>();

        for (String str2: inputStr.split("")) {
            stack.add(str2);
        }

        for (int i = 0; i < inputNum; i++) {
            String[] operation = Reader.nextLine().split(" ");
            try {
                switch (operation[0]) {
                    case "P":
                        stack.push(operation[1]);
                        break;
                    case "L":
                        stack2.add(stack.pop());
                        break;
                    case "D":
                        stack.add(stack2.pop());
                        break;
                    case "B":
                        stack.pop();
                        break;
                }
            } catch (Exception e) {

            }
        }
        while (!stack2.isEmpty()){
            stack.add(stack2.pop());
        }

        while (!stack.isEmpty()){
            str.append(stack.pop());
        }
        Printer.print(str.reverse());
    }

    public static void main(String[] args) throws IOException {
        //int T = Reader.nextInt();
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
