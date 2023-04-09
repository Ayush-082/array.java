// Write a Java program to find how  many times a  digit occurs
import java.util.Scanner;
public class arry{
    public static void main(String[] args)
    {
        int i;
        Scanner in=new Scanner(System.in);
        int[]arr=new int[7];
        System.out.println("enter the values of an arry");
        for(i=0;i<7;i++)
        {
            arr[i]=in.nextInt();
        }
        for(i=0;i<7;i++)
        {
           int count=0;
            for(int j=0;j<7;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            System.out.println("element"+" "+arr[i]+"occured :");
            System.out.println(count+" "+"times");
        }
    }
}
