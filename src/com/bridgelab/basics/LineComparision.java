package com.bridgelab.basics;
import java.util.Scanner;
import java.lang.*;
public class LineComparision {
        public static void main(String[] args) {
                System.out.println("Welcome to Line Comparison Computation Program!");
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter a Point x1");
                int x1= sc.nextInt();
                System.out.println("Enter a Point y1");
                int y1= sc.nextInt();
                System.out.println("Enter a Point x2");
                int x2= sc.nextInt();
                System.out.println("Enter a Point y2");
                int y2= sc.nextInt();
                String length1 = String.valueOf(Math.sqrt((Math.pow((x2-x1),2))+ (Math.pow((y2 -y1),2))));
                System.out.println("length1 =>"+length1);
                System.out.println("Enter a Point x3");
                int x3= sc.nextInt();
                System.out.println("Enter a Point y3");
                int y3= sc.nextInt();
                System.out.println("Enter a Point x4");
                int x4= sc.nextInt();
                System.out.println("Enter a Point y4");
                int y4= sc.nextInt();
                String length2 = String.valueOf(Math.sqrt((Math.pow((x4-x3),2))+(Math.pow((y4-y3),2))));
                System.out.println("Length of 2nd Line is =>"+length2);
                int result = length2.compareTo(length1);
                if(result == 0){
                        System.out.println("Both Lines are Equal !");
                }
                else if(result>0){
                        System.out.println("Length of 1st Lines is Greater than 2nd Line!");
                }else {
                        System.out.println("Length of 2nd Line is Greater than 1st Line");
                }
        }
    }
