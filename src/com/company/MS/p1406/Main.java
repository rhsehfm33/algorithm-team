package com.company.MS.p1406;

import java.util.*;
import java.io.*;

public class Main {
    public static void solve() throws IOException {
        String str = Reader.next(); // 문자열을 입력 받음
        Stack<Character> leftStack = new Stack<>(); // 커서를 기준으로 왼쪽에 있는 문자를 담을 stack
        Stack<Character> rightStack = new Stack<>(); // 커서를 기준으로 오른쪽에 있는 문자를 담을 stack
        for (int i = 0; i < str.length(); i++) {
            leftStack.add(str.charAt(i)); // 입력받은 String을 0번째 인덱스의 문자부터 하나씩 leftStack에 push
        }

        int M = Reader.nextInt(); // 처리할 명령어의 개수를 입렫받음
        while (M-- > 0) {
            String op = Reader.next();
            if (op.equals("L")) { // 커서를 왼쪽으로 움직이는 명령어
                // leftStack의 top에 있는 원소가 커서를 기준으로 가장 오른쪽에 있는 원소임
                // 고로, 커서 왼쪽에 문자가 하나라도 있을 시, pop
                if (leftStack.size() > 0) {
                    rightStack.add(leftStack.pop());
                }
            } else if (op.equals("D")) { // 커서를 오른쪽으로 움직이는 명령어
                if (rightStack.size() > 0) {
                    // leftStack의 top을 rightStack의 top으로 이동시킴
                    // 그러면, rightStack의 top은 커서를 기준으로 가장 왼쪽에 있는 문자열이 됨
                    leftStack.add(rightStack.pop());
                }
            } else if (op.equals("B")) { // 커서 왼쪽에 있는 문자를 지움
                // leftStack의 top을 제거하면 됨. pop()으로 가능
                if (leftStack.size() > 0) {
                    leftStack.pop();
                }
            } else if (op.equals("P")) {  // 커서 왼쪽에 문자를 삽입함
                // leftStack에 입렫 받은 문자 push
                String ch = Reader.next();
                leftStack.add(ch.charAt(0));
            }
        }

        // leftStack에 있는 문자를 top에서 부터 rightStack으로 옮김
        // 이 동작은 커서를 커서를 가장 왼쪽으로 움직이는 동작과 동일
        // 아래 반복문이 끝나면, rightStack의 top부터 bottom까지는 가장 왼쪽에 있는 문자부터 가장 오른쪽에 있는 문자가 됨
        while (leftStack.size() > 0) {
            rightStack.add(leftStack.pop());
        }

        // rightStack을 top부터 그대로 출력
        while (rightStack.size() > 0) {
            Printer.print(rightStack.pop());
        }
        Printer.println();
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
