package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    static int sum(int a, int b){
        return a+b;
    }


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


// Math class in Java

        int num9 = 4, num10 = 7;
        System.out.println(Math.max(num9,num10));
        System.out.println(Math.min(num9,num10));
        System.out.println(Math.sqrt(36));
        System.out.println(Math.abs(-36));
        System.out.println(Math.random());
        System.out.println(4+(8-4)*Math.random());
        System.out.println(6+(10-6)*Math.random());

        // If - Else Condition statement in java

        Scanner Scan1 = new Scanner(System.in);
        System.out.println("enter the age");
        int age = Scan1.nextInt();
        System.out.println(age);

        if (age>20) {
            System.out.println("you are an adult");
        }
            else if (age>5){
                System.out.println("you are not a kid");
        }
        else {
            System.out.println("you are a kid");
        }

        switch (age){
            case 12:
                System.out.println("you are 12 years old");
                break;
            case 56:
                System.out.println("you are 56 years old");
                break;
            case 16:
                System.out.println("you are 16 years old");
                break;
            default:
                System.out.println("you did not match any of the cases");
 }


        // Quiz Question
        Scanner Scan2 = new Scanner(System.in);
        System.out.println("enter the weekdays numbers");
        int weekdays = Scan2.nextInt();
        System.out.println(weekdays);

        switch (weekdays){
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            case 5:
                System.out.println("Today is Thursday");
                break;
            case 6:
                System.out.println("Today is Friday");
                break;
            case 7:
                System.out.println("Today is Saturday");
                break;
                default:
                System.out.println("you did not match any of the cases");
 }

        // Loops statement in java

       int i = 0;
        while(i<=100){
            System.out.println(i);
            i +=1;
        }


        int j = 0;
        do {
            System.out.println(j);
            j +=1;
        }while(j<100);


        for (int z=0;z<10;z++) {
            System.out.println(z);
        }
        //Break and Continue statements
        for (int i=0;i<10;i++) {
            System.out.println(i);
            break;
        }


        // Arrays in Java
        int [] marks = {1,2,3,5};
        marks[2] = 34; // this will update i value
        System.out.println(marks[0]);
        System.out.println(marks[2]);
        // classical way to iterate an array
        for (int i=0;i< marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("This is for each Loop");
        // for each loop
        for(int value:marks){
            System.out.println(value);
        }
        //Two dimensional array
        int [][] matrix = {{1,2,3},{4,5,6}};
        System.out.println(matrix[1][0]);

        // string array

        String [] cars = {"Maruti", "Innova", "BMW", "audi", "Fortuner"};
        for(String value: cars) {
            System.out.println(value);
        }

   //Try - Catch in Java

        String [] cars = {"Maruti", "Innova", "BMW", "audi", "Fortuner"};
        try {
            System.out.println(cars[5]);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        System.out.println("masoom");

        // calling sum method

       //  System.out.println(sum(a:6 , b:7));

    // Java Project Calculator

        float number_1, number_2;
        System.out.println("enter first number");
        Scanner scan = new Scanner(System.in);
        number_1 = scan.nextFloat();
        System.out.println("enter second number");
        Scanner scan2 = new Scanner(System.in);
        number_2 = scan.nextFloat();
        System.out.println(number_1);
        System.out.println(number_2);

        String prompt = "Enter 0 for Addition, 1 for Subtraction, 2 for Multiplication, 3 for Division";
        System.out.println(prompt);
        int input1 = scan.nextInt();
        switch (input1){
            case 0:
                System.out.println("Add these numbers");
                System.out.println("the result is :");
                System.out.println(number_1 + number_2);
                break;

            case 1:
                System.out.println("Subtract these numbers");
                System.out.println("the result is :");
                System.out.println(number_1 - number_2);
                break;

            case 2:
                System.out.println("Multiply these numbers");
                System.out.println("the result is :");
                System.out.println(number_1 * number_2);
                break;

            case 3:
                System.out.println("Divide these numbers");
                System.out.println("the result is :");
                System.out.println(number_1 / number_2);
                break;
            default:
                System.out.println("Invalid input");
        }









    }
}
