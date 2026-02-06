import java.util.Scanner;
public class Break{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Upto which Number u want to print to get printed:");
        int n=sc.nextInt();
        int i=1;
        while (i!=0){
            if (i==n){
                break;
            }
            System.out.print(i+" ");
            i++;
        }
    }
}