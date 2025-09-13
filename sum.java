import java.util.Scanner;
class Test{
int add(int a, int b)
{
    return a+b;

}};
public class sum {
    public static void main(String args[])
    { int a,b;
        Scanner s= new Scanner(System.in);
        Test t= new Test();
        System.out.print("Enter the first number:");
        a=s.nextInt();
        System.out.print("Enter Second number:");
        b=s.nextInt();
        System.out.println("Sum of both numbers:"+ t.add(a,b));

    }
    };
