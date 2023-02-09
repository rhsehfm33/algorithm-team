package com.company.JK.p9093;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner rd = new Scanner(new File("src/com/company/JK/p9093/text.txt"));
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        Solution s = new Solution();
//        int n = rd.nextInt();
        int n = Integer.parseInt(rd.readLine());
//        rd.nextLine();
        for (int i = 0; i < n; i++) {
            String str = rd.readLine();
            System.out.println(s.solution(str));
        }
    }
}


class Solution {
    public String solution(String str) {
        str += " ";
        StringBuilder sb = new StringBuilder();
        List<String> stck = new ArrayList<>();
        for (String s : str.split("")) {
            if (s.equals(" ")) {
                while (stck.size() > 0) {
                    sb.append(stck.get(stck.size() - 1));
                    stck.remove(stck.size() - 1);
                }
                sb.append(" ");
            } else {
                stck.add(s);
            }
        }
        return sb.toString();
    }
}