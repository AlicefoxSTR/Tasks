package com.company;

import javax.swing.*;

public class TasksPerLineOne {
    public static void main(String[] args) {
        //Task1
        String wordOne = JOptionPane.showInputDialog(null, "Input String one : ", "Input", JOptionPane.QUESTION_MESSAGE);
        String wordTwo = JOptionPane.showInputDialog(null, "Input String two : ", "Input", JOptionPane.QUESTION_MESSAGE);

        boolean out;
        out = victory(wordOne, wordTwo); //вызов функции
        JOptionPane.showMessageDialog(null, "Victory : " + out, "Output word", JOptionPane.PLAIN_MESSAGE);
    }
    public static boolean victory(String s1, String s2) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            arr1[s1.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s2.length(); i++) {
            arr2[s2.charAt(i) - 'a']++;
        }

        int count1 = 0;
        int count2 = 0;
        int better = 0;
        int worse = 0;

        for (int i = 0; i < 26; i++) {
            count1 += arr1[i];
            count2 += arr2[i];

            if (count2 > count1) {
                worse++;
            } else if (count1 > count2) {
                better++;
            }
            if (worse > 0 && better > 0)
                return false;
        }
        return true;
    }
}
