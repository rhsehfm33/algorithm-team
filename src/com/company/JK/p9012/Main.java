package com.company.JK.p9012;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new FileReader("src/com/company/JK/p9012/test.txt"));
//        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        Solution s = new Solution();
        int n = Integer.parseInt(rd.readLine());
        for (int i = 0; i < n; i++) {
            String[] arr = rd.readLine().split("");
            System.out.println(s.solution(arr));
        }
    }
}

class Solution {
    public String solution(String[] arr) {
        List<String> stck = new ArrayList<>();
        for (String str : arr) {
            if (str.equals("(")) {
                stck.add(str);
//                System.out.println(stck);
            } else {
                if (stck.isEmpty()) {
                    return "NO";
                }else{
                    stck.remove(stck.size()-1);
//                    System.out.println(stck);
                }
            }
        }
        if (stck.size() > 0) {
//            System.out.println("last" + stck);
            return "NO";
        }
        return "YES";
    }

}