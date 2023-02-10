package com.company.JK.p1406;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
//        BufferedReader rd = new BufferedReader(new FileReader("src/com/company/JK/p1406/text.txt"));
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String str = rd.readLine();
        List<String> leftStck = new ArrayList<>(Arrays.asList(str.split("")));
        List<String> rightStck = new ArrayList<>();

        int n = Integer.parseInt(rd.readLine());

        for (int i = 0; i < n; i++) {
            String[] test = rd.readLine().split(" ");
            switch (test[0]) {
                case "L" :
                    if (leftStck.size() > 0) {
                        rightStck.add(leftStck.get(leftStck.size() - 1));
                        leftStck.remove(leftStck.size() - 1);
                    }
                break;
                case "D":
                    if (rightStck.size() > 0) {
                        leftStck.add(rightStck.get(rightStck.size() - 1));
                        rightStck.remove(rightStck.size() - 1);
                    }
                break;
                case "B" :
                    if (leftStck.size() > 0) {
                        leftStck.remove(leftStck.size() - 1);
                    }
                break;
                default: leftStck.add(test[1]);
            }
        }
        while (rightStck.size() > 0) {
            leftStck.add(rightStck.get(rightStck.size() - 1));
            rightStck.remove(rightStck.size() - 1);
        }

        System.out.println(String.join("", leftStck));
    }
}


