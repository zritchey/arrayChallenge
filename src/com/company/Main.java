package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.println("Enter all student names, separated by commas. ");
        String ans1=kb.nextLine();
        String student[]=ans1.split(",");
        int []gradebook[]=new int[student.length][];
        for (int j2=0;j2<student.length;j2++) {
            System.out.println("How many grades do you have for "+student[j2]+" ? ");
            int ans = kb.nextInt();
            int grades[] = new int[ans];
            for (int j = 0; j < ans; j++) {
                System.out.print("Enter a grade. -1 will break the loop: ");
                int n = -2;

                while (n == -2) {
                    n = kb.nextInt();
                }

                if (n == -1) {
                    gradebook[j2] = grades;
                    break;
                }
                grades[j] = n;
            }
        }









        int sum[]=new int[gradebook.length];
        int gradenum=0;
        for(int j=0;j<gradebook.length;j++){
            int store[]=gradebook[j];
            gradenum+=store.length;
        }
        int book[]=new int[gradenum];
        for(int j2=0;j2<gradebook.length;j2++) {
             book=gradebook[j2];
            for (int j=0;j<book.length;j++){
                book[j]=gradebook[j2][j];
            }
            for (int j = 0; j < book.length; j++) {
                sum[j2] += book[j];
            }
        }
        int avg[]=new int [sum.length];
        for(int j=0;j<avg.length;j++){
            avg[j]=sum[j]/gradebook[j].length;
        }
        int sum2=0;

        for(int j=0; j<sum.length;j++){
            sum2+=sum[j];
        }
        int avg2=sum2/gradenum;
        System.out.println( "The average grade for the class is: "+avg2+"\n");
        System.out.println("Individual Averages: \n");
        for(int j=0;j<gradebook.length;j++){
            System.out.print(student[j]+": "+avg[j]);
        }

    }
}
