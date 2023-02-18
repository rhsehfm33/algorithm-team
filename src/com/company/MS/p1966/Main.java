package com.company.MS.p1966;

import java.util.*;
import java.io.*;

// queue에 들어 있는 원소 정보
class Pair {
    public int priority; // 원소의 우선 순위
    public int index; // 원소의 원래 index
    public Pair(int priority, int index) {
        this.priority = priority;
        this.index = index;
    }
}

public class Main {
    public static void solve(int testcase) throws IOException {
        int N = Reader.nextInt(); // queue에 있는 원소의 개수
        int M = Reader.nextInt(); // 몇 번째로 출력되는지 알아야하는 원소의 index 값
        int[] priorityToCount = new int[10]; // 특정 우선 순위를 가진 원소의 개수
        Queue<Pair> queue = new LinkedList<>(); // queue

        // 문제의 입력 값 받아와서 queue 세팅, priorityToCount 세팅
        for (int index = 0; index < N; ++index) {
            int priority = Reader.nextInt();

            queue.add(new Pair(priority, index));
            priorityToCount[priority] += 1;
        }

        // 가장 높은 우선 순위부터 체크해나감
        int biggestPriority = 9;
        while (true) {
            while (priorityToCount[biggestPriority] == 0) {
                --biggestPriority;
            }

            Pair curPair = queue.remove();

            // 현재 맨 앞의 queue 원소가 가장 높은 우선순위와 일치하는지 비교
            if (curPair.priority == biggestPriority) {
                --priorityToCount[curPair.priority];
                if (curPair.index == M) {
                    Printer.println(N - queue.size());
                    return;
                }
            }
            else {
                queue.add(curPair);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        int T = Reader.nextInt();
        while (T-- > 0) {
            solve(T);
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
