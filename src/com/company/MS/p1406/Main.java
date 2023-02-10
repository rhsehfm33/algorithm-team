package com.company.MS.p1406;

import java.util.*;
import java.io.*;

public class Main {
    public static void solve() throws IOException {
        String str = Reader.next();
        Stack<Character> ls = new Stack<>();
        Stack<Character> rs = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            ls.add(str.charAt(i));
        }

        int M = Reader.nextInt();
        while (M-- > 0) {
            String op = Reader.next();
            if (op.equals("L")) {
                if (ls.size() > 0) {
                    rs.add(ls.peek());
                    ls.pop();
                }
            }
            else if (op.equals("D")) {
                if (rs.size() > 0) {
                    ls.add(rs.peek());
                    rs.pop();
                }
            }
            else if (op.equals("B")) {
                if (ls.size() > 0) {
                    ls.pop();
                }
            }
            else if (op.equals("P")) {
                String ch = Reader.next();
                ls.add(ch.charAt(0));
            }
            else {
                // wrong input. do nothing.
            }
        }

        while (ls.size() > 0) {
            rs.add(ls.peek());
            ls.pop();
        }
        while (rs.size() > 0) {
            Printer.print(rs.peek());
            rs.pop();
        }
        Printer.println();
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
