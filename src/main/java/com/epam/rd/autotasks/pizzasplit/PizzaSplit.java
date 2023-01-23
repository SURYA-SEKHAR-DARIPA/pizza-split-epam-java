package com.epam.rd.autotasks.pizzasplit;
import java.util.*;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int i=1;
        while(true){
            if((b*i)%a==0){
                System.out.println(i);
                break;
            }
            i++;
        }


    }
}
