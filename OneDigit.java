import java.util.Scanner;
public class OneDigit{
public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number between(1-999):");
        int a=sc.nextInt();
        int result;
        result=getSum(a);
        while(result>9){
            result=getSum(result);
        }
        System.out.println(result);
}

static int getSum(int a){
        int sum=0;
         if(a>9){
            while(a>0){
                int rem=a%10;
                sum=sum+rem;
                a=a/10;
            }
            return sum;
        }
        else{
            return a;
        }
}
}
