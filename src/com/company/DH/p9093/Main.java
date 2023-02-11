package com.company.DH.p9093;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    public static void solve(int testcase) throws IOException {
        //마지막을 구분해주기 위해 받아온 값에 공백을 더함
        String words = Reader.nextLine() + " ";
        Stack<Character> stack = new Stack<>();
        StringBuilder reverseWord = new StringBuilder();

        for (int i = 0; i < words.length(); i++) {
            //입력값을 하나씩 불러와서 공백이 아니면 스택에 푸시 해주고 아니면 StringBuilder에 붙임
            //스택은 LIFO 후입 선출이기 때문에 pop을 하게되면 나중에 들어온걸 먼저 꺼내주기 때문에 글자가 반대로 된다.
            if (!(words.charAt(i) == ' ')) {
                stack.push(words.charAt(i));
            } else {
                while (!stack.isEmpty()) {
                    reverseWord.append(stack.pop());
                }
                reverseWord.append(" ");
            }
        }
        Printer.print(reverseWord);
    }

    public static void solve() throws IOException {

    }

    public static void main(String[] args) throws IOException {
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
