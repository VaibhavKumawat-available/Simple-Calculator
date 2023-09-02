import java.util.Scanner;
class Calculator
{
    public static void main(String...args)
    {
       System.out.println("Thnx for using this Calculator");
       System.out.print("Enter the first number: ");
       Scanner scanner = new Scanner(System.in);
       double sum1 = scanner.nextDouble();
       System.out.println(" ");

       System.out.print("Choose the operator (+ , - , * , /): ");
        char operator = scanner.next().charAt(0);
        System.out.println(" ");

       System.out.print("Enter the second number: ");
       double sum2 = scanner.nextDouble();
       System.out.println(" ");

       double res = 0;
       switch(operator)
       {
          case '+':
          res = sum1 + sum2;
          break;
          case '-':
          if(sum1 > sum2)
        {
          res = sum1 - sum2;
          System.out.println(res);
        }
          else if(sum2 > sum1)
          {
             res = -(sum1 - sum2);
             System.out.println(res);
          }
          else
          {
             System.out.println("invalid operator ");
          }
          break;

          case '*' :
           res = sum1 * sum2;
           break;

           case '/' :
           if(sum2 != 0)
           {
             System.out.println(sum1/sum2);
           }
           else 
           {
             System.out.println("can't be defined [Infinity] ");
           }
           break;

           default :
           System.out.println("invalid Operation!! try again");
           scanner.close();
           return;
         } 
