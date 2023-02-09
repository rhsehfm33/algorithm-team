package com.company.JK.p9012;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        Scanner rd = new Scanner(new File("src/com/company/JK/p9012/test.txt"));
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        Solution s = new Solution();
//        int n = rd.nextInt();
        int n = Integer.parseInt(rd.readLine());
//        rd.nextLine();
        for (int i = 0; i < n; i++) {
            String[] arr = rd.readLine().split(""); // scanner : nextLine(), buffered : readLine()
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