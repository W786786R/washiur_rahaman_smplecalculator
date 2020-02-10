package Epam_04_02_2020.simple_calculator;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        
        double first = reader.nextDouble();
        double second = reader.nextDouble();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);
       
		
		
		Calculator ob = new Calculator();
		ob.calculation(first,second,operator);
	}

}
