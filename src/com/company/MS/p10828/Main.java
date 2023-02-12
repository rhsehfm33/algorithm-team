package com.company.MS.p10828;

import java.util.*;
import java.io.*;

// 구현한 스택
class MyStack {
    int[] storage; // stack의 원소들을 저장하는 곳
    int count; // 현재 stack 원소들의 개수

    // len만큼 storage의 공간을 할당해놓음
    public MyStack(int len) {
        this.storage = new int[len];
        this.count = 0;
    }

    // stack에 작은 index부터 원소들을 저장함
    void push(int num) {
        storage[count++] = num;
    }

    // 비어있지 않으면, stack의 큰 index부터 원소들을 반환하고 제거함
    int pop() {
        if (isEmpty() == 1) {
            return -1;
        }
        else {
            return storage[--count];
        }
    }

    // 현재 stack에 저장되어 있는 원소의 개수를 반환
    int size() {
        return count;
    }

    // 현재 스택이 비어있으면 1 아니면 0을 반환
    int isEmpty() {
        return count == 0 ? 1 : 0;
    }

    // 현재 스택이 꽉 차 있지 안하면, 가장 마지막에 삽입된 원소를 반환
    // 꽉 차 있다면, -1을 반환
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
        int N = Reader.nextInt();

        MyStack myStack = new MyStack(N);
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
