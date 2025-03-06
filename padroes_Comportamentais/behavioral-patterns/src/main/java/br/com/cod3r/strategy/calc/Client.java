package br.com.cod3r.strategy.calc;

import br.com.cod3r.strategy.calc.strategy.AdditionOperation;
import br.com.cod3r.strategy.calc.strategy.DivisionOperation;
import br.com.cod3r.strategy.calc.strategy.MultiplicationOperation;
import br.com.cod3r.strategy.calc.strategy.SubtractionOperation;

public class Client {

	public static void main(String[] args) {
    Calculator calc = new Calculator(10, 2);
    System.out.println(calc.getResult(new AdditionOperation()));
    System.out.println(calc.getResult(new SubtractionOperation()));
    System.out.println(calc.getResult(new MultiplicationOperation()));
    System.out.println(calc.getResult(new DivisionOperation()));
	}
}
