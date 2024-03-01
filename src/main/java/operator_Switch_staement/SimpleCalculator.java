package operator_Switch_staement;
import java.util.*;

public class SimpleCalculator {

    public void calculator(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number");
        double num1 = sc.nextDouble();

        System.out.println("Enter operator(+,-,*,%,/,&,|,^,~,<<,>>,<<<,>>>");
        char operator = sc.next().charAt(0);

        double result = 0;

        System.out.println("Enter a second number");
        double num2 = sc.nextDouble();

        switch(operator){
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
               if(num2 !=0){
                   result = num1/num2;
               }
               else{
                   System.out.println("Error: Divison by zero!");
                   return;
               }
               break;

            case '%':
                result = num1 % num2;
                break;



        }
        System.out.println(result);

        sc.close();

    }

    public static void main(String[] args) {
        SimpleCalculator c = new SimpleCalculator();
        c.calculator();
    }

}
