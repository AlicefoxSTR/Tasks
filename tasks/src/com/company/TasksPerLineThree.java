package com.company;

import javax.swing.*;
import java.util.ArrayList;

public class TasksPerLineThree {
        public static void main(String[] args) {
            //Task3
            String word = JOptionPane.showInputDialog(null, "Input String : ", "Input", JOptionPane.QUESTION_MESSAGE);

            int out;
            out = concativa(word); //вызов функции
            JOptionPane.showMessageDialog(null, "Longest Palindrome : " + out, "Output word", JOptionPane.PLAIN_MESSAGE);
        }

        public static int concativa(String word){
            int size = word.length();
            int k = 0;
            ArrayList<String> al = new ArrayList<String>();

            String partOfTheString = ""; //подстрока
            String result = "";
            for (int i = 0; i<size; i++){
                for (int j = i+1; j <= size; j++){
                    partOfTheString = word.substring(i, j); //вычленяем строку
                    int mid = partOfTheString.length() / 2; //находит половину строки
                    result = partOfTheString.substring(0,mid)+partOfTheString.substring(0,mid);

                    if (result.equalsIgnoreCase(partOfTheString) && !al.contains(result)) {
                        k++;
                        al.add(result);
                    }

                }
            }

            return k;
        }

}
