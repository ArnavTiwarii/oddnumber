import java.util.Scanner;

public class oddnumbers
{
    public static void main(String []args)
    {
        int sum=0;
        int arr[]=new int[5];
        Scanner sc =new Scanner(System.in);
        for(int i =0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            if (arr[i] % 2 == 1)
            {
                sum = sum + arr[i];
            }
        }
        if(sum>8 && sum<50)
        {
            System.out.println(sum);
        }
        else
        {
            System.out.println("NA");
        }
    }
}
