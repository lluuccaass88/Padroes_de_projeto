package br.com.cod3r.builder.meal.original.builder;

public class FatMealBuilder extends FastFoodMealBuilder{

  @Override
  public void buildDrink() {
    meal.setDrink("Coca Cola");
  }

  @Override
  public void buildMain() {
    meal.setMain("KingBurguerBarbecure");
  }

  @Override
  public void buildSide() {
    meal.setSide("Onion Rings");
  }

  @Override
  public void buildDessert() {
    meal.setDessert("Ice Cream");
  }

  @Override
  public void buildGift() {
    meal.setToy("Toy Car");
  }
}
