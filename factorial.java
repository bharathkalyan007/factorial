import java.util.Scanner;

public class factorial {
    public int recurfac(int n){
        if(n==0)
            return 1;
        else
            return(n*recurfac(n-1));
    }
    public static void main(String[] args){
        System.out.println("Factorial of a Number:");
        factorial f=new factorial();
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int a=f.recurfac(x);
        System.out.println("Result:: "+ a);
    }
}
