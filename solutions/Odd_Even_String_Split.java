// Problem Statement:
// Given a string S, print 2 strings such that first string containing all characters in odd position(s) and other containing all characters in even position(s).
//
//
//
//
// Sample Input:
// XCODE
//
//
//
//
// Sample Output:
// XOE CD

        Scanner sc = new Scanner(System.in);
        str=sc.nextLine();
        char[] arr = str.toCharArray();
        int n=str.length();
        char[] odd=new char[n];
        char[] even=new char[n];
        int ecount=0,ocount=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0){
                even[ecount++]=arr[i];
            }else{
                odd[ocount++]=arr[i];
            }
        }
        String os=new String(odd);
        String oe=new String(even);
        System.out.print(oe+" "+os);
    }
}
str local
String local
StrictMath keyword
String keyword
StringBuffer keyword
StringBuilder keyword
StringIndexOutOfBoundsException keyword
AbstractMethodError keyword
StackTraceElement keyword