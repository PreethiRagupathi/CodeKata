// Problem Statement:
// Given 2 numbers N and M add both the numbers and check whether the sum is odd or even.
//
//
//
//
// Input Description:
// The input consists of two integers, N and M.
//
//
//
//
// Output Description:
// The output is 'odd' if the sum of N and M is odd, and 'even' if the sum is even.
//
//
//
//
// Sample Input:
// 9 2
//
//
//
//
// Sample Output:
// odd

import java.util.Scanner;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N,M;
        N=sc.nextInt();
        M=sc.nextInt();
        if((N+M) % 2 == 0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}