// Problem Statement:
// Given a number N followed by N elements for every 2 consecutive numbers print the maximum of the 2.
//
//
//
//
// Input Description:
// The input consists of an integer N, followed by N elements. N is an integer such that N <= 100000, implying an O(n) time complexity solution is expected.
//
//
//
//
// Output Description:
// The output is a space-separated sequence of the maximums of every two consecutive numbers from the input.
//
//
//
//
// Sample Input:
// 5
// 1 1 3 0 5
//
//
//
//
// Sample Output:
// 1 3 3 5

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int y = 0;
        int[] dup = new int[n - 1]; 
        for(int i = 0; i < n - 1; i++) {
            int j = i + 1; 
            if(arr[i] > arr[j]) { 
                dup[y] = arr[i]; 
            }
            else if(arr[j] > arr[i]) { 
                dup[y] = arr[j]; 
            }
            else { 
                dup[y] = arr[i]; 
            }