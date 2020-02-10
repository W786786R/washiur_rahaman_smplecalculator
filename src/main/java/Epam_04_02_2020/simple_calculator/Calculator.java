package Epam_04_02_2020.simple_calculator;

import java.util.Scanner;
public class Calculator {
    public void calculation(double x,double y,char operator)
    {
    	double first = 0;
		first=x;
    	double second = 0;
		second=y;
    	 double result;
        
		switch(operator)
        {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            // operator doesn't match any case constant (+, -, *, /)
            default:
                System.out.printf("Error! operator is not correct");
                return;
        }
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}