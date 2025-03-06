package br.com.cod3r.strategy.calc.strategy;

public class AdditionOperation implements OperationStrategy{

  @Override
  public int calculate(int num1, int num2) {
    return num1 + num2;
  }

}
