// Problem Statement:
// Given a number N, print yes if the number is a multiple of 7 else print no.
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
// Print 'yes' if N is a multiple of 7, otherwise print 'no'.
//
//
//
//
// Sample Input:
// 49
//
//
//
//
// Sample Output:
// yes

import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N;
        N=sc.nextInt();
        if((N%7)==0)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}