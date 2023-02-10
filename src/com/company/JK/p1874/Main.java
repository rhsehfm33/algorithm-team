package com.company.JK.p1874;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader rd = new BufferedReader(new FileReader("src/com/company/JK/p1874/text.txt"));
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rd.readLine());

        StringBuilder result = new StringBuilder();
        List<Integer> stck = new ArrayList<>();
        int cur = 1;
        boolean flag = true;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(rd.readLine());
            while (cur <= num) {
                stck.add(cur);
                result.append("+");
                cur++;
            }
            if (stck.get(stck.size() - 1) == num) {
                stck.remove(stck.size() - 1);
                result.append("-");
            } else {
                flag = false;
            }
        }
        if (flag) {
            for (String str : result.toString().split("")) {
                System.out.println(str);
            }
        } else {
            System.out.println("NO");
        }
    }
}

