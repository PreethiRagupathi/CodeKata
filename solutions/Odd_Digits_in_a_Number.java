// Problem Statement:
// Given a number N, print the odd digits in the number(space seperated) or print -1 if there is no odd digit in the given number.
//
//
//
//
// Input Description:
// The input consists of a single integer N, where N <= 100000.
//
//
//
//
// Output Description:
// The output should be the odd digits of N, space-separated, or -1 if no odd digits are present.
//
//
//
//
// Sample Input:
// 2143
//
//
//
//
// Sample Output:
// 1 3

            if(digit%2!=0)
            {
                System.out.print(digit+" ");
                founded=false;
            }
            
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        odd(N);
        if(founded)
            System.out.println("-1");
    }
}
static local
InstantiationException keyword
UnsupportedOperationException keyword