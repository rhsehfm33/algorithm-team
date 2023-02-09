package com.company.MS.p10828;

import java.util.*;
import java.io.*;

class MyStack {
    int[] storage;
    int cap;
    int count;

    public MyStack() {
        this.cap = 10004;
        this.count = 0;
        this.storage = new int[cap];
    }

    void push(int num) {
        storage[count++] = num;
    }

    int pop() {
        if (isEmpty() == 1) {
            return -1;
        }
        else {
            return storage[--count];
        }
    }

    int size() {
        return count;
    }

    int isEmpty() {
        return count == 0 ? 1 : 0;
    }

    int top() {
        if (isEmpty() == 1) {
            return -1;
        }
        else {
            return storage[count - 1];
        }
    }
}

class Main {
    public static void solve() throws IOException {
        MyStack myStack = new MyStack();

        int N = Reader.nextInt();
        while (N-- > 0) {
            String operation = Reader.next();
            switch (operation) {
                case "push":
                    myStack.push(Reader.nextInt()); break;
                case "pop":
                    Printer.println(myStack.pop()); break;
                case "size":
                    Printer.println(myStack.size()); break;
                case "empty":
                    Printer.println(myStack.isEmpty()); break;
                case "top":
                    Printer.println(myStack.top()); break;
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
