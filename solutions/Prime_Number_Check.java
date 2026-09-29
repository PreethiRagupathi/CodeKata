// Problem Statement:
// Given a number N, check whether it is prime or not. Print 'yes' if it is prime else print 'no'.
//
//
//
//
// Input Description:
// The input consists of a single integer N.
//
//
//
//
// Output Description:
// The output is 'yes' if N is prime, otherwise 'no'.
//
//
//
//
// Sample Input:
// 123
//
//
//
//
// Sample Output:
// no

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        boolean test =true;
        if(n<=1){
            test=false;
            System.out.println("no");
        }else{
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                test=false;
                break;
            }
        }
        }
        if(test)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
no local
NoClassDefFoundError keyword
NoSuchFieldError keyword
NoSuchFieldException keyword
NoSuchMethodError keyword
NoSuchMethodException keyword
UnknownError keyword
NullPointerException keyword
TypeNotPresentException keyword