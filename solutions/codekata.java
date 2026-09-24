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