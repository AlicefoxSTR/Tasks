package com.company;
import javax.swing.JOptionPane;

public class TasksPerLine {

        public static void main(String args[])
        {
            //Task2
            String word = JOptionPane.showInputDialog(null, "Input String : ", "Input", JOptionPane.QUESTION_MESSAGE);

            String partWord = "";
            String out="";
            String LongPalindrome = "";

            int size = word.length();
            int  maxWordL=0; //макс длина слова

            boolean compare;

            for(int x=0; x<size; x++) {
                for(int y=x+1; y<=size; y++) {
                    partWord = word.substring(x,y); //возвращает подстроку
                    compare = readingTheWordBackwars(partWord);
                if(compare==true)
                {
                    int wordLength = partWord.length(); //длина слова
                    if(maxWordL<wordLength) //если max длина <  длины текущего слова
                    {
                        maxWordL = wordLength; //текущая длина слова становиться max
                        LongPalindrome = partWord; //макс палиндромом становиться текущее слово
                        out=LongPalindrome;
                    }
                }
            }
            }
            JOptionPane.showMessageDialog(null, "Longest Palindrome : " + out, "Output word", JOptionPane.PLAIN_MESSAGE);
        }

        //Task2
        public static boolean readingTheWordBackwars(String a)
        {
            String reverse = "";
            int tempo = a.length();
            boolean z;
            char symbol;

            for(int i = tempo-1; i>=0; i--)
            {
                symbol = a.charAt(i); //символ из строки
                reverse = reverse + symbol; //формируем строку
            }

            if(a.equalsIgnoreCase(reverse)) //сравниваем без учета регистра
            {
                z=true; //слово явл-ся палидромом
            }
            else {
                z=false;  //слово НЕ явл-ся палидромом
            }
            return(z);
        }

}

