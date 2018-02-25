package com.github.kadyrova;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader ( new InputStreamReader( System.in));
        String buf = null;
        int num1 = 0, num2 = 0, flag;
        char sym = '3';
        do {
            flag = 0;
            try {
                System.out.println("Введите первое чилсло");
                buf = reader.readLine();
                num1 = Integer.parseInt(buf);
                System.out.println("Введите второе число");
                buf = reader.readLine();
                num2 = Integer.parseInt(buf);
                System.out.println("Введите действие (+, -, *, /, % - остаток от деления");
                buf = reader.readLine();
                sym = buf.charAt(0);
            } catch (NumberFormatException e) {
                System.out.println("Неверный формат");
            } catch (IOException e) {
                e.printStackTrace();
            }
            switch (sym) {
                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    if (num2==0) {
                        System.out.println("Деление на 0");
                        flag = 1;
                    }
                    System.out.println(num1 - num2);
                    break;
                case '*':
                    System.out.println(num1 * num2);
                    break;
                case '/':
                    System.out.println(num1 / num2);
                    break;
                case '%':
                    System.out.println(num1%num2);
                    break;
                default:
                    flag = 1;
                    System.out.println("Неверный формат");
            }
            if (flag!=1){
                System.out.println("Хотите начать заново? yes/no");
                try {
                    buf = reader.readLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                if (buf.equals("yes"))
                    flag = 1;
                else
                    flag = 0;
            }
        }
        while (flag==1);
    }
}
