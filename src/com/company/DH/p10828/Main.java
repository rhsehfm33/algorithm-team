package com.company.DH.p10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    public static void solve(int testcase) throws IOException {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < testcase; i++) {
            String words = Reader.nextLine();
            String[] word = words.split(" ");
            try {
                switch (word[0]) {
                    case "push":
                        stack.push(Integer.parseInt(word[1]));
                        break;
                    case "pop":
                        System.out.println(stack.pop());
                        //Printer.print(stack.pop());
                        break;
                    case "top":
                        System.out.println(stack.get(stack.size() - 1));
                        //Printer.print(stack.get(stack.size()-1));
                        break;
                    case "size":
                        System.out.println(stack.size());
                        // Printer.print(stack.size());
                        break;
                    case "empty":
                        System.out.println(stack.isEmpty() ? 1 : 0);
                        // Printer.print(stack.isEmpty());
                        break;
                }
            } catch (Exception e) {
                System.out.println(-1);
                // Printer.print(-1);
            }
        }
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
