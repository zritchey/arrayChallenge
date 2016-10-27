package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("How many grades do you have? ");
        int ans= kb.nextInt();
        int grades[]=new int[ans];
        for(int j=0;j<ans;j++) {
            System.out.print("Enter a grade. -1 will break the loop: ");
            int n = -2;

            while (n == -2) {
                n = kb.nextInt();
            }

            if (n==-1)
               break;
            grades[j]=n;
        }

        int sum=0;
        for (int j=0;j<grades.length;j++){
            sum+=grades[j];
        }
        int avg=sum/grades.length;
        System.out.println( "The average grade is: "+avg);

    }
}
