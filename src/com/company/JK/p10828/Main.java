package com.company.JK.p10828;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner rd = new Scanner(new File("src/com/company/JK/p10828/text.txt"));
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
//        int n = rd.nextInt();
        int n = Integer.parseInt(rd.readLine());

        MyStack mt = new MyStack(n);
//        rd.nextLine();

        for (int i = 0; i <n; i++) {
            String[] str = rd.readLine().split(" "); // Scanner : nextLine(), Buffered : readLine()
            if(str[0].equals("push")){
                mt.push(Integer.parseInt(str[1]));
            } else if (str[0].equals("pop")) {
                System.out.println(mt.pop());
            } else if (str[0].equals("size")) {
                System.out.println(mt.size());
            } else if (str[0].equals("empty")) {
                System.out.println(mt.isEmpty());
            } else {
                System.out.println(mt.top());
            }
        }
    }
}

class MyStack{

    private int[] stk;
    private int capacity;
    private int ptr;

    // 생성자
    public MyStack(int len) {
        ptr = 0;
        capacity = len;
        stk = new int[capacity];
    }


    public int push(int x) {
        if (ptr >= capacity) {
            return -1;
        }
        return stk[ptr++] = x;
    }

    public int pop() {
        if (ptr <= 0) {
            return -1;
        }
        return stk[--ptr];
    }

    public int top() {
        if (ptr <= 0) {
            return -1;
        }
        return stk[ptr - 1];
    }

    public int size() {
        return ptr;
    }

    public int isEmpty() {
        return (ptr <= 0) ? 1 : 0;
    }
}