import java.util.Scanner;
class Test
{
    int a=20;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbers:");
        int a = sc.nextInt();

        if(a>20)
        {
            System.out.println("Number is greater than 20");
        }
        else
        {
            System.out.println("Number is less than 20");
        }
        
    }
}
