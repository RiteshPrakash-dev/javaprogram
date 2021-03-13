import java.util.*;

class Calculator
{
    public static void main(String args[])
    {
        int sum,num1,num2;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        sum=num1+num2;
        System.out.println("Sum of num1 and num2: ",sum);
    }
}