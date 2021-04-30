package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //first program
        System.out.println("hello World");
        System.out.println("My first java program");
        //Variables
        // syntax of declaring variables, int, char, float, boolean, string
        int a = 6;
        int b = 5;
       int  c = a +b ;
        System.out.println(c);
        String name1 = "Rizwan";
        System.out.println(name1);
        float k = 45.22f;
        boolean isadult = true;
        System.out.println(k);
        System.out.println(isadult);

        /* Rules for constructing names of variables in Java
          should begin with letter, $ and _
          you cannot use reserved words like string....
       */
/*
two types of data types in java
1) primitive -- Byte(1byte), short(2bytes), int(4bytes), long(8bytes), float(4bytes), double(8bytes), boolean(1bit), char(2bytes).
2) non-primitive --
 */

      byte  u = 56;
      double d = 48.6754323d;
        System.out.println(u);
        System.out.println(d);
        char grade = 'A';
        System.out.println(grade);

        /* Operators in Java
          operand, operator, operand = result
          4           +        7     =  11
Types of operator
         1) Arithmetic operator
         2) Assignment operator
         3) Logical operator
         4) comparison operator
         */
        int num1 = 45, num2 = 56;
        num1 +=3;
        num2 +=14;
        System.out.print("The value of num1 + num2 is:");
        System.out.println(num1+num2);
        System.out.print("The value of num1 - num2 is:");
        System.out.println(num1-num2);
        System.out.print("The value of num1 * num2 is:");
        System.out.println(num1*num2);
        System.out.print("The value of num1 / num2 is:");
        System.out.println(num1/num2);
        System.out.print("The value of num1 % num2 is:");
        System.out.println(num1++);
        System.out.println(++num1);
        System.out.println(num1--);
        System.out.println(--num1);
        /*comparison operators
          1) == , != , < , > , <= , >=  --
         */
        /* Logical Operators
         1) && , || , ! ---
         */
        //Taking user input in java (string)
        Scanner Scan = new Scanner(System.in);
        System.out.println("enter data");
        String input = Scan.nextLine();
        System.out.println(input);
// String Methods
        String name = "Salman";
        String industry = "Bollywood";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name + "from" + industry);
        // escape sequence characters
        System.out.println(name + "from\" " + industry);
        System.out.println(name + "from\t " + industry);
        System.out.println(name + "from\\ " + industry);
        System.out.println(name + "from\n " + industry);

        System.out.println(name.contains("Rizw"));
        System.out.println(name.charAt(2));
        System.out.println(name.endsWith("an"));
        System.out.println(name.indexOf("ma"));


    }
}
