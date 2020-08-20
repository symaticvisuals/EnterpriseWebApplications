package com.StackQues;

import java.util.Scanner;
import java.util.Stack;

public class Q1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String words[]= str.split(" ");
        for (String word:words) {
            if(word.endsWith("."))
            {
                word=word.substring(0,word.length()-1);
                stack.push(word);
                while (!stack.isEmpty())
                {
                    System.out.print(stack.pop());
                    if(!stack.isEmpty())
                    {
                        System.out.print(" ");
                    }
                    else
                    {
                        System.out.print(". ");
                    }
                }

            }
            else
            {
            stack.push(word);
            }
        }
    }
    
}
