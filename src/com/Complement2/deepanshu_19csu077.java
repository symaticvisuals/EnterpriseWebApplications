package com.Complement2;

import java.util.Scanner;

public class deepanshu_19csu077 {
    public static void main(String[] args) {


        System.out.println("-----------Find Complement----------" );
        System.out.println("Press \n1. Binary Number \n2. Decimal number ");
        System.out.print("Enter your Choice : ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1 -> binaryComp(sc);
            case 2 -> decimalComp(sc);
            default -> System.out.println("Invalid Option");
        }
    }


    private static void binaryComp(Scanner sc) {


        System.out.println("Enter the Binary Number : ");

        String number = sc.next();
        char[] digits = number.toCharArray();

        oneComplement(digits);

    }
    private static void decimalComp(Scanner sc) {


        System.out.print("Enter a Decimal no : ");
        int decimal = sc.nextInt();
        String binaryConverted = "";
        int temp = decimal;

        do {
            binaryConverted = binaryConverted + (decimal % 2);
            decimal = decimal/2;
        }while(decimal >= 1);

        //Used this to reverse
        StringBuilder input = new StringBuilder();
        input.append(binaryConverted);
        input = input.reverse();

        System.out.println("\nBinary Number of " + temp + " is " + input);

        String number = String.valueOf(input);
        char[] digits = number.toCharArray();
        oneComplement(digits);
    }


    private static void oneComplement(char[] digits) {

        //To check Valid binary number
        boolean isBinary = false;
        String oneComplement = "";

        if(digits[0] != '0') {

            for (char digit : digits) {

                if (digit == '0') {
                } else if (digit == '1') {
                    isBinary = true;
                } else {
                    System.out.print("Enter Valid Number");
                    isBinary = false;
                    break;
                }
            }
        }else {
            System.out.print("Enter Valid Number");
        }

        if(isBinary) {

            for (char digit : digits) {


                if (digit == '1') {
                    oneComplement = oneComplement + "0";
                } else if (digit == '0') {
                    oneComplement = oneComplement + "1";
                }

            }

            secondComplement(oneComplement);
        }

    }


    private static void secondComplement(String oneComplement) {

        System.out.println("\nOne's Compliment : " + oneComplement);

        char[] secondNumber = oneComplement.toCharArray();

        boolean isCarry = true;
        StringBuilder secondCompliment = new StringBuilder();

        for(int i = secondNumber.length - 1 ; i >= 0; i--) {

            if(secondNumber[i] == '1') {

                if(!isCarry) {
                    secondCompliment.append('1');
                    isCarry = false;
                }else {
                    secondCompliment.append('0');
                    isCarry = true;
                }

            }else if(secondNumber[i] == '0'){

                if(!isCarry) {
                    secondCompliment.append('0');
                    isCarry = false;
                }else {
                    secondCompliment.append('1');
                    isCarry = false;
                }
            }
        }

        StringBuilder input1 = new StringBuilder();


        input1.append(secondCompliment);


        input1 = input1.reverse();


        System.out.println("\n2's Complement : " + input1);
    }

}
