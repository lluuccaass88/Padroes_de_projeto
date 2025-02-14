package br.com.cod3r.builder.meal.original.builder;

public class Menu1Builder extends FastFoodMealBuilder {

  @Override
  public void buildDrink() {
    meal.setDrink("Guarana");
  }

  @Override
  public void buildMain() {
    meal.setMain("Pizza");
  }

  @Override
  public void buildSide() {
    meal.setSide("Salada");
  }

  @Override
  public void buildDessert() {
    meal.setDessert("Sorvete");
  }

  @Override
  public void buildGift() {
    meal.setToy("Avenfer's Toy");
  }
}
