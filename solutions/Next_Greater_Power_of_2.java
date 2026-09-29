import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int pow=2;
        while(pow <= n){
            pow=pow*2;
        }
        System.out.println(pow);
    }
}