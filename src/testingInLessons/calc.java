package testingInLessons;

import java.util.Scanner;

public class calc
{
private static Scanner scan;

public static void main(String args[])
{
    float a, b, res;
    char select = 0;
    scan = new Scanner(System.in);

	do
    {
		System.out.println("\n");
        System.out.print("(1) Addition\n");
        System.out.print("(2) Subtraction\n");
        System.out.print("(3) Multiplication\n");
        System.out.print("(4) Division\n");
        System.out.print("(5) Exit\n\n");
        System.out.print("Enter Your Choice : ");
        select = scan.next().charAt(0);

        switch(select)
        {
            case '1' : 
            	System.out.print("Enter first number : \n");
                a = scan.nextFloat();
                System.out.println("Enter second number : ");
                b = scan.nextFloat();
                res = a + b;
                System.out.print("Result = " + res);
                break;
            case '2' : 
            	System.out.print("Enter first number : \n");
                a = scan.nextFloat();
                System.out.println("Enter second number : ");
                b = scan.nextFloat();
                res = a - b;
                System.out.print("Result = " + res);
                break;
            case '3' : 
            	System.out.print("Enter first number : \n");
                a = scan.nextFloat();
                System.out.println("Enter second number : ");
                b = scan.nextFloat();
                res = a * b;
                System.out.print("Result = " + res);
                break;
            case '4' : 
            	System.out.print("Enter first number : \n");
                a = scan.nextFloat();
                System.out.println("Enter second number : ");
                b = scan.nextFloat();
                res = a / b;
                System.out.print("Result = " + res);
                break;
            case '5' : 
            	System.exit(0);
                break;
            default : 
            	System.out.print("Wrong Choice!!!");
        }
    }
	while(select != 5);       
}
}
