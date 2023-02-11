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


        //스트링을 입력값으로 가져와서 하나씩 자르고 stack에 더합니다.
        for (String str2: inputStr.split("")) {
            stack.add(str2);
        }

        //명령횟수만큼 반복합니다.
        for (int i = 0; i < inputNum; i++) {
            //명령 P때문에 스플릿을 써서 잘라서 배열에 넣어줍니다.
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
        while (!stack.isEmpty()){
            stack2.add(stack.pop());
        }

        while (!stack2.isEmpty()){
            str.append(stack2.pop());
        }
        Printer.print(str);
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
